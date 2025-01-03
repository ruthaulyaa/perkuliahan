/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graph_11S20018;
import java.util.*;
import java.io.*;
import java.util.PriorityQueue;

/**
 *
 * @author 11S20018
 */

// Represents a vertex in the graph.
class Vertex{
    public String     name;   // Vertex name
    public List<Edge> adj;    // Adjacent vertices
    public double     dist;   // Cost
    public Vertex     prev;   // Previous vertex on shortest path
    public int        scratch;// Extra variable used in algorithm

    public Vertex(String nm){ 
        name = nm; 
        adj = new LinkedList<Edge>(); 
        reset(); 
    }

    public void reset(){ 
        dist = Graph_11S20018.INFINITY; 
        prev = null; 
        scratch = 0; 
    }    
}

// Represents an edge in the graph.
class Edge{
    public Vertex dest;
    public double cost;
    
    public Edge(Vertex d, double c){
        dest = d;
        cost = c;
    }
}

// Represents an entry in the priority queue for Dijkstra's algorithm.
class Path implements Comparable<Path>{
    public Vertex dest;
    public double cost;
    
    public Path(Vertex d, double c){
        dest = d;
        cost = c;
    }
    
    @Override
    public int compareTo(Path rhs){
        
        double otherCost = rhs.cost;
        
        return cost < otherCost ? -1 : cost > otherCost ? 1 : 0;
    }
}

public class Graph_11S20018{
    private Map<String, Vertex> vertexMap = new HashMap<String, Vertex>();   
    public static final double INFINITY = Double.MAX_VALUE;
    
    public Map<String, Vertex> getVertexMap(){
        return vertexMap;
    }
    
    /**
     * Add a new edge to the graph.
     */
    public void addEdge(String sourceName, String destName, double cost){
        Vertex v = getVertex(sourceName);
        Vertex w = getVertex(destName);
        v.adj.add(new Edge(w, cost));
    }
    
    /**
     * Driver routine to handle unreachables and print total cost.
     * It calls recursive routine to print shortest path to
     * destNode after a shortest path algorithm has run.
     */
    public void printPath(String destName){
        Vertex w = vertexMap.get(destName);
        
        if(w == null)
            throw new NoSuchElementException();
        else if (w.dist == INFINITY)
            System.out.println(destName + " is unreachable");
        else {
            System.out.print("(Cost is: " + w.dist + ") ");
            printPath(w);
            System.out.println();
        }
    }
    
    /**
     * Single-source unweighted shortest-path algorithm.
     */
    public void unweighted(String startName){
        clearAll();
        
        Vertex start = vertexMap.get(startName);
        
        if(start == null)
            throw new NoSuchElementException("Start vertex not found");
        
        Queue<Vertex> q = new LinkedList<Vertex>();
        q.add(start);
        start.dist = 0;
        
        while(!q.isEmpty()){
            Vertex v = q.remove();
            
            for(Edge e : v.adj){
                Vertex w = e.dest;
                
                if(w.dist == INFINITY){
                    w.dist = v.dist + 1;
                    w.prev = v;
                    q.add(w);
                }
            }
        }
    }
    
    /**
     * Single-source weighted shortest-path algorithm.
     */
    public void dijkstra(String startName){
        PriorityQueue<Path> pq = new PriorityQueue<Path>();
        
        Vertex start = vertexMap.get(startName);
        
        if(start == null)
            throw new NoSuchElementException("Start vertex not found");
        
        clearAll();
        pq.add(new Path(start, 0));
        start.dist = 0;
        
        int nodesSeen = 0;
        while(!pq.isEmpty() && nodesSeen < vertexMap.size()){
            Path vrec = pq.remove();
            Vertex v = vrec.dest;
            if(v.scratch != 0)
                continue;
            
            v.scratch = 1;
            nodesSeen++;
            
            for(Edge e : v.adj){
                Vertex w = e.dest;
                double cvw = e.cost;
                
                if(cvw < 0)
                    throw new GraphException("Graph has negative edges");
                
                if( w.dist > v.dist + cvw){
                    w.dist = v.dist + cvw;
                    w.prev = v;
                    pq.add(new Path(w, w.dist));
                }
            }
        }
    }
    
    /**
     * Single-source negative-weighted shortest-path algorithm.
     */
    public void negative(String startName){
        clearAll();
        
        Vertex start = vertexMap.get(startName);
        if(start == null)
            throw new NoSuchElementException("Start vertex not found");
        
        Queue<Vertex> q = new LinkedList<Vertex>();
        q.add(start);
        start.dist = 0;
        start.scratch++;
        
        while(!q.isEmpty()){
            Vertex v = q.remove();
            if(v.scratch++ > 2 * vertexMap.size())
                throw new GraphException("Negative cycle detected");
            
            for(Edge e : v.adj){
                Vertex w = e.dest;
                double cvw = e.cost;
                
                if(w.dist > v.dist + cvw){
                    w.dist = v.dist + cvw;
                    w.prev = v;
                    
                    if(w.scratch++ % 2 == 0)
                        q.add(w);
                    else 
                        w.scratch--;
                }
            }
        }
    }
    
    /**
     * Single-source negative-weighted acyclic-graph shortest-path algorithm.
     */
    public void acyclic(String startName){
        Vertex start = vertexMap.get(startName);
        
        if(start == null)
            throw new NoSuchElementException("Start vertex not found");
        
        clearAll();
        Queue<Vertex> q = new LinkedList<Vertex>();
        start.dist = 0;
        
        Collection<Vertex> vertexSet = vertexMap.values();
        for(Vertex v : vertexSet)
            for(Edge e : v.adj)
                e.dest.scratch++;
        
        for(Vertex v : vertexSet)
            if(v.scratch == 0)
                q.add(v);
        
        int iterations;
        for(iterations = 0; !q.isEmpty(); iterations++){
            Vertex v = q.remove();
            
            for(Edge e : v.adj){
                Vertex w = e.dest;
                double cvw = e.cost;
                
                if(--w.scratch == 0)
                    q.add(w);
                
                if(v.dist == INFINITY)
                    continue;
                
                if(w.dist > v.dist + cvw){
                    w.dist = v.dist + cvw;
                    w.prev = v;
                }
            }
        }
        
        if(iterations != vertexMap.size())
            throw new GraphException("Graph has a cycle!");
    }
    
    /**
     * If vertexName is not present, add it to vertexMap.
     * In either case, return the Vertex.
     */
    private Vertex getVertex(String vertexName){
        
        Vertex v = vertexMap.get(vertexName);
        
        if(v == null){
            v = new Vertex(vertexName);
            vertexMap.put(vertexName, v);
        }
        
        return v;
    }
    
    /**
     * Recursive routine to print shortest path to dest
     * after running shortest path algorithm. The path
     * is known to exist.
     */
    private void printPath(Vertex dest){
        if (dest.prev != null){
            printPath(dest.prev);
            System.out.print(" to ");
        }
        
        System.out.println(dest.name);
    }
    
    /**
     * Initializes the vertex output info prior to running
     * any shortest path algorithm.
     */
    private void clearAll(){
        for(Vertex v : vertexMap.values())
            v.reset();
    }  
    
    /**
     * Process a request; return false if end of file.
     */
    public static boolean processRequest(BufferedReader in, Graph_11S20018 g){
        
        String startName = null;
        String destName = null;
        String alg = null;

        try{
            System.out.print("Enter start node: ");
            if((startName = in.readLine()) == null)
                return false;
            
            System.out.print("Enter destination node: " );
            
            if((destName = in.readLine()) == null)
                return false;
            
            System.out.print("Enter algorithm (u, d, n, a ): ");   
            
            if((alg = in.readLine()) == null)
                return false;
            
            if(alg.equals("u"))
                g.unweighted( startName );
            
            else if(alg.equals("d")){
                g.dijkstra(startName);
                g.printPath(destName);
            }else if(alg.equals("n"))
                g.negative( startName );        
            else if(alg.equals("a"))
                g.acyclic(startName);
                    
            g.printPath(destName);
        }catch(IOException e){ 
            System.err.println(e); 
        }catch(NoSuchElementException e ){ 
            System.err.println(e); 
        }catch(GraphException e){ 
            System.err.println(e); 
        }
        
        return true;
    }
}

// Used to signal violations of preconditions for
// various shortest path algorithms.
class GraphException extends RuntimeException{
    
    public GraphException(String name){
        super(name);
    }
}