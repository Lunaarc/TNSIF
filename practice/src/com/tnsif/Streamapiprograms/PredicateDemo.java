package com.tnsif.Streamapiprograms;

//to demo predicate interface
import java.util.function.Predicate;

public class PredicateDemo {
public static void main(String[] args) {
	Predicate<Integer> pr=a->(a>18);  
	System.out.println(pr.test(78));   //creating predicate
}
}