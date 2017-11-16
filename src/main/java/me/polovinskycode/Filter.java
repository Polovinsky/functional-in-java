package me.polovinskycode;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filter {

    public List<Integer> filtrarPares(List<Integer> integers) {
        return integers
                .stream()
                .filter(x -> (x % 2 == 0))
                .collect(Collectors.toList());
    }

    public List<Integer> filtrarRange(List<Integer> integers) {
        return integers.stream()
                .filter(x -> (x < 8 == true))
                .collect(Collectors.toList());
    }

    public List<Integer> filtrarRange(List<Integer> integers, Predicate<Integer> predicate) {
        return integers.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
