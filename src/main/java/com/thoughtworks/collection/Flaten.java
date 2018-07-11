package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
//        throw new NotImplementedException();
        List<Integer> result = new ArrayList<>();
        for (Integer[] list : array){
            for (Integer i : list){
                result.add(i);
            }
        }
        return result;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
//        throw new NotImplementedException();
        List<Integer> list = transformToOneDimesional();
        return  list.stream().distinct().collect(Collectors.toList());
    }
}
