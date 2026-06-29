package com.softserve.academy.homeworks.module10.q2;

import java.util.ArrayList;
import java.util.List;

public class CollectionMerger {

    public static List<String> mergeAndSortLists(List<String> list1, List<String> list2) {
        List<String> mergedList = new ArrayList<>();
        if (list1 != null) {
            addUniqueWordToList(list1, mergedList);
        }
        if ( list2 != null) {
            addUniqueWordToList(list2, mergedList);
        }
        mergedList.sort(null);
        return mergedList;
    }

    private static void addUniqueWordToList(List<String> list1, List<String> mergedList) {
        if (list1.isEmpty()){
            return;
        }
        for (String word : list1) {
            if (!isStringInTheList(word, mergedList)) {
                mergedList.add(word);
            }
        }
    }

    private static boolean isStringInTheList(String word, List<String> list) {
        if (list.isEmpty()) {
            return false;
        }
        return list.contains(word);
    }
}
