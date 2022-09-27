package test;

import java.util.Comparator;

public class compimpl implements Comparator<StudentOne>{

	public int compare(StudentOne o1, StudentOne o2) {
		
		return o1.getLastName().compareTo(o2.getLastName());
	}

	
	
}
