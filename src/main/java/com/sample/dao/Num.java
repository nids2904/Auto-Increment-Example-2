package com.sample.dao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.transaction.annotation.Transactional;

/**
 * Represents a number.
 * 
 */
@Entity
@Table(name="number_value")
public class Num implements Serializable {

	/**
	 * Represents the literal value of the number.
	 * same as the identifier of table
	 */
	@Id 
	private int id;
	
	@NotNull
	private int value;

	/**
	 * Creates a number with id=0
	 * 
	 */
	public Num(){}
	
	/**
	 * Creates a number with given id and initiates values to 0
	 * 
	 */
	public Num(@NotNull int id) {
		this.id = id;
		this.value=0;
	}
	
	
	/**
	 * Get the value of number
	 * @return value
	 */
	public int getId() {
		return id;
	}

	 /**
	  * Changes the name of this Student.
	  * @param id This number's new value.  
	  */
	public void setValue(@NotNull int value) {
		this.value = value;
	}
	
		/**
	 * Get the value of number
	 * @return value
	 */
	public int getValue() {
		return this.value;
	}

	 /**
	  * Changes the name of this Student.
	  * @param id This number's new value.  
	  */
	public void setId(@NotNull int id) {
		this.id = id;
	}
	
	 /**
	  * Override toString() method to return id of number instead of it's address 
	  * @return String 
	  */
	@Override
	public String toString() {
		return "ID = " + id+" , Value = "+value  ;
	}

}
