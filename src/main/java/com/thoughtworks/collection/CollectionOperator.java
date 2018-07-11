package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
//        throw new NotImplementedException();
        int small = left > right ? right : left;
        int big = left <= right ? right :left;
        List<Integer> result = IntStream.range(small,big+1).boxed().collect(Collectors.toList());
        return small == left ? result : result.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
//        throw new NotImplementedException();
        List<Integer> result = new ArrayList<>();
        if (left < right){
            result=IntStream.range(left,right+1).boxed().collect(Collectors.toList());
            return result.stream().filter(x->x%2==0).collect(Collectors.toList());
        }else {
            result=IntStream.range(right,left+1).boxed().collect(Collectors.toList());
            return result.stream().filter(x->x%2==0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        }
    }

    public List<Integer> popEvenElments(int[] array) {
//        throw new NotImplementedException();
        return Arrays.stream(array).filter(x->x%2==0).boxed().collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
//        throw new NotImplementedException();
        return array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
//        throw new NotImplementedException();
        List<Integer> first = Arrays.stream(firstArray).boxed().collect(Collectors.toList());
        List<Integer> second = Arrays.stream(secondArray).boxed().collect(Collectors.toList());
        return first.stream().filter(x->second.contains(x)).collect(Collectors.toList());
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
//        throw new NotImplementedException();
        List<Integer> first = Arrays.stream(firstArray).collect(Collectors.toList());
        List<Integer> second = Arrays.stream(secondArray).collect(Collectors.toList());
        first.addAll(second.stream().filter(x->!first.contains(x)).collect(Collectors.toList()));
        return first;
    }
}
