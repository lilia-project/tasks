package com.home.example.list;

public interface List {

    void add(String str);

    String get(int i);

    String delete(int i);

    boolean contains(String str);

    int getPosition(String str);

}
