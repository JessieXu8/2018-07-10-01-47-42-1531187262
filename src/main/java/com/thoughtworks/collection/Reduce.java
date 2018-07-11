package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
//        throw new NotImplementedException();
        return arrayList.stream().reduce(0,Integer::max);
    }

    public double getMinimum() {
//        throw new NotImplementedException();
        return arrayList.stream().reduce(0,Integer::min);
    }

    public double getAverage() {
//        throw new NotImplementedException();
        return arrayList.stream().collect(Collectors.averagingInt(x->x));
    }

    public double getOrderedMedian() {
//        throw new NotImplementedException();
        List<Integer> list =  arrayList.stream().sorted().collect(Collectors.toList());
        return (list.get((list.size()-1)/2)+list.get(list.size()/2))/2.0;
    }

    public int getFirstEven() {
//        throw new NotImplementedException();
        return arrayList.stream().filter(x->x%2==0).findFirst().get();
    }

    public int getIndexOfFirstEven() {
        throw new NotImplementedException();
    }

    public boolean isEqual(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
        throw new NotImplementedException();
    }

    public int getLastOdd() {
        throw new NotImplementedException();
    }

    public int getIndexOfLastOdd() {
        throw new NotImplementedException();
    }
}
