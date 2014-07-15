package com.ycx.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * A entity. @author MyEclipse Persistence Tools
 */

public class A implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer var;
	private Set bs = new HashSet(0);

	// Constructors

	/** default constructor */
	public A() {
	}

	/** minimal constructor */
	public A(Integer var) {
		this.var = var;
	}

	/** full constructor */
	public A(Integer var, Set bs) {
		this.var = var;
		this.bs = bs;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getVar() {
		return this.var;
	}

	public void setVar(Integer var) {
		this.var = var;
	}

	public Set getBs() {
		return this.bs;
	}

	public void setBs(Set bs) {
		this.bs = bs;
	}

}