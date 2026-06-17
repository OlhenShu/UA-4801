package com.softserve.academy.homeworks.module7.numbers;

public class RangeNegator implements NumberTransformer {
    public RangeNegator() {
    }

    @Override
    public int transform(int numberToTransform) {
        if (canTransform(numberToTransform)){
            return numberToTransform * -1;
        }
        return numberToTransform;
    }

    @Override
    public boolean canTransform(int numberToTransform) {
        return numberToTransform >= -10 && numberToTransform <= 10;
    }
}
