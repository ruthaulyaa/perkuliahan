/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class ArrayQueue<AnyType> implements Queue, Iterable{
	//Declare a variable for default queue capacity
	private static final int DEFAULT_QUEUE_CAPACITY = 10;
	//Declare a variable for queue capacity
	private int qCapacity;
	//Declare a variable for queue current
	private int qCurrent;
	//Declare a variable for queue front
	private int qFront;
	//Declare a variable for queue back
	private int qBack;
	//Declare a new array
	private AnyType[] Arr;

	//Constructor
	public ArrayQueue(){
		//Initialize queue capacity
		qCapacity = DEFAULT_QUEUE_CAPACITY;
		//Initialize array
		Arr = (AnyType[]) new Object[DEFAULT_QUEUE_CAPACITY];
		//Initialize queue back
		qBack = -1;
		//Initialize queue front
		qFront = 0;
	}

	//Method isEmpty()
	public boolean isEmpty(){
		//Return
		return qCurrent == 0;
	}

	//Method enqueue()
	public void enqueue (AnyType data){
		//Check condition
		if (isFull())
			//Call function
			doubleSize();
			//Increment queue back
			qBack++;
			//Assign data to array
			Arr[qBack%qCapacity] = data;
			//Increment queue current
			qCurrent++;
	}

	//Method element()
	public AnyType element(){
		//Check condition
		if (isEmpty())
			//Throw exception
			throw new QueueException();
		//Otherwise
		else
		//Return queue front
		return Arr[qFront%qCapacity];
	}

	//Method remove()
	public AnyType remove(){
		//Check condition
		if (isEmpty())
			//Throw exception
			throw new QueueException();
			//Update data
			AnyType data = element();
			//Update
			Arr[qFront%qCapacity] = null;
			//Increment queue front
			qFront++;
			//Decrement queue current
			qCurrent--;
			//Return data
			return data;
	}

	//Method isFull()
	public boolean isFull(){
		//Return true if queue is full
		return qCurrent == qCapacity;
	}

	//Method doubleSize()
	private void doubleSize(){
		//Initialize new array
		AnyType[] newArr = (AnyType[]) new Object[2*qCapacity];
		//Loop
		for(int j = qFront; j <= qBack; j ++)
			//Update
			newArr[j-qFront] = Arr[j%qCapacity];
			//Update array
			Arr = newArr;
			//Update queue front
			qFront = 0;
			//Update queue back
			qBack = qCurrent-1;
			//Update queue capacity
			qCapacity *= 2;
	}

	//Method Iterator()
	public Iterator iterator(){
		//Return
		return new QueueIterator();
	}

	//Class QueueIterator
	private class QueueIterator implements Iterator{
		//Declare a variable for queue index
		private int qIndex;
		
		//Constructor
		public QueueIterator(){
			//Initialize queue index
			qIndex = qFront;
		}

		//Method hasNext()
		public boolean hasNext(){
			//Return
			return qIndex <= qBack;
		}

		//Method next()
		public AnyType next( ){
			//Return
			return Arr[(qIndex++)%qCapacity];
		}

		public void remove( ){
			//Throw exception
			throw new java.lang.UnsupportedOperationException();

		}
	}
}
