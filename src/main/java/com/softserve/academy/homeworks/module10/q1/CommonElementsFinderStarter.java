package com.softserve.academy.homeworks.module10.q1;

import java.util.ArrayList;
import java.util.List;

public class CommonElementsFinderStarter {

    public static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
        List<Integer> commonElements = new ArrayList<>();
        if (list1 == null || list2 == null || list1.isEmpty() || list2.isEmpty()) {
            return commonElements;
        }
        for (int numberFromList1 : list1) {
            for (int numberFromList2 : list2) {
                if (numberFromList1 == numberFromList2) {
                    if (!isNumberInTheList(numberFromList1, commonElements)) {
                        commonElements.add(numberFromList1);
                    }
                    break;
                }
            }
        }
        return commonElements;
    }

    private static boolean isNumberInTheList(int number, List<Integer> list) {
        if (list.isEmpty()){
            return false;
        }
        return list.contains(number);
    }

    public static Integer findMaxValue(List<Integer> list) {
        if (list == null || list.isEmpty()){
            return null;
        }
        int max = list.getFirst();
        for (int number : list){
            if (number > max){
                max = number;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 5, 7, 8, 10);
        List<Integer> list2 = List.of(2, 3, 4, 5, 9);
        System.out.println(findCommonElements(list1, list2));
    }
}
