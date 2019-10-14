package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return arrayList.stream()
                .mapToInt(Integer::intValue)
                .reduce(Integer.MIN_VALUE, Math::max);
    }

    public double getMinimum() {
        return arrayList.stream()
                .mapToInt(Integer::intValue)
                .reduce(Integer.MAX_VALUE, Math::min);
    }

    public double getAverage() {
        return arrayList.stream()
                .mapToDouble(Integer::doubleValue)
                .reduce(0, Double::sum) / arrayList.size();
    }

    public double getOrderedMedian()  {
        throw new NotImplementedException();
    }

    public int getFirstEven() {
        throw new NotImplementedException();
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
