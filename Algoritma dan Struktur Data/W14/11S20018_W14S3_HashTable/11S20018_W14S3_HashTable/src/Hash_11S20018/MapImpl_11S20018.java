/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hash_11S20018;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author 11S20018
 */

/**
 * MapImpl implements the Map on top of a set. It should be extended by TreeMap
 * and HashMap, with chained calls to the constructor.
 */

abstract class MapImpl_11S20018<KeyType, ValueType> implements Map<KeyType, ValueType> {

    private final Set<Map.Entry<KeyType, ValueType>> theSet;

    protected MapImpl_11S20018(Set<Map.Entry<KeyType, ValueType>> s) {
        theSet = s;
    }

    protected MapImpl_11S20018(Map<KeyType, ValueType> m) {
        theSet = clonePairSet(m.entrySet());
    }

    protected abstract Map.Entry<KeyType, ValueType> makePair(KeyType key, ValueType value);

    protected abstract Set<KeyType> makeEmptyKeySet();

    protected abstract Set<Map.Entry<KeyType, ValueType>> clonePairSet(Set<Map.Entry<KeyType, ValueType>> pairSet);

    private Map.Entry<KeyType, ValueType> makePair(final Object key) {
        return makePair((KeyType) key, null);
    }

    protected Set<Map.Entry<KeyType, ValueType>> getSet() {
        return theSet;
    }

    public int size() {
        return theSet.size();
    }

    public boolean isEmpty() {
        return theSet.isEmpty();
    }

    public boolean containsKey(Object key) {
        return theSet.contains(makePair(key));
    }

    public void clear() {
        theSet.clear();
    }

    public String toString() {
        final StringBuilder result = new StringBuilder("{");
        for (final Map.Entry<KeyType, ValueType> e : entrySet())
            result.append(e + ", ");
        result.replace(result.length() - 2, result.length(), "}");
        return result.toString();
    }

    public ValueType get(Object key) {
        /* Figure 19.79 */
        for (final Map.Entry<KeyType, ValueType> e : entrySet()){
            if(e.getKey().equals((KeyType) key)) return e.getValue();
        }
        return null;
    }

    public ValueType put(KeyType key, final ValueType value) {
        /* Figure 19.79 */
        Map.Entry<KeyType, ValueType> match = null;

        for (final Map.Entry<KeyType, ValueType> e : entrySet()){
            if(e.getKey().equals(key)){
                match = e;
            }
        }

        if (match != null)
            return match.setValue(value);
        theSet.add(makePair(key, value));
        return null;
    }

    public ValueType remove(Object key) {
        /* Figure 19.79 */
        ValueType oldValue = get((KeyType) key);
        if (oldValue != null)
            theSet.remove(makePair((KeyType) key));
        return oldValue;
    }

    // Pair class
    protected static abstract class Pair<KeyType, ValueType> implements Map.Entry<KeyType, ValueType> {
        public Pair(final KeyType k, final ValueType v) {
            key = k;
            value = v;
        }

        final public KeyType getKey() {
            return key;
        }

        final public ValueType getValue() {
            return value;
        }

        final public ValueType setValue(final ValueType newValue) {
            final ValueType oldValue = value;
            value = newValue;
            return oldValue;
        }

        final public String toString() {
            return key + "=" + value;
        }
        
        private final KeyType key;
        private ValueType value;
    }

    // Views
    public Set<KeyType> keySet() {
        return new KeySetClass();
    }

    public Collection<ValueType> values() {
        return (Collection<ValueType>) new ValueCollectionClass();
    }

    public Set<Map.Entry<KeyType, ValueType>> entrySet() {
        return getSet();
    }

    private abstract class ViewClass<AnyType> extends AbstractCollection<AnyType> {
        /* Figure 19.80 */
        public int size() {
            return MapImpl_11S20018.this.size();
        }

        public void clear() {
            MapImpl_11S20018.this.clear();
        }
    }

    private class KeySetClass extends ViewClass<KeyType> implements Set<KeyType> {
        /* Figure 19.80 */
        public boolean remove(Object key) {
            return MapImpl_11S20018.this.remove((KeyType) key) != null;
        }

        public Iterator<KeyType> iterator() {
            return new KeySetIterator();
        }

        private KeyType getMatch(KeyType key){
            throw new UnsupportedOperationException();
        }
    }

    private class ValueCollectionClass extends ViewClass<ValueType> {
        /* Figure 19.80 */
        public Iterator<ValueType> iterator() {
            return new ValueCollectionIterator();
        }
    }

    private class ValueCollectionIterator implements Iterator<ValueType> {
        /* Figure 19.81 */
        private final Iterator<Map.Entry<KeyType, ValueType>> itr = theSet.iterator();

        public boolean hasNext() {
            return itr.hasNext();
        }

        public void remove() {
            itr.remove();
        }

        public ValueType next() {
            return itr.next().getValue();
        }
    }

    private class KeySetIterator implements Iterator<KeyType> {
        /* Figure 19.81 */
        private Iterator<Map.Entry<KeyType, ValueType>> itr = theSet.iterator();

        public boolean hasNext() {
            return itr.hasNext();
        }

        public void remove() {
            itr.remove();
        }

        public KeyType next() {
            return itr.next().getKey();
        }
    }

    @Override
    public boolean containsValue(Object value) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void putAll(Map<? extends KeyType, ? extends ValueType> m) {
        // TODO Auto-generated method stub
    }
}
