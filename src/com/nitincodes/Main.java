package com.nitincodes;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
      /*  Write a program that would print the information (name, year of joining, salary,
          address) of three employees by creating a class named 'Employee'.
          The output should be as follows:
          Name        Year of joining        Address
       Robert            1994                64C- WallsStreat
       Sam               2000                68D- WallsStreat
       John              1999                26B- WallsStreat
       i have done this question by using array as an object:
       */
      Scanner sc = new Scanner(System.in);
      System.out.println("name  year of joining  Address");
      Employee arr[] = new Employee[3];
      for(int i=0;i< arr.length;i++){
          arr[i] = new Employee();
          arr[i].name = sc.next();
          arr[i].yearOfJoining = sc.nextInt();
          arr[i].address = sc.next();
      }
    }
}
class Employee{
    String name;
    int yearOfJoining;
    String address;
}
