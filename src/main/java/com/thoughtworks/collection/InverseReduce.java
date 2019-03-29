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
        List<Integer> divideList = new ArrayList<>();
        while (number > 0){
            number -= random.nextInt(3);
            divideList.add(number);
        }
        divideList.remove(divideList.size()-1);
        return divideList;
    }
}
