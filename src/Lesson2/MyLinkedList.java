package Lesson2;

import java.util.Objects;

public class MyLinkedList<T> implements MyList<T> {

    private Node<T> begin;
    private int size;

    @Override
    public void add(T obj) {
        if(begin == null){
            begin = new Node<>(obj);
        }else {
            getNode(size-1).next = new Node<>(obj);
        }
        size++;
    }

    private Node<T> getNode(int i){
        Node<T> cursor = begin;
        int count = 0;
        while(count < i){
            cursor = cursor.next;
            count++;
        }
        return cursor;
    }

    private void checkIndex(int i) {
        if(i < 0 || i >= size){
            throw new IndexOutOfBoundsException("Invalid index for MyList");
        }
    }

    @Override
    public T get(int i) {
        checkIndex(i);
        return getNode(i).data;
    }

    @Override
    public void remove(int i) {
        checkIndex(i);
        if(i == 0){
            begin = begin.next;
            size--;
            return;
        }
        Node<T> node = getNode(i-1);
        node.next = node.next.next;
        size--;
    }

    @Override
    public void remove(T obj) {
        Node<T> cursor = begin;
        if(cursor == null)
            return;
        if(Objects.equals(cursor.data, obj)){
            begin = begin.next;
            size--;
            return;
        }
        Node<T> prev;
        while(cursor != null){
            prev = cursor;
            cursor = cursor.next;

            if(cursor != null && Objects.equals(cursor.data, obj)){
                prev.next = cursor.next;
                size--;
                return;
            }
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        Node<T> cursor = begin;
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(cursor.data);
            if(i != size - 1)
                sb.append(", ");
            cursor = cursor.next;
        }

        sb.append("]");
        return sb.toString();
    }
}
