package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int small = leftBorder > rightBorder ? rightBorder : leftBorder;
        int big = leftBorder <rightBorder ? rightBorder : leftBorder;

        List<Integer> array = IntStream.range(small,big+1).boxed().collect(Collectors.toList());
        return array.stream().filter(n->n%2==0).reduce(0,Integer::sum);
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int small = leftBorder > rightBorder ? rightBorder : leftBorder;
        int big = leftBorder <rightBorder ? rightBorder : leftBorder;

        List<Integer> array = IntStream.range(small,big+1).boxed().collect(Collectors.toList());
        return array.stream().filter(n->n%2==1).reduce(0,Integer::sum);
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
//        throw new NotImplementedException();
        return arrayList.stream().map(x->x*3+2).reduce(0,Integer::sum);
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
//        throw new NotImplementedException();
        return arrayList.stream().map(x->x%2==0 ? x : x*3+2).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
//        throw new NotImplementedException();
        return arrayList.stream().filter(x->x%2==1).map(x->x*3+5).reduce(0,Integer::sum);
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public double getAverageOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
        return arrayList.stream().filter(x->x%2==0).collect(Collectors.averagingLong(i->i));
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
//        throw new NotImplementedException();
        return arrayList.stream().filter(x->x%2==0).anyMatch(x->x==specialElment);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
//        throw new NotImplementedException();
        return arrayList.stream().filter(x->x%2==0).distinct().collect(Collectors.toList());
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
        List<Integer> even = arrayList.stream().filter(x->x%2==0).sorted().collect(Collectors.toList());
        List<Integer> odd = arrayList.stream().filter(x->x%2==1).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();
        even.forEach(x->result.add(x));
        odd.forEach(x->result.add(x));
        return result;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        throw new NotImplementedException();
    }
}
