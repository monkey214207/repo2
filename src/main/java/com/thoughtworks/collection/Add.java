package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Add {

    private Integer cur;

    public int getSumOfEvens(int leftBorder, int rightBorder) {
        if(leftBorder > rightBorder){
            int tmp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = tmp;
        }
        int startShift;
        int result = 0;
        if(leftBorder % 2 == 0){ startShift = 0; }
        else{ startShift = 1; }
        for(int i = leftBorder+startShift; i <= rightBorder; i= i+2){
            result += i;
        }
        return result;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        if(leftBorder > rightBorder){
            int tmp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = tmp;
        }
        int startShift;
        int result = 0;
        if(leftBorder % 2 == 0){ startShift = 1; }
        else{ startShift = 0; }
        for(int i = leftBorder+startShift; i <= rightBorder; i= i+2){
            result += i;
        }
        return result;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int result = 0;
        for(int i = 0; i < arrayList.size(); i++){
            result += 3*arrayList.get(i)+2;
        }
        return result;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            int cur = arrayList.get(i);
            if(cur % 2 != 0){
                arrayList.set(i,3*cur+2);
            }
        }
        return arrayList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int result = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            int cur = arrayList.get(i);
            if(cur % 2 != 0){
                result += 3*cur+5;
            }
        }
        return result;
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        //condition: ordered list
        List<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            Integer cur = arrayList.get(i);
            if( cur % 2 == 0 ){
                evenList.add(cur);
            }
        }
        int evenNum = evenList.size();
        if (evenNum % 2 == 0){
            return (double)(evenList.get(evenNum/2-1)+evenList.get(evenNum/2))/2;
        }
        else{
            return (double)evenList.get(evenNum/2);
        }
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        double evenMean = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            Integer cur = arrayList.get(i);
            if( cur % 2 == 0 ){
                evenMean += cur;
            }
        }
        return evenMean/2;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        if (specialElment % 2 != 0){return false;}
        return arrayList.contains(specialElment);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> unRepeatedEvenList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            Integer cur = arrayList.get(i);
            if (cur % 2 == 0 && !unRepeatedEvenList.contains(cur)){
                unRepeatedEvenList.add(cur);
            }
        }
        return unRepeatedEvenList;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        Collections.sort(arrayList);
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0){
                resultList.add(arrayList.get(i));
            }
        }
        for (int i = arrayList.size()-1; i >= 0 ; i--) {
            if (arrayList.get(i) % 2 != 0){
                resultList.add(arrayList.get(i));
            }
        }
        return resultList;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> resultList = new ArrayList();
        for (int i = 0; i < arrayList.size()-1; i++) {
            resultList.add(3*(arrayList.get(i)+arrayList.get(i+1)));
        }
        return resultList;
    }
}
