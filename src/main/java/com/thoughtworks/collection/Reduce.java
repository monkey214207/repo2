package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;
    private int size;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        int max = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > max){ max = arrayList.get(i);}
        }
        return max;
    }

    public double getMinimum() {
        int min = 1000;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) < min){ min = arrayList.get(i);}
        }
        return min;
    }

    public double getAverage() {
        double mean = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            mean += arrayList.get(i);
        }
        return mean/arrayList.size();
    }

    public double getOrderedMedian() {
        double median = 0;
        int size = arrayList.size();
        if (size % 2 == 0){
            median = (double)(arrayList.get(size/2-1)+arrayList.get(size/2))/2;
        }
        else{
            median = arrayList.get(size/2);
        }
        return median;
    }

    public int getFirstEven() {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0){
                return arrayList.get(i);
            }
        }
        return 0;
    }

    public int getIndexOfFirstEven() {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0){
                return i;
            }
        }
        return -1;
    }

    public boolean isEqual(List<Integer> arrayList) {
        boolean contains1To2 = true;
        boolean contains2To1 = true;
        for (int i = 0; i < this.arrayList.size(); i++) {
            if (!arrayList.contains(this.arrayList.get(i))){
                contains1To2 = false;
                break;
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (!this.arrayList.contains(arrayList.get(i))){
                contains2To1 = false;
                break;
            }
        }
        return contains1To2 && contains2To1;
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
        double median = 0;
        int size = arrayList.size();
        if (size % 2 == 0){
            median = (double)((Integer)singleLink.getNode(size/2)+(Integer)singleLink.getNode(size/2+1))/2;
        }
        else{
            median = (Integer)singleLink.getNode(size/2+1);
        }
        return median;
    }

    public int getLastOdd() {
        for (int i = arrayList.size()-1; i >= 0 ; i--) {
            if (arrayList.get(i) % 2 != 0){
                return arrayList.get(i);
            }
        }
        return 0;
    }

    public int getIndexOfLastOdd() {
        for (int i = arrayList.size()-1; i >= 0 ; i--) {
            if (arrayList.get(i) % 2 != 0){
                return i;
            }
        }
        return -1;
    }
}
