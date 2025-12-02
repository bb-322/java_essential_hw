package hw9.task3;

public class MyDictionary<K, V> {

    private Object[] keys = new Object[10];
    private Object[] values = new Object[10];
    private int count = 0;

    public void add(K key, V value) {
        if (count == keys.length) {
            grow();
        }
        keys[count] = key;
        values[count] = value;
        count++;
    }

    @SuppressWarnings("unchecked")
    public V get(K key) {
        for (int i = 0; i < count; i++) {
            if (keys[i].equals(key)) {
                return (V) values[i];
            }
        }
        return null;
    }

    public int size() {
        return count;
    }

    private void grow() {
        Object[] newKeys = new Object[keys.length * 2];
        Object[] newValues = new Object[values.length * 2];

        System.arraycopy(keys, 0, newKeys, 0, keys.length);
        System.arraycopy(values, 0, newValues, 0, values.length);

        keys = newKeys;
        values = newValues;
    }
}