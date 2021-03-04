package com.home.example.list;

public class ArrayList implements List {

    int size = 20;
    String[] array = new String[size];
    int cursor = 0;

    public ArrayList(String... strings) {
        for (String str : strings) {
            array[cursor] = str;
            cursor++;
        }
    }

    @Override
    public void add(String str) {
        array[cursor] = str;
        cursor++;
    }

    @Override
    public String get(int i) {
        return array[i];
    }

    @Override
    public String delete(int i) {
        throw new RuntimeException("Not implemented yet!");
    }

    @Override
    public boolean contains(String str) {
        for (int i = 0; i < cursor; i++) {
            if (array[i].equals(str)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param str
     * @return
     * @throws IllegalArgumentException if illegal string passed
     */
    @Override
    public int getPosition(String str) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(str)) {
                return i;
            }
        }

        throw new IllegalArgumentException("List does not contain such an element.");
    }

}
