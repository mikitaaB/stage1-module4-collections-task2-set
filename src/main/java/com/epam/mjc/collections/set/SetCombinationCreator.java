package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> res = new HashSet<>();

        Set<String> firstSecondIntersection = new HashSet<>(firstSet);
        firstSecondIntersection.retainAll(secondSet);

        firstSecondIntersection.removeAll(thirdSet);

        res.addAll(firstSecondIntersection);

        Set<String> onlyThirdSet = new HashSet<>(thirdSet);
        onlyThirdSet.removeAll(firstSet);
        onlyThirdSet.removeAll(secondSet);

        res.addAll(onlyThirdSet);

        return res;
    }
}
