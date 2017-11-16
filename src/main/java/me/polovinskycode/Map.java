package me.polovinskycode;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Map {

    public List<Integer> dobro(List<Integer> integers) {
        return integers
                .stream()
                .map(x -> (x * 2))
                .collect(Collectors.toList());
    }

    public List<Integer> dobro(List<Integer> integers, Function<Integer, Integer> action) {
        return integers
                .stream()
                .map(action)
                .collect(Collectors.toList());
    }
}
