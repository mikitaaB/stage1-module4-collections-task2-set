package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        Set<Integer> res = new HashSet<>();

        for (Integer listEl : sourceList) {
            if (listEl % 2 == 0) {
                int cur = listEl;
                while (cur % 2 == 0) {
                    res.add(cur);
                    cur = cur / 2;
                }
            } else {
                res.add(listEl);
                res.add(2 * listEl);
            }
        }

        return new HashSet(res);
    }
}
