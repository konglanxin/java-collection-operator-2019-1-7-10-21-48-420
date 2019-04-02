package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> result = new ArrayList<>();
        for(Integer element : array){
            result.add(element * 3);
        }
        return result;

//        throw new NotImplementedException();
    }

    public List<String> mapLetter() {
        List<String> result = new ArrayList<>();
        for(Integer element : array){
            result.add(letters[element - 1]);
        }
        return result;
//        throw new NotImplementedException();
    }

    public List<String> mapLetters() {
        List<String> result = new ArrayList<>();
        for(Integer element : array){
            System.out.println(element);
            String value = "";
            element = element - 1;
            if(element <= letters.length - 1){
                value = letters[element];

            }else{
                while(element != 0 ){
                    int rest = element % 26;
                    element = element / 26;
                    if(element == 0){
                        value = letters[rest - 1] + value;
                    }else{
                        value = letters[rest] + value;
                    }
                }
            }
            result.add(value);
       }
        return result;
//        throw new NotImplementedException();
    }

    public List<Integer> sortFromBig() {
        List<Integer> result = new ArrayList<>();
        for(Integer element : array){
            result.add(element);
        }
        Collections.sort(result,Collections.reverseOrder());
        return result;
//        throw new NotImplementedException();
    }

    public List<Integer> sortFromSmall() {
        List<Integer> result = new ArrayList<>();
        for(Integer element : array){
            result.add(element);
        }
        Collections.sort(result);
        return result;
//        throw new NotImplementedException();
    }
}
