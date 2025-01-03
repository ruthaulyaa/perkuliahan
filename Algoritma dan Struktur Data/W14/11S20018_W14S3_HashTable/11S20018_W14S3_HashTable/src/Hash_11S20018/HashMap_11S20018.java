/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hash_11S20018;

import java.util.Map;
import java.util.Set;

/**
 *
 * @author 11S20018
 * @param <KeyType>
 * @param <ValueType>
 */


public class HashMap_11S20018<KeyType, ValueType> extends MapImpl_11S20018<KeyType, ValueType> {
    public HashMap_11S20018() {
        super(new HashSet_11S20018<Map.Entry<KeyType, ValueType>>());
    }

    public HashMap_11S20018(Map<KeyType, ValueType> other) {
        super(other);
    }

    protected Map.Entry<KeyType, ValueType> makePair(KeyType key, ValueType value) {
        return new Pair<KeyType, ValueType>(key, value);
    }

    protected Set<KeyType> makeEmptyKeySet() {
        return new HashSet_11S20018<KeyType>();
    }

    protected Set<Map.Entry<KeyType, ValueType>> clonePairSet(Set<Map.Entry<KeyType, ValueType>> pairSet) {
        return new HashSet_11S20018<Map.Entry<KeyType, ValueType>>(pairSet);
    }

    private static class Pair<KeyType, ValueType> extends MapImpl_11S20018.Pair<KeyType, ValueType> {
        public Pair(KeyType k, ValueType v) {
            super(k, v);
        }

        public int hashCode() {
            KeyType k = getKey();
            return k == null ? 0 : k.hashCode();
        }

        public boolean equals(Object other) {
            if (other instanceof Map.Entry) {
                KeyType thisKey = getKey();
                KeyType otherKey = ((Map.Entry<KeyType, ValueType>) other).getKey();

                if (thisKey == null)
                    return thisKey == otherKey;
                return thisKey.equals(otherKey);
            } else
                return false;
        }
    }
}