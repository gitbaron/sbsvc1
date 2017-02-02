/**
 * 
 */
package com.nyksus.domain;

/**
 * @author sharad
 *
 */
public class Person {

    private final long id;
    private final String name;

	/**
	 * 
	 */
	public Person(long id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

}
