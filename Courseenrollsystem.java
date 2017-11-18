/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseenrollsystem;

import java.util.Scanner;

/**
 *
 * @author viju
 */
class CourseManagementSystem {

    Student[] students = new Student[1000];
    Course[] courses = new Course[100];

    int ccount;
    int scount;
    int enrollcount;
  //  Student student[] = new Student[1000];
  //  Course course[] = new Course[1000];

    void add_course(Course c) {
        courses[ccount] = c;
        ccount++;
    }

    void add_student(Student s) {
        students[scount] = s;
        scount++;
    }

    /*void enroll_course_studenr(Student s, Course c) {
        student[enrollcount] = s;
        course[enrollcount] = c;
        enrollcount++;

    } */

    void sprint() {
        for (int i = 0; i < scount; i++) {
            System.out.println(i + 1 + " :" + students[i]);
        }
    }

    void cprint() {
        for (int i = 0; i < ccount; i++) {
            System.out.println(i + 1 + ":" + courses[i]);
        }
    }

    Student sindex(int index) {
        return students[index];
    }

    Course cindex(int index) {
        return courses[index];

    }

    Student search(String s) {
        for (int i = 0; i < scount; i++) {
            if (s.equals(students[i].name)) {
                return students[i];

            }
        }
        return null;
    }

    Course csearch(String c) {
        for (int i = 0; i < ccount; i++) {
            if (c.equals(courses[i].name)) {
                return courses[i];

            }
        }
        return null;
    }

    /*void enrollprint() {
        for (int i = 0; i < enrollcount; i++) {
            System.out.println(Student.students[i] + ":" + course.course[i]);
        }
    }  */
}

public class Courseenrollsystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CourseManagementSystem enrollcourse = new CourseManagementSystem();
        int choice;
        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.println("1.Add New course\n");
            System.out.println("2.Add New student\n");
            System.out.println("3.enroll the student in course\n");
            System.out.println("4.print course taken by student\n");
            System.out.println("5.list of student for a course\n");
            System.out.println("6.search student \n");
            System.out.println("7.Exit\n");

            System.out.println("Enter your choice from the above menu:");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the name of the course: ");
                    String name = in.next();
                    Course course = new Course(name);
                   
                    enrollcourse.add_course(course);

                    break;

                case 2:
                    System.out.println("Enter the name of the student: ");
                    name = in.next();
                    System.out.println("Enter the Address of the student: ");
                    String address = in.next();
                    Student student = new Student(name , address);
                    enrollcourse.add_student(student);
                    break;
                case 3:
                   enrollcourse.sprint();
                    System.out.println("select student index : ");
                    int index = in.nextInt();
                    Student s = enrollcourse.sindex(index);
                    enrollcourse.cprint();
                    System.out.println("select name of the course: ");
                    index = in.nextInt();
                    Course c = enrollcourse.cindex(index);
                    s.addcourses(c);
                    c.addstudents(s);
                   // enrollcourse.enrollprint();
  
                    break;
                case 4:
                    enrollcourse.cprint();
                    System.out.println("select name of the course: ");
                    index = in.nextInt();
                    c = enrollcourse.cindex(index);
                    c.printstudent();
                     break;
                case 5:
                    enrollcourse.sprint();
                    System.out.println("select name of student: ");
                    index = in.nextInt();
                    s = enrollcourse.sindex(index);
                    s.printcourse();
                    break;

                case 6:
                    System.out.println("Enter the name of the student: ");
                    name = in.next();
                    enrollcourse.search(name);
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }
};
