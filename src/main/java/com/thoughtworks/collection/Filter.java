package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer>  array;
    private Integer cur;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            Integer cur = array.get(i);
            if (cur % 2 == 0){
                evenList.add(cur);
            }
        }
        return evenList;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            Integer cur = array.get(i);
            if (cur % 3 == 0){
                evenList.add(cur);
            }
        }
        return evenList;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> commonList = new ArrayList<>();
        for (int i = 0; i < firstList.size(); i++) {
            Integer cur = firstList.get(i);
            if (secondList.contains(cur)){
                commonList.add(cur);
            }
        }
        return commonList;
    }

    public List<Integer> getDifferentElements() {
        List<Integer> diffList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            Integer cur = array.get(i);
            if (!diffList.contains(cur)){
                diffList.add(cur);
            }
        }
        return diffList;
    }
}