package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> res = new TreeSet<>();
        res.add(lowerBound);
        for (Integer listEl : sourceList) {
            int squareEl = listEl * listEl;
            if (squareEl < upperBound && squareEl > lowerBound) {
                res.add(squareEl);

            }
        }
        res.add(upperBound);
        return res;
    }
}
