package com.barton;

public class EncapRun {
    public static void main(String[] args) {
        /**
         * Implementations
         *
         * Instances of the class
         *
         * Set the variables
         */
       Encap ob = new Encap();
       ob.setEmpName("Mario");
       ob.setEmpAge(32);
       ob.setSsn(123456);
       ob.setEmpStatus("Married");

        Encap obj = new Encap();
        obj.setEmpName("louigy");
        obj.setEmpAge(32);
        obj.setSsn(123457);
        obj.setEmpStatus("Single");


        System.out.println("Employee Name: " + ob.getEmpName());
        System.out.println("Employee SSN: " + ob.getSsn());
        System.out.println("Employee Age: " + ob.getEmpAge());

        System.out.println("\nEmployee Name: " + obj.getEmpName());
        System.out.println("Employee SSN: " + obj.getSsn());
        System.out.println("Employee Age: " + obj.getEmpAge());

    }
    /**
     * Next with this file
     *
     * 1) employee ID can only be so many characters long
     *
     * 2) add more data to be encapsulated
     *
     * 3)
     */
}