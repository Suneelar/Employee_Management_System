package com.jsp.EMPLOYEE_MS.services;

import java.util.List;

//Why we create interface not class 
//Because of abstraction :Show what to do,not how to do
//Service interfaces provide abstraction and hide implementation details.
//LOOSE COUPLING:without interface we cant achive loose coupling
public interface services {
//In services we write the Business logic
	List<Employee>getAllEmployees();
	
//	List is an interface from java.util[It rpresent ordered collection]
//	<Employee>:It is generic type[It means the list will contain only Employee objects]
//	get:used to reterive the data
//	AllEmployees: Fetch all employees from the system
}
