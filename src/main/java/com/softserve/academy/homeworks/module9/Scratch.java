package com.softserve.academy.homeworks.module9;

import java.util.NoSuchElementException;

class Scratch {
    public static void main(String[] args) {
        MyStringList list = new MyStringSingleLinkedList();
        list.addFirst("#1");
        list.addFirst("#2");
        list.addFirst("#3");
        list.addFirst("#4");
        list.addLast("#11");
        list.addLast("#12");
        list.addLast("#13");
        list.addLast("#14");
        System.out.println(list.size());
        var it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("***");
        while (!list.isEmpty()) {
            System.out.println(list.removeFirst());
        }
        System.out.println(list.size());
    }
}

interface MyStringIterable {
    MyStringIterator iterator();
}

interface MyStringIterator {
    boolean hasNext();
    String next();
}

interface MyStringList extends MyStringIterable {
    int size();
    default boolean isEmpty() {
        return size() == 0;
    }
    void addFirst(String el);
    void addLast(String el);
    String getFirst();
    String getLast();
    String removeFirst();
}

class MyStringSingleLinkedList implements MyStringList {
    private int size = 0;
    private Node head;
    private Node tail;

    private static class Node {
        Node next;
        String value;

        public Node(String value) {
            this.value = value;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addFirst(String el) {
        Node node = new Node(el);
        if (size == 0) {
            head = tail = node;
            size = 1;
        } else {
            node.next = head;
            head = node;
            size++;
        }
    }

    @Override
    public void addLast(String el) {
        Node node = new Node(el);
        if (size == 0) {
            head = tail = node;
            size = 1;
        } else {
            tail.next = node;
            tail = node;
            size++;
        }
    }

    private void checkNotEmpty() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
    }

    @Override
    public String getFirst() {
        checkNotEmpty();
        return head.value;
    }

    @Override
    public String getLast() {
        checkNotEmpty();
        return tail.value;

    }

    @Override
    public String removeFirst() {
        checkNotEmpty();
        var res = head.value;
        head = head.next;
        size--;
        if (size == 0) {
            tail = null;
        }
        return res;
    }

    @Override
    public MyStringIterator iterator() {
        return new MyStringIteratorImpl();
    }

    private class MyStringIteratorImpl implements MyStringIterator {
        Node cur = head;

        @Override
        public boolean hasNext() {
            return cur != null;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            var res = cur.value;
            cur = cur.next;
            return res;
        }
    }
}