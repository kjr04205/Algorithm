package StudyList;

import java.util.Objects;

public class Student {
	String name;
	String number;
	int birthYear;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + ", birthYear=" + birthYear + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(birthYear, name, number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return birthYear == other.birthYear && Objects.equals(name, other.name) && Objects.equals(number, other.number);
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "테스터";
		s1.number = "010-7777-7777";
		s1.birthYear = 1997;
		
		Student s2 = new Student();
		s2.name = "테스터";
		s2.number = "010-7777-7777";
		s2.birthYear = 1997;
		
		//toString
		System.out.println(s1);
		System.out.println(s2);
		
		//equals
		System.out.println(s1.equals(s2));
		
		//hashCode
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
