package com.comparator;

import java.util.Comparator;

public class SidComparator  implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.sid==o2.sid)
			return 0;
		else if(o1.sid>o2.sid)
			return 1;
		else
		return -1;
	}

	

}
