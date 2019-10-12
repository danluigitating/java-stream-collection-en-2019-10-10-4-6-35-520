package com.thoughtworks.collection;

import java.util.Comparator;
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

    public double getAverageOfEven(List<Integer> arrayList) {
        List<Integer> evenList = arrayList.stream()
                .filter(num -> num%2 ==0)
                .collect(Collectors.toList());

        return  evenList.stream()
                .mapToDouble(Integer::doubleValue)
                .reduce(0, Double::sum)/evenList.size();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        return arrayList.stream()
                .filter(num -> num%2 ==0)
                .anyMatch(num-> num== specialElment);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> evenList = arrayList.stream()
                .filter(num -> num%2 ==0)
                .distinct()
                .collect(Collectors.toList());
        return evenList;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> evenList = arrayList.stream()
                .filter(num -> num%2 ==0)
                .sorted()
                .collect(Collectors.toList());

        List<Integer> oddList = arrayList.stream()
                .filter(num -> num%2 ==1)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        return Stream.concat(evenList.stream(), oddList.stream())
                .collect(Collectors.toList());
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        return IntStream.range(0, arrayList.size() - 1)
                .map(i ->  ((arrayList.get(i) +  arrayList.get(i+1) ) *3 ))
                .boxed()
                .collect(Collectors.toList());
    }
}
