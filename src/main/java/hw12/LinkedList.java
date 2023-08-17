package hw12;

import java.util.*;

public class LinkedList<T> implements List<T> {

    private Node<T> head;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (T item : this) {
            if (Objects.equals(item, o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private LinkedList.Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        int index = 0;
        for (T item : this) {
            array[index++] = item;
        }
        return array;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return new ArrayList<>(this).toArray(a);
    }

    @Override
    public boolean add(T t) {
        Node<T> newNode = new Node<>(t);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (o == null) {
            for (Node<T> current = head, prev = null; current != null; prev = current, current = current.next) {
                if (current.data == null) {
                    if (prev == null) {
                        head = current.next;
                    } else {
                        prev.next = current.next;
                    }
                    size--;
                    return true;
                }
            }
        } else {
            for (Node<T> current = head, prev = null; current != null; prev = current, current = current.next) {
                if (o.equals(current.data)) {
                    if (prev == null) {
                        head = current.next;
                    } else {
                        prev.next = current.next;
                    }
                    size--;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object item : c) {
            if (!contains(item)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        boolean added = false;
        for (T item : c) {
            add(item);
            added = true;
        }
        return added;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        if (index < 0 || index > size) {
            return false;
        }

        int i = index;
        for (T item : c) {
            add(i++, item);
        }

        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean removed = false;

        for (Object item : c) {
            while (contains(item)) {
                remove(item);
                removed = true;
            }
        }

        return removed;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean modified = false;

        Iterator<T> iterator = iterator();
        while (iterator.hasNext()) {
            if (!c.contains(iterator.next())) {
                iterator.remove();
                modified = true;
            }
        }

        return modified;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public T get(int index) {
        if (index >= 0 && index < size) {
            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.data;
        }
        return null;
    }

    @Override
    public T set(int index, T element) {
        if (index >= 0 && index < size) {
            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            T oldData = current.data;
            current.data = element;
            return oldData;
        }
        return null;
    }

    @Override
    public void add(int index, T element) {
        if (index >= 0 && index <= size) {
            Node<T> newNode = new Node<>(element);

            if (index == 0) {
                newNode.next = head;
                head = newNode;
            } else {
                Node<T> current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode;
            }

            size++;
        }
    }

    @Override
    public T remove(int index) {
        if (index >= 0 && index < size) {
            T removedData;

            if (index == 0) {
                removedData = head.data;
                head = head.next;
            } else {
                Node<T> current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                removedData = current.next.data;
                current.next = current.next.next;
            }

            size--;
            return removedData;
        }
        return null;
    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        for (Node<T> current = head; current != null;
             current = current.next) {
            if (Objects.equals(o, current.data)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int lastIndex = -1;
        int index = 0;
        for (Node<T> current = head; current != null; current = current.next) {
            if (Objects.equals(o, current.data)) {
                lastIndex = index;
            }
            index++;
        }
        return lastIndex;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
