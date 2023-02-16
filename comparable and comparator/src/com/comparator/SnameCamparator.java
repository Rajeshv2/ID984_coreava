package com.comparator;

import java.util.Comparator;

public class SnameCamparator implements Comparator<Student>{

	@Override
	public int compare(Student a1, Student a2) {
	
		return a1.sname.compareTo(a2.sname);
	}

}
