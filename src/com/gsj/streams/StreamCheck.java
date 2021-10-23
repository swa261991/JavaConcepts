package com.gsj.streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCheck{
    public static void add() {
        System.out.println("in method Stream");
    }

    public static void main(String[] args) {
        int[] nums = {1,6,3,-2,9,12,0};

        Arrays.stream(nums).forEach(System.out::println);

        Stream.of(nums).forEach(System.out::println);

        add();

        //IntStream.range(0, 5).forEach(n -> System.out.println(n));
    }
}