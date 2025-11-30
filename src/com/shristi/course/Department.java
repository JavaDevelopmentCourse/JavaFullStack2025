package com.identify.product.FamilyKart.practise.streamsapi;

public class Department {

    public Department(){

    }



    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptHead() {
        return deptHead;
    }

    public void setDeptHead(String deptHead) {
        this.deptHead = deptHead;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    String deptName;
    String deptHead;
    int deptId;

    public Department(String deptName, String deptHead, int deptId) {
        this.deptName = deptName;
        this.deptHead = deptHead;
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptName='" + deptName + '\'' +
                ", deptHead='" + deptHead + '\'' +
                ", deptId=" + deptId +
                '}';
    }
}
