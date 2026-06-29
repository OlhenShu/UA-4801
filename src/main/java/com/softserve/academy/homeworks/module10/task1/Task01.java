package com.softserve.academy.homeworks.module10.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task01 {
    public static void main(String[] args) {
        List<Integer> myCollection = new Random().ints(10, -30, 31).boxed()
                .collect(Collectors.toList());
        System.out.println(myCollection);
        swapMinAndMax(myCollection);
        System.out.println(myCollection);
        insertThreeDigitNumberBeforeFirstNegative(myCollection);
        System.out.println(myCollection);
        insertZeros(myCollection);
        System.out.println(myCollection);

        List<Integer> firstPartList = new ArrayList<>();
        List<Integer> secondPartList = new ArrayList<>();
        copyListToTwoDifferentLists(myCollection, firstPartList, secondPartList);
        System.out.println(firstPartList);
        System.out.println(secondPartList);
        removeLastEvenElement(myCollection);
        System.out.println(myCollection);
        removeElementAfterFirstMinimum(myCollection);
        System.out.println(myCollection);

    }

    private static void swapMinAndMax(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>(list);
        sortedList.sort(null);
        int minValue = sortedList.getFirst();
        int maxValue = sortedList.getLast();
        int minIndex = list.indexOf(minValue);
        int maxIndex = list.indexOf(maxValue);
        list.set(minIndex, maxValue);
        list.set(maxIndex, minValue);
    }

    private static void insertThreeDigitNumberBeforeFirstNegative(List<Integer> list) {
        int indexOfFirstNegative = -1;
        for (int number : list) {
            if (number < 0) {
                indexOfFirstNegative = list.indexOf(number);
                break;
            }
        }
        if (indexOfFirstNegative < 0) {
            System.out.println("There are no negative values in the list");
            return;
        }
        int randomNumber = new Random().nextInt(100, 1000);
        list.add(indexOfFirstNegative, randomNumber);
    }

    private static void insertZeros(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if ((list.get(i) < 0 && list.get(i + 1) > 0) || (list.get(i) > 0 && list.get(i + 1) < 0)) {
                list.add(i + 1, 0);
                i++;
            }
        }
    }

    private static void copyListToTwoDifferentLists(List<Integer> list, List<Integer> firstPart, List<Integer> secondPart) {
        firstPart.addAll(list.subList(0, list.size() / 2));
        for (int i = list.size() - 1; i >= list.size() / 2; i--) {
            secondPart.add(list.get(i));
        }
    }

    private static void removeLastEvenElement(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) != 0 && list.get(i) % 2 == 0) {
                list.remove(i);
                return;
            }
        }
        System.out.println("There is no even element on the list.");
    }

    private static void removeElementAfterFirstMinimum(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>(list);
        sortedList.sort(null);
        int minValue = sortedList.getFirst();
        int minIndex = list.indexOf(minValue);
        if (minIndex == list.size() - 1) {
            return;
        }
        list.remove(minIndex + 1);
    }
}
