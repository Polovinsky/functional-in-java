package me.polovinskycode;

import java.util.List;
import java.util.stream.Collectors;

public class Map {

    public List<Integer> dobro(List<Integer> integers) {
        return integers
                .stream()
                .map(x -> (x * 2))
                .collect(Collectors.toList());
    }
}
