package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> result = new ArrayList<>();
        for(Integer element : array){
            if(element % 2 == 0){
                result.add(element);
            }
        }

        return result;
//        throw new NotImplementedException();
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> result = new ArrayList<>();
        for(Integer element : array){
            if(element % 3 == 0){
                result.add(element);
            }
        }
        return result;
//        throw new NotImplementedException();
    }

    public List<Integer> getDifferentElements() {
        List<Integer> result = new ArrayList<>();
        for(Integer element : array){
            result.add(element);
        }
        HashSet value = new HashSet(result);
        result.clear();
        result.addAll(value);
        return result;
//        throw new NotImplementedException();
    }
    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        for(Integer element : firstList){
            first.add(element);
        }
        for(Integer element : secondList){
            second.add(element);
        }
        first.retainAll(second);
        return first;
//        throw new NotImplementedException();
    }


}