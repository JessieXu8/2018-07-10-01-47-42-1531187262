package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
//        throw new NotImplementedException();
        int temp = number;
        List<Integer> list = new ArrayList<>();
        temp -= random.nextInt(3);
        while (temp > 0){
            list.add(temp);
            temp -= random.nextInt(3);
        }
        return list;
    }
}
