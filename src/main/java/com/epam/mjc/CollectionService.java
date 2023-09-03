package com.epam.mjc;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream()
                .filter(x -> x %2 == 0)
                .collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return Optional.of(list.stream()
                .max(Integer::compare)
                .get());
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return Optional.of(list.stream()
                .flatMap(eachList -> eachList.stream())
                .min(Integer::compare)
                .get()
        );
    }

    public Integer sum(List<Integer> list) {
        return list.stream()
                .reduce((x, y) -> ( x + y))
                .get();
    }
}
