package com.java82n_Workout;

import java.util.Arrays;

public class FindLongestInStringArray {

	public static void main(String[] args) {
String[]a= {"a","bb","ccc"};
String list=Arrays.stream(a).reduce((word1,word2) ->word1.length()>word2.length()?word1:word2).get();
System.out.println(list);
	}

}
