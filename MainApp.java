
package com.UserDetailsSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        UserDetailsJDBCTemplate userDetailsJDBCTemplate =
                (UserDetailsJDBCTemplate)context.getBean("userDetailsJDBCTemplate");

        System.out.println("------Records Creation--------" );
        userDetailsJDBCTemplate.create(1, "rogers63", "david", "john", "Female", "e6a33eee180b07e563d74fee8c2c66b8", 1);
//        studentJDBCTemplate.create("Nuha", 2);
//        studentJDBCTemplate.create("Ayan", 15);
//
//        System.out.println("------Listing Multiple Records--------" );
//       List<Student> students = studentJDBCTemplate.listStudents();
//        for (Student record : students) {
//            System.out.print("ID : " + record.getId() );
//            System.out.print(", Name : " + record.getUsername() );
//            System.out.println(", Age : " + record.getAge());
//        }
//
//        System.out.println("----Updating Record with ID = 2 -----" );
//        studentJDBCTemplate.update(2, 20);
//
//        System.out.println("----Listing Record with ID = 2 -----" );
//        Student student = studentJDBCTemplate.getStudent(2);
//        System.out.print("ID : " + student.getId() );
//        System.out.print(", Name : " + student.getUsername() );
//        System.out.println(", Age : " + student.getAge());
    }
}