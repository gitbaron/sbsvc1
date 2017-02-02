/**
 * 
 */
package com.nyksus.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nyksus.domain.Person;

/**
 * @author sharad
 *
 */
@RestController
public class PersonService {

	private static final Person[] persons = new Person[] { new Person(1, "Sam"), new Person(2, "Roger"),
			new Person(3, "Lily"), new Person(4, "Tiff") };

	@RequestMapping("/persons")
	public Person[] persons() {
		return persons;
	}

	@RequestMapping("/persons/{id}")
	public Person person(@PathVariable("id") int id) {
		return persons[id];
	}

}
