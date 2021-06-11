package Lesson2;

public class MyArrayList<T> implements MyList<T>{
    private static final int CAPACITY = 4;
    private Object[] data;

    private int size;
    private int cursor;

    public MyArrayList() {
        data = new Object[CAPACITY];
        size = CAPACITY;
    }


    @Override
    public void add(T obj) {
        if(cursor == size - 1) {
            increaseSize();
        }

        data[cursor++] = obj;
    }

    private void increaseSize(){
        size += CAPACITY;
        Object[] newData = new Object[size];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

    @Override
    public T get(int i) {
        checkIndex(i);
        return (T) data[i];
    }

    private void checkIndex(int i) {
        if(i < 0 || i >= cursor){
            throw new IndexOutOfBoundsException("Invalid index for MyList");
        }
    }

    @Override
    public void remove(int i) {
        checkIndex(i);
        for (int j = i; j < cursor -1; j++) {
            data[j] = data[j+1];
        }
        data[cursor -1] = null;
        cursor--;
    }

    @Override
    public void remove(T obj) {
        for (int i = 0; i < cursor; i++) {
            if(obj != null){
                if (obj.equals(get(i))){
                    remove(i);
                    break;
                }
            }else {
                if (get(i) == null) {
                    remove(i);
                    break;
                }
            }

        }
    }

    @Override
    public int size() {
        return cursor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < cursor; i++) {
            sb.append(data[i]);
            if(i != cursor - 1){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
