package com.identify.product.FamilyKart.practise.streamsapi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map<Department, List<Student>>  departmentListMap=new HashMap<>();

        Department cseDept=new Department("CSE","Dr.ABC",101);
        Department eceDept=new Department("ECE","Dr.XYZ",102);
        Department mechDept=new Department("MECH","Dr.PQR",103);
        Department civilDept=new Department("CIVIL","Dr.LMN",104);

        List<Student> cseStudents=List.of(
                new Student(1,"John","Bangalore"),
                new Student(2,"Alice","Mumbai"),
                new Student(3,"Bob","Chennai")
        );
        List<Student> eceStudents=List.of(
                new Student(4,"David","Hyderabad"),
                new Student(5,"Eva","Pune")
        );
        List<Student> mechStudents=List.of(
                new Student(6,"Frank","Kochi"),
                new Student(7,"Grace","Ahmedabad")
        );
        departmentListMap.put(cseDept,cseStudents);
        departmentListMap.put(eceDept,eceStudents);
        departmentListMap.put(mechDept,mechStudents);
        departmentListMap.put(civilDept,null);


        for(Map.Entry<Department,List<Student>> entry:departmentListMap.entrySet())
        {

            Department key = entry.getKey();
            List<Student> value = entry.getValue();


             if(value==null)
             {
                 System.out.println("no of students in department " + key.getDeptName()+ " is 0");
                 departmentListMap.putIfAbsent(key,List.of(
                         new Student(8,"Eric","New York"),
                         new Student(9,"Sophia","Los Angeles")
                 ));

                 System.out.println( "After adding new students, no of students in department " + key.getDeptName()+ " is " + departmentListMap.get(key));
             }
if(value!=null)
            System.out.println("key "+key +" value "+value);

        }




    }
}
