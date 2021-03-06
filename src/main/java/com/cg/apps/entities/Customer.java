package com.cg.apps.entities;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Table(name="customers")
@Entity
public class Customer 
{
	@GeneratedValue
	@Id
	private Long id;
	private String name;
	
	public Customer() 
	{}
	
	public Customer(String name) 
	{
		super();
		this.name = name;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		int hashCode=Objects.hashCode(id);
		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer that = (Customer) obj;
	    return this.id.equals(that.id);
	}
	
}
