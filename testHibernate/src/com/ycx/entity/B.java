package com.ycx.entity;

/**
 * B entity. @author MyEclipse Persistence Tools
 */

public class B implements java.io.Serializable {

	// Fields

	private Integer id;
	private A a;

	// Constructors

	/** default constructor */
	public B() {
	}

	/** full constructor */
	public B(A a) {
		this.a = a;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public A getA() {
		return this.a;
	}

	public void setA(A a) {
		this.a = a;
	}

}