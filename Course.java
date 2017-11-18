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
class Course {

    String name;
    int duration;
    int fees;
    int stcount ;
    Student students[] = new Student[1000];

    Course(String name1) {
          name = name1 ;
    }
    
    
    void print() {
        System.out.println("name :" + name);
        System.out.println("duration :" + duration);
        System.out.println("fees :" + fees);
    }

    void addstudents(Student s) {
        students[stcount++]= s;
    }
    void printstudent()
    {
        for(int i =0 ; i < stcount ; i++ )
        {
          System.out.println(students[i]); 
        }
    
    }

}
