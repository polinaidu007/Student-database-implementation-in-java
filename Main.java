import java.util.*;
public class Main {

	public static void main(String[] args) {
		StudentOperationImplementation s = new StudentOperationImplementation();
		Student [] l = new Student[5];
			Student s1 = new Student(5,"poli",new Date(1997,10,21),90);
			Student s2 = new Student(4,"anitha",new Date(1997,10,21),90);
			Student s3 = new Student(3,"mouni",new Date(1997,10,21),90);
			Student s4 = new Student(2,"satya",new Date(1997,10,21),90);
			Student s5 = new Student(1,"vidya",new Date(1997,10,21),90);
		l[0] = s1;
		l[1] = s2;
		l[2] = s3;
		l[3] = s4;
		l[4] = s5;
		System.out.println("Initial list:");
		s.setStudents(l);
		Student arr[]=s.getStudents();
		for(Student x:arr)
			System.out.println(x);
		
		System.out.println("After adding 2 elements:");
		s.addFirst(new Student(100,"chs",new Date(1997,10,21),90));
		s.addLast(new Student(80,"spn",new Date(1997,10,21),90));
		arr=s.getStudents();
		for(Student x:arr)
			System.out.println(x);

		System.out.println("After sorting:");	
		s.bubbleSort();
		arr=s.getStudents();
		for(Student x:arr)
			System.out.println(x);


		System.out.println("After removing elements:");	
		s.remove(5);
		s.remove(s1);
		arr=s.getStudents();
		for(Student x:arr)
			System.out.println(x);
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
	}

}
