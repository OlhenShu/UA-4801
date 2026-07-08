package com.softserve.academy.homeworks.module11.task01;

import java.util.HashSet;
import java.util.Set;

public class SetManager {
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> unitedSet = new HashSet<>(set1);
        unitedSet.addAll(set2);
        return unitedSet;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2){
        Set<T> intersectsInSet = new HashSet<>();
        for (T entity : set1){
            if (set2.contains(entity)){
                intersectsInSet.add(entity);
            }
        }
        return intersectsInSet;
    }
}
