package com.onebill.corejava.basics.Assignment28;

import java.util.Comparator;

public class SortById implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.empid - o1.empid;

	}

}
