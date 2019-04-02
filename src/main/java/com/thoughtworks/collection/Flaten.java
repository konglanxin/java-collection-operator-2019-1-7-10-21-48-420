package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> result = new ArrayList<>();
        for(Integer[] element : array){
            for(Integer item : element){
                result.add(item);
            }
        }
        return result;

//        throw new NotImplementedException();
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> result = new ArrayList<>();
        for(Integer[] element : array){
            for(Integer item : element){
                if(!result.contains(item)) {
                    result.add(item);
                }
            }
        }
        return result;
//        throw new NotImplementedException();
    }
}
