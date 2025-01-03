/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hash_11S20018;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/**
 *
 * @author 11S20018
 * @param <AnyType>
 */



public class HashSet_11S20018<AnyType> extends AbstractCollection<AnyType> implements Set<AnyType> {

    private int currentSize = 0;
    private int occupied = 0;
    private int modCount = 0;
    private HashEntry[] array;
    private static final int DEFAULT_TABLE_SIZE = 101;
    
    /*
    * This is the implementation of the HashSetIterator.
    * It maintains a notion of a current position and of
    * course the implicit reference to the HashSet.
    */

    private class HashSetIterator<AnyType> implements Iterator<AnyType> {
        private int expectedModCount = modCount;
        private int currentPos = -1;
        private int visited = 0;

        public boolean hasNext() {
            if (expectedModCount != modCount)
                throw new ConcurrentModificationException();
            return visited != size();
        }

        public AnyType next() {
            if (!hasNext())
                throw new NoSuchElementException();
            do {
                currentPos++;
            } while (currentPos < array.length && !isActive(array, currentPos));
            visited++;
            return (AnyType) array[currentPos].element;
        }

        public void remove() {
            if (expectedModCount != modCount)
                throw new ConcurrentModificationException();
            if (currentPos == -1 || !isActive(array, currentPos))
                throw new IllegalStateException();
            array[currentPos].isActive = false;
            currentSize--;
            visited--;
            modCount++;
            expectedModCount++;
        }
    }

    private static class HashEntry implements java.io.Serializable {
        /* Figure 20.10 */
        public Object element; // the element
        public boolean isActive; // false if marked deleted

        public HashEntry(Object e) {
            this(e, true);
        }

        public HashEntry(Object e, boolean i) {
            element = e;
            isActive = i;
        }
    }

    /**
     * Construct an empty HashSet.
     */
    public HashSet_11S20018() {
        /* Figure 20.11 */
        allocateArray(DEFAULT_TABLE_SIZE);
        clear();
    }

    /**
     * Construct a HashSet from any collection.
     */
    public HashSet_11S20018(Collection<? extends AnyType> other) {
        allocateArray(nextPrime(other.size() * 2));
        clear();

        for (AnyType val : other)
            add(val);
    }

    public int size() {
        return currentSize;
    }

    public Iterator<AnyType> iterator() {
        return new HashSetIterator<AnyType>();
    }

    public boolean contains(Object x) {
        /* Figure 20.12 */
        return isActive(array, findPos(x));
    }

    private static boolean isActive(HashEntry[] arr, int pos) {
        /* Figure 20.13 */
        return arr[pos] != null && arr[pos].isActive;
    }

    public AnyType getMatch(AnyType x) {
        /* Figure 20.12 */
        int currentPos = findPos(x);
        if (isActive(array, currentPos))
            return (AnyType) array[currentPos].element;
        return null;
    }

    public boolean remove(Object x) {
        /* Figure 20.14 */
        int currentPos = findPos(x);
        if (!isActive(array, currentPos))
            return false;
        array[currentPos].isActive = false;
        currentSize--;
        modCount++;

        if (currentSize < array.length / 8)
            rehash();
        return true;
    }

    public void clear() {
        /* Figure 20.14 */
        currentSize = occupied = 0;
        modCount++;
        for (int i = 0; i < array.length; i++)
            array[i] = null;
    }

    public boolean add(AnyType x) {
        /* Figure 20.15 */
        int currentPos = findPos(x);
        if (isActive(array, currentPos))
            return false;
        if (array[currentPos] == null)
            occupied++;
        array[currentPos] = new HashEntry(x, true);
        currentSize++;
        modCount++;
        if (occupied > array.length / 2)
            rehash();
        return true;
    }

    private void rehash() {
        /* Figure 20.16 */
        HashEntry[] oldArray = array;

        // Create a new, empty table
        allocateArray(nextPrime(4 * size()));
        currentSize = 0;
        occupied = 0;

        // Copy table over
        for (int i = 0; i < oldArray.length; i++)
            if (isActive(oldArray, i))
                add((AnyType) oldArray[i].element);
    }

    private int findPos(Object x) {
        /* Figure 20.17 */
        int offset = 1;
        int currentPos = (x == null) ? 0 : Math.abs(x.hashCode() % array.length);
        while (array[currentPos] != null) {
            if (x == null) {
                if (array[currentPos].element == null)
                    break;
            } else if (x.equals(array[currentPos].element))
                break;
            currentPos += offset; // Compute ith probe
            offset += 2;
            if (currentPos >= array.length) // Implement the mod
                currentPos -= array.length;
        }
        return currentPos;
    }

    private void allocateArray(int arraySize) {
        array = new HashEntry[arraySize];
    }

    private static int nextPrime(int n) {
        /* Figure 20.8 */
        if (n % 2 == 0)
            n++;
        for (; !isPrime(n); n += 2)
            ;
        return n;
    }

    private static boolean isPrime(int n) {
        /* See online code */
        for (int i = 3; i * i <= n; i += 2)
            if (n % i == 0)
                return false; // not prime
        return true; // prime
    }
}