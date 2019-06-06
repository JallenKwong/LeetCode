package com.lun.other.clone;

import java.io.Serializable;

public class Department implements Cloneable, Serializable{

	private static final long serialVersionUID = 7020932274176768716L;

	private int id;
    private String name;
 
    public Department(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
 
	//Defined clone method in Department class.
	@Override
	protected Object clone() throws CloneNotSupportedException {
	    return super.clone();
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
}
