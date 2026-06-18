package com.softserve.academy.module7;

import java.util.Comparator;

class AgeNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
       int ageComparison = Integer.compare(o1.age(), o2.age());
        if (ageComparison != 0) {
            return ageComparison;
        }
        return o1.fullName().compareTo(o2.fullName());

    }
}
