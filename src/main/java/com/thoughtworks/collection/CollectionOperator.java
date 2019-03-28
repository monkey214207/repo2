package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> resultList = new ArrayList<>();
        if(left > right){
            for (int i = left; i >= right ; i--) {
               resultList.add(i);
            }
        }
        else{
            for (int i = left; i <= right ; i++) {
                resultList.add(i);
            }
        }
        return resultList;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> resultList = new ArrayList<>();
        if(left > right){
            for (int i = left; i >= right ; i--) {
                if (i % 2 == 0){ resultList.add(i); }
            }
        }
        else{
            for (int i = left; i <= right ; i++) {
                if (i % 2 == 0){ resultList.add(i); }
            }
        }
        return resultList;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < array.length ; i++) {
                if (array[i] % 2 == 0){ resultList.add(array[i]); }
        }
        return resultList;
    }

    public int popLastElment(int[] array) {
        int[] arrNew = new int[array.length - 1];
        for (int i = 0; i < array.length-1; i++) {
            arrNew[i] = array[i];
        }
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> arrayListA = new ArrayList<>();
        List<Integer> arrayListB = new ArrayList<>();
        for (int i = 0; i < firstArray.length; i++) {
            arrayListA.add(firstArray[i]);
        }
        for (int i = 0; i < secondArray.length; i++) {
            arrayListB.add(secondArray[i]);
        }
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < arrayListA.size(); i++) {
            if (arrayListB.contains(arrayListA.get(i))){
                resultList.add(arrayListA.get(i));
            }
        }
        return resultList;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> arrayListA = new ArrayList<>();
        List<Integer> arrayListB = new ArrayList<>();
        for (int i = 0; i < firstArray.length; i++) {
            arrayListA.add(firstArray[i]);
        }
        for (int i = 0; i < secondArray.length; i++) {
            arrayListB.add(secondArray[i]);
        }
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < arrayListB.size(); i++) {
            if (!arrayListA.contains(arrayListB.get(i))){
                resultList.add(arrayListB.get(i));
            }
        }
        List<Integer> mycopy=new ArrayList<>();
        mycopy= (List<Integer>) ((ArrayList<Integer>) arrayListA).clone();
        mycopy.addAll(resultList);
        return mycopy;
    }
}
