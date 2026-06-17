package com.softserve.academy.homeworks.module7.numbers;

public class OddSquarer implements NumberTransformer {
    public OddSquarer() {
    }

    @Override
    public int transform(int numberToTransform) {
        if (canTransform(numberToTransform)){
            return numberToTransform * numberToTransform;
        }
        return numberToTransform;
    }

    @Override
    public boolean canTransform(int numberToTransform) {
        return Math.abs(numberToTransform % 2) == 1;
    }
}
