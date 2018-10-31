/*
 * Zachary Miller
 * 16 July 2018
 * ClassRoster.java
 * This program creates 20 instances of the student class and then places them in a list. The list is then printed both in the order entered and in reverse order
 * Bellevue University
 */
import java.util.LinkedList;
public class ClassRoster {

	public static void main(String[] args) {
		String tempFName,tempLName;
		int tempId;
		LinkedList <Student> students = new LinkedList<Student>();
		students.add(new Student("Zach", "Miller", 101));
		students.add(new Student("Raven", "Leal", 102));
		students.add(new Student("Tommy", "Jones", 103));
		students.add(new Student("Zachary", "Sullivan", 104));
		students.add(new Student("Christopher", "Bachenberg", 105));
		students.add(new Student("Willian", "Quick", 106));
		students.add(new Student("Jeremy", "Davis", 107));
		students.add(new Student("Sean", "McGee", 108));
		students.add(new Student("Scott", "Brinson", 109));
		students.add(new Student("Evan", "Tougas", 110));
		students.add(new Student("Wayne", "Hartman", 111));
		students.add(new Student("Maxwell", "Moolah", 112));
		students.add(new Student("Chris", "Fantroy", 113));
		students.add(new Student("Ron", "Saxon", 114));
		students.add(new Student("Evar", "Johnson", 115));
		students.add(new Student("Justin", "Biggs", 116));
		students.add(new Student("Weston", "Lee", 117));
		students.add(new Student("Galen", "Mandes", 118));	
		students.add(new Student("Louis", "Merlo", 119));
		students.add(new Student("James", "Pennington", 120));
		
		System.out.println("order entered:");

		for(int i=0; i<students.size(); i++)
		{
			tempFName = students.get(i).getFirstName();
			tempLName = students.get(i).getLastName();
			tempId=students.get(i).getStudentId();
			System.out.println("Student "+(i+1)+": "+tempFName+" "+tempLName+" "+tempId);
		}
		
		System.out.println("\n\n reverse order:");
		for(int i=19; i>=0; i--)
		{
			tempFName = students.get(i).getFirstName();
			tempLName = students.get(i).getLastName();
			tempId=students.get(i).getStudentId();
			System.out.println("Student "+(i+1)+": "+tempFName+" "+tempLName+" "+tempId);
		}
	}
}
