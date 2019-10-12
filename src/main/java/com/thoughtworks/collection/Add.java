package com.thoughtworks.collection;

//import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int start = Math.min(leftBorder,rightBorder);
        int end = Math.max(leftBorder,rightBorder);
        return IntStream.rangeClosed(start, end)
                .filter(number -> number % 2 == 0)
                .sum();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int start = Math.min(leftBorder,rightBorder);
        int end = Math.max(leftBorder,rightBorder);
        return IntStream.rangeClosed(start, end)
                .filter(number -> number % 2 == 1)
                .sum();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
       return arrayList.stream()
                .reduce(0, (sum, element) -> 3 * element + 2 + sum);
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream()
                .map(element -> {
                    if (element %2 ==0 )
                        return element;
                    else
                        return element * 3 + 2;
                })
                .collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        return arrayList.stream()
                .filter(number -> number % 2 == 1)
                .map(element -> element * 3 + 5)
                .reduce(0, Integer::sum);
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        List<Integer> evenList = arrayList.stream()
                .filter(num -> num%2 ==0)
                .collect(Collectors.toList());

        return  evenList.stream()
                .mapToDouble(Integer::doubleValue)
                .reduce(0, Double::sum)/evenList.size();
    }

//    public double getAverageOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
//
//    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
//        throw new NotImplementedException();
//    }
//
//    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
