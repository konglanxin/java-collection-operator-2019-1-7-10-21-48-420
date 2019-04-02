package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;


public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        Optional<Integer> max = arrayList.stream().reduce(Integer::max);
        int result = max.orElse(0);
//        System.out.println(arrayList.stream().max(Integer::compare).get());
//        System.out.println(arrayList.stream().mapToInt(i -> i).max().getAsInt());
        return result;
//        throw new NotImplementedException();
    }

    public double getMinimum() {
        Optional<Integer> min = arrayList.stream().reduce(Integer::min);
        int result = min.orElse(0);
        return result;

//        throw new NotImplementedException();
    }

    public double getAverage() {
        IntSummaryStatistics stats = arrayList.stream().mapToInt((x) -> x).summaryStatistics();
        return stats.getAverage();
//        throw new NotImplementedException();
    }

    public double getOrderedMedian() {
        double result = 0;
        List<Integer> value = new ArrayList<>();

        for(int i = 0; i < arrayList.size(); i++){
            value.add(arrayList.get(i));
        }

        if(value.size() % 2 == 0){
            result = (double)(value.get(value.size()/2 - 1) + value.get((value.size()) /2))/2;
        }else{
            result = value.get(value.size() / 2);
        }
        return result;

//        throw new NotImplementedException();
    }

    public int getFirstEven() {
        int value = 0;
        for(Integer element : arrayList){
            if(element % 2 == 0){
                value = element;
                break;
            }
        }
        return value;
//        throw new NotImplementedException();
    }

    public int getIndexOfFirstEven() {
        int value = 0;
        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i) % 2 == 0){
                value = i;
                break;
            }
        }
        return value;
//        throw new NotImplementedException();
    }

    public boolean isEqual(List<Integer> array) {
        if(arrayList.size() != array.size()){
            return false;
        }
        return (arrayList.containsAll(array));
//        throw new NotImplementedException();
    }

//    public Double getMedianInLinkList(SingleLink singleLink) {
//
//        throw new NotImplementedException();
//    }

    public int getLastOdd() {
        int value = 0;
        for(int i = arrayList.size() - 1; i >= 0; i--){
            if(arrayList.get(i) % 2 != 0){
                value = arrayList.get(i);
                break;
            }
        }
        return value;
//        throw new NotImplementedException();
    }

    public int getIndexOfLastOdd() {
        int value = 0;
        for(int i = arrayList.size() - 1; i >= 0; i--){
            if(arrayList.get(i) % 2 != 0){
                value = i;
                break;
            }
        }
        return value;
//        throw new NotImplementedException();
    }
}
