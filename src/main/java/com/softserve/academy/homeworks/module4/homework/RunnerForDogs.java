package com.softserve.academy.homeworks.module4.homework;

public class RunnerForDogs {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Cake", Breed.PUG, 7);
        Dog dog2 = new Dog("Jessi", Breed.COCKIER_SPANIEL, 12);
        Dog dog3 = new Dog("Bulka", Breed.SPITZ, 11);

        if (dog1.getName().equals(dog2.getName()) ||
                dog2.getName().equals(dog3.getName()) || dog1.getName().equals(dog3.getName())) {
            System.out.println("There are dogs with same name");
        }else {
            System.out.println("There are no dogs with the same name.");
        }

        Dog theOldestDog = dog1;
        if (dog2.getAge() > theOldestDog.getAge()){
            theOldestDog = dog2;
        }
        if (dog3.getAge() > theOldestDog.getAge()){
            theOldestDog = dog3;
        }
        System.out.println("The oldest dog breed is " + theOldestDog.getBreed() + "\n" +
                "with age " + theOldestDog.getAge());

    }
}
