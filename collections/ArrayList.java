package com.java.egs.egs_homeworks.collections;

public class ArrayList implements List {
    private String[] array;
    private int size;
    int corsure = 0;

    public ArrayList(String[] array) {
        this.array = array;
        size = array.length;
        corsure = size - 1;
        checkArraySize();
    }

    public ArrayList() {
        array = new String[10];
        size = 0;
    }

    @Override
    public String get(int index) {
        if (index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }

    @Override
    public void add(String element) {
        array[corsure++] = element;
        size++;
        checkArraySize();
    }

    @Override
    public void remove(int index) {
        for (int i = index; i < array.length-1; i++) {
            array[i] = array[i+1];
        }
        size--;
    }

    @Override
    public int indexOf(String o) {
        if (o == null) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                if (o.equals(array[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public int getSize() {
        return size;
    }

    private void checkArraySize() {
        if (corsure == array.length - 1) {
            String[] copy = new String[array.length + 10];
            for (int i = 0; i < array.length; i++) {
                copy[i] = array[i];
            }
            array = copy;
        }
    }
}
