package com.softserve.academy.homeworks.module14.quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListFlattener {
    public static List<Integer> flatten(List<List<Integer>> nestedList) {
        if (nestedList == null || nestedList.isEmpty()) {
            return new ArrayList<>();
        }
        return nestedList.stream().flatMap(Collection::stream).toList();
    }
}
