package com.deloitte.empl.applications;

import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;

public class DeleteRow {

	public static void main(String[] args) {
		EmpDao dao=new EmpDaoImpl();
		dao.delEmp(12);
		System.out.println("Deleted");
	}

}
