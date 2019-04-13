package mypack;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MyClient {

	public static void main(String[] args) {
	
		Scanner  input=new Scanner(System.in);
		Configuration cfg=new Configuration();
		cfg.configure("DemoExample.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Emp emp=new Emp();
		System.out.println("Enter Employee No");
		Integer eno = input.nextInt();
		System.out.println("Enter Employee Name");
		String ename = input.next();
		System.out.println("Enter Employee Sal");
		Integer esal = input.nextInt();
		emp.setEno(eno);
		emp.setEname(ename);
		emp.setEsal(esal);
		s.update(emp);
		t.commit();
		s.close();
		System.out.println("Save........");


	}

}
