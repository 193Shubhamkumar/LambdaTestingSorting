package com.example;



import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@cantroller
@RestController
public class TestSorting {
	
	@RequestMapping({"/Lambdacall"})
	
	String index() {
	return "hello!! lambda class";
	}

	public static void main(String[] args) {

		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}

		//sort by age
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getAge() - o2.getAge();
			}
		});

		System.out.println("After Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}

	}

	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

	    result.add(new Developer());
		//result.add(new Developer("shubham", new BigDecimal("80000"), 20));

		return result;

	}

}