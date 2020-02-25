package com.java.basics;

import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		Integer[] srtArr = {1, 2, 3};
		 Stream<Integer> numStream = Stream.of(srtArr);
		numStream.map(n -> n + 10).peek(System.out::println).count();
//		numStream.forEach(s -> System.out.println(s));

	}

}
