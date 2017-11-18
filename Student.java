/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseenrollsystem;

/**
 *
 * @author viju
 */
class Student {

    String name;
    String address;
    int cocount ;
    
    Course course[] = new Course[1000];

    Student(String name1, String address1) {
        
        name = name1 ;
        address = address1;
    }
    

    void print() {
        System.out.println("name :" + name);
        System.out.println("address :" + address);
    }

    void addcourses(Course c) {
        course[cocount++]= c;
    }
      void printcourse()
    {
        for(int i =0 ; i < cocount ; i++ )
        {
          System.out.println(course[i]); 
        }
    
    }
}
