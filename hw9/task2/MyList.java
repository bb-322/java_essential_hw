package hw9.task2;

public class MyList<T> {

    private Object[] data = new Object[10];
    private int count = 0;

    public void add(T value) {
        if (count == data.length) {
            grow();
        }
        data[count++] = value;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        return (T) data[index];
    }

    public int size() {
        return count;
    }

    private void grow() {
        Object[] newData = new Object[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }
}
