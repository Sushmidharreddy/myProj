package com.transport.www;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class TransportModell 
{
	@Id
	private int id;
	
	private String name;
	
	private String gender;
	
	private int age;
	
	private Date dob;
	
	private String dpt;
}
