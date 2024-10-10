package com.learning.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class Java_2D_Array {

	
	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		List<List<Integer>> arr = new ArrayList<>();

		IntStream.range(0, 6).forEach(i -> {
			try {
				arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
						.collect(toList()));

			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});
		
		int largestSum = Integer.MIN_VALUE;
		int total;
		
		for (int i = 0; i <= arr.size() - 3; i++) 
		{ 
			for (int j = 0; j <= arr.get(i).size() - 3; j++) 
			{ 
				total =   arr.get(i).get(j)
						+ arr.get(i).get(j + 1)
						+ arr.get(i).get(j + 2)
						
						+ arr.get(i + 1).get(j + 1)
						
						+ arr.get(i + 2).get(j)
						+ arr.get(i + 2).get(j + 1)
						+ arr.get(i + 2).get(j + 2);
				
				if (largestSum < total)
				{ 
					largestSum = total; 
				} 
			} 
		} 
		System.out.println(largestSum);

		bufferedReader.close();

	}
		
}
