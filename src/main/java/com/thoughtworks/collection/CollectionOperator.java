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
        int lowerLimit = Math.min(left, right);
        int upperLimit = Math.max(left, right);

        List<Integer> integerList = IntStream.rangeClosed(lowerLimit, upperLimit)
                .boxed()
                .collect(Collectors.toList());

        if(left > right)
            return integerList.stream()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());

        return integerList;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        int lowerLimit = Math.min(left, right);
        int upperLimit = Math.max(left, right);

        List<Integer> integerList = IntStream.rangeClosed(lowerLimit, upperLimit)
                .boxed()
                .collect(Collectors.toList());

        if(left > right)
            return integerList.stream()
                    .sorted(Comparator.reverseOrder())
                    .filter(element -> element%2==0)
                    .collect(Collectors.toList());

        return integerList.stream()
                .filter(element -> element%2==0)
                .collect(Collectors.toList());
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> evenList = new ArrayList<>();

        Arrays.stream(array)
                .filter(element -> element%2==0)
                .forEach(evenList::add);

        return evenList;
    }

    public int popLastElment(int[] array) {
        return array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
