package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> tripleList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            tripleList.add(3*array.get(i));
        }
        return tripleList;
    }

    public List<String> mapLetter() {
        List<String> letterList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            letterList.add(letters[array.get(i)-1]);
        }
        return letterList;
    }

    public List<String> mapLetters() {
        List<String> lettersList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            Integer cur = array.get(i);
            String curLetters = "";
            int m = cur / 26;
            int n = cur % 26;
            if (m == 0){ curLetters = letters[n-1];}
            else{
                if (n == 0){ m -= 1; n = 26;}
                curLetters = letters[m-1]+letters[n-1];
            }
            lettersList.add(curLetters);
        }
        return lettersList;
    }

    public List<Integer> sortFromBig() {
        List<Integer> sortedList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            sortedList.add(array.get(i));
        }
        Comparator<Integer> reverseComparator = Collections.reverseOrder();
        Collections.sort(sortedList, reverseComparator);
        return sortedList;
    }

    public List<Integer> sortFromSmall() {
        List<Integer> sortedList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            sortedList.add(array.get(i));
        }
        Collections.sort(sortedList);
        return sortedList;

    }
}
