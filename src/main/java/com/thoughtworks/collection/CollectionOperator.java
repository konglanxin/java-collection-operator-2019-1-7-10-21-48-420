package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> result = new ArrayList<>();
        if(left < right){
            for(int i = left; i <= right; i++){
                result.add(i);
            }
        }else{
            for(int i = left; i >= right; i--){
                result.add(i);
            }
        }

        return result;
//        throw new NotImplementedException();
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> result = new ArrayList<>();
        if(left < right){
            for(int i = left; i <= right; i++){
                if(i % 2 == 0){
                    result.add(i);
                }

            }
        }else{
            for(int i = left; i >= right; i--){
                if(i % 2 == 0){
                    result.add(i);
                }
            }
        }
        return result;

//        throw new NotImplementedException();
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> result = new ArrayList<>();

        for(int element : array){
            if(element % 2 == 0){
                result.add(element);
            }
        }
        return result;

//        throw new NotImplementedException();
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];

//        throw new NotImplementedException();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        for(int element1 : firstArray){
            first.add(element1);
        }
        for(int element2 : secondArray){
            second.add(element2);
        }
        first.retainAll(second);

        return first;
//        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> first = new ArrayList<>();
        for(Integer element : firstArray){
            first.add(element);
        }
        List<Integer> second = new ArrayList<>();
        for(Integer element1 : secondArray){
            second.add(element1);
        }

        second.removeAll(first);
        first.addAll(second);
        return first;
        //        throw new NotImplementedException();
    }
}
