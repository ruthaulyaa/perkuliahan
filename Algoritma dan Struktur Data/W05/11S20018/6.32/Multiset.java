import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/* Multiset Class*/
class Multiset<E>{
	private List<E> values; /* List to store distinct values */
	private List<Integer> frequency; /* List to store counts of distinct values */
	private final String ERROR_MSG = "Count cannot be negative: ";

	/* Default Constructor */
	public Multiset(){
		values = new ArrayList<>();
		frequency = new ArrayList<>();
	}

	//setCount method
	public int setCount(E element, int count){
		if (count < 0) {
		throw new IllegalArgumentException(ERROR_MSG + count);
		}
		if (count == 0)
			remove(element);
			int index = values.indexOf(element);
		if (index == -1)
		return add(element, count);
		int prevCount = frequency.get(index);
		frequency.set(index, count);
		return prevCount;
	}

	//Add All method
	boolean addAll(Collection<? extends E> c){	
		for (E element: c)
		add(element, 1);	
		return true;
	}

	//Adds an element to the multiset count number of times
	public int add(E element, int count){
		if (count < 0){
			throw new IllegalArgumentException(ERROR_MSG + count);
		}

		int index = values.indexOf(element);
		int prevCount = 0;
		
		if (index != -1) {
			prevCount = frequency.get(index);
			frequency.set(index, prevCount + count);
		}
		else if (count != 0) {
			values.add(element);
			frequency.add(count);
		}
		return prevCount;
	}

	//Adds an element to the multiset
	public boolean add(E element) {
		return add(element, 1) >= 0;
	}

	//checks if exists
	public boolean contains(Object element) {
		return values.contains(element);
	}

	//Removes a specified number
	public int remove(Object element, int count){
		if (count < 0){
			throw new IllegalArgumentException(ERROR_MSG + count);
		}
		int index = values.indexOf(element);
		if (index == -1)
		return 0;
		int prevCount = frequency.get(index);
		if (prevCount > count) {
			frequency.set(index, prevCount - count);
		}
		else {
		values.remove(index);
		frequency.remove(index);
		}	
		return prevCount;
	}

	//deletes an element from the multiset
	public boolean remove(Object element){
		return remove(element, 1) > 0;
	}

	//check if it contains one element atleast
	public boolean containsAll(Collection<?> c) {
		return values.containsAll(c);
	}

	// Adds all elements in the specified array to this multiset
	public void addAll(E... arr){
		for (E element: arr)
			add(element, 1);
		}

	//to string method
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < values.size(); i++) {
			sb.append(values.get(i));
			if (frequency.get(i) > 1)
			sb.append(" x ").append(frequency.get(i));
			if (i != values.size() - 1)
			sb.append(", ");
		}
		return sb.append("]").toString();
	}
}

public class SetUtils{
	// Multiset Implementation in Java
	public static void main(String[] args){
		Multiset<String> multiset = new Multiset();
		multiset.add("Sachin");
		multiset.add("Ab Deviliers", 2);
		multiset.addAll("India", "USA");
		multiset.addAll(Arrays.asList("Pakistan", "UK", "Indonesia", "Paris"));
		System.out.println(multiset);
		multiset.remove("Ab Deviliers");
		multiset.remove("UK", 2);
		System.out.println(multiset);
		multiset.setCount("Tokyo", 2);
		multiset.setCount("France", 3);
		multiset.setCount("Belgium", 4);
		multiset.setCount("USA", 0);
		System.out.println(multiset);
	}
}