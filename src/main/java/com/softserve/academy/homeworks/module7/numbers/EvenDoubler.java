package com.softserve.academy.homeworks.module7.numbers;

public class EvenDoubler implements NumberTransformer {
    public EvenDoubler() {
    }

    @Override
    public int transform(int numberToTransform) {
        if (canTransform(numberToTransform)) {
            return numberToTransform * 2;
        }
        return numberToTransform;
    }

    @Override
    public boolean canTransform(int numberToTransform) {
        return numberToTransform % 2 == 0;
    }
}
