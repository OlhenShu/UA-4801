package com.softserve.academy.homeworks.module14.quiz;

import java.util.List;

public class LongWordCounter {
    public static long countLongWords(List<String> words) {
        if(words == null || words.isEmpty()){
            return 0;
        }
        return words.stream().filter(w -> w.length() > 5).count();
    }
}
