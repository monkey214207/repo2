package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> oneDList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                oneDList.add(array[i][j]);
            }
        }
        return oneDList;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> oneDList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!oneDList.contains(array[i][j])){
                    oneDList.add(array[i][j]);
                }
            }
        }
        return oneDList;

    }
}
