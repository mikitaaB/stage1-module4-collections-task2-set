package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> res = new TreeSet<>();
        
        for (Integer listEl : sourceList) {
            int squareEl = listEl * listEl;
            if (squareEl >= lowerBound && squareEl <= upperBound) {
                res.add(squareEl);
            }
        }
        
        return res;
    }
}
