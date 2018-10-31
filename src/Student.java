/*
 * Zachary Miller
 * 16 july 2018
 * assignment 6.1
 * Student.java
 * This program creates instances of a student and sets a first and last name and a student id
 * Bellevue University
 */
public class Student {
	String firstName, lastName;
	int studentId;

	public Student(String first, String last, int id)
	{
		setFirstName(first);
		setLastName(last);
		setStudentId(id);
	}
	
	public void setFirstName(String first)
	{
		firstName = first;
	}
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setLastName(String last)
	{
		lastName = last;
	}
	public String getLastName()
	{
		return lastName;
	}
	
	public void setStudentId(int id)
	{
		studentId=id;
	}
	public int getStudentId()
	{
		return studentId;
	}
}
