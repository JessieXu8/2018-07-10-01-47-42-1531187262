package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
//        throw new NotImplementedException();
        int firstEvent = arrayList.stream().filter(x->x%2==0).findFirst().get();
        return arrayList.indexOf(firstEvent);
    }

    public boolean isEqual(List<Integer> objectList) {
//        throw new NotImplementedException();
        Boolean isEqual = false;

        if (objectList.size() == arrayList.size()) {

            isEqual = IntStream.range(0, arrayList.size())

                    .allMatch(index -> arrayList.get(index) == objectList.get(index));

        }

        return isEqual;
    }


    public Double getMedianInLinkList(SingleLink singleLink) {
//        throw new NotImplementedException();
        int index = arrayList.size() / 2;
        if (arrayList.size() % 2 == 0) {

            return (singleLink.getNode(index) + singleLink.getNode(index + 1)) / 2.0;

        } else {

            return singleLink.getNode(index + 1);

        }
    }

    public int getLastOdd() {
//        throw new NotImplementedException();
        return arrayList.stream().filter(num -> num % 2 != 0).reduce((first, second) -> second).get();
    }

    public int getIndexOfLastOdd() {
//        throw new NotImplementedException();
        return arrayList.lastIndexOf(getLastOdd());
    }
}
