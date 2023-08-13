package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return (integerList) -> {
            List<Integer> integers = new ArrayList<>();
            for (Integer integer:integerList) {
                integers.add(integer/divider);
            }
            return integers;
        };
    }
}
