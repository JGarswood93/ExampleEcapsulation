package com.barton;

public class Encap{
    /**
     * Its all about behind the scenes code this is so that implementation can
     * always be changed
     *
     * Make Variables
     */
    private int ssn;
    private String empName;
    private int empAge;
    private String empStatus;

    /**
     * Getters and Setters
     * @return
     */

    public String getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(String empStatus) {
        this.empStatus = empStatus;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
}
