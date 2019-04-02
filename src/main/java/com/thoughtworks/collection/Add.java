package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int left = 0;
        int right = 0;
        int sum = 0;
        if(leftBorder < rightBorder){
            left = leftBorder;
            right = rightBorder;
        }else{
            left = rightBorder;
            right = leftBorder;
        }
        for(int i = left; i <= right; i++){
            if(i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;

//        throw new NotImplementedException();

    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int left = 0;
        int right = 0;
        int sum = 0;
        if(leftBorder < rightBorder){
            left = leftBorder;
            right = rightBorder;
        }else{
            left = rightBorder;
            right = leftBorder;
        }
        for(int i = left; i <= right; i++){
            if(i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
//        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int result = 0;
        for(int i = 0; i < arrayList.size(); i++){
            result = result + arrayList.get(i) * 3 + 2;

        }
        return result;
//        throw new NotImplementedException();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> result = arrayList;
        for(int i = 0; i < arrayList.size(); i++){
            int value = arrayList.get(i);
            if(value % 2 != 0){
                value = value * 3 + 2;
                result.set(i,value);
            }
        }
        return result;
//        throw new NotImplementedException();
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int result = 0;
        for(int i = 0; i < arrayList.size(); i++){
            int value = arrayList.get(i);
            if(value % 2 == 0){
                continue;
            }else{
                result = result + value * 3 + 5;
            }
        }
        return result;
//        throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < arrayList.size() - 1; i++){
            int value = (arrayList.get(i) + arrayList.get(i + 1)) * 3;
            result.add(value);
        }
        return result;

//        throw new NotImplementedException();
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        int sum = 0;
        int num = 0;
        double result = 0;
        List<Integer> even = new ArrayList<>();

        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i) % 2 == 0){
                even.add(arrayList.get(i));
            }
        }

        if(even.size() % 2 == 0){
            result = (even.get(even.size()/2 - 1) + even.get((even.size()) /2))/2;
        }else{
            result = even.get(even.size() / 2);
        }
        return result;
//    throw new NotImplementedException();
    }

    public double getAverageOfEven(List<Integer> arrayList) {


        int sum = 0;
        int num = 0;
        double result = 0;

        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i) % 2 == 0){
                sum = sum + arrayList.get(i);
                num = num + 1;
            }
        }
        result = sum / num;
        return result;
//        throw new NotImplementedException();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        List<Integer> even = new ArrayList<>();
        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i) % 2 == 0){
                even.add(arrayList.get(i));
            }
        }
        boolean flag = even.contains(specialElment);
        return flag;
        //        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i) % 2 == 0 && !result.contains(arrayList.get(i))){
                result.add(arrayList.get(i));
            }
        }
        return result;
//        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i) % 2 == 0){
                even.add(arrayList.get(i));
            }else{
                odd.add(arrayList.get(i));
            }
        }
        Collections.sort(even);
        Collections.sort(odd,Collections.reverseOrder());
        even.addAll(odd);
        return even;
//        throw new NotImplementedException();
    }

}
