
package com.example.resultchecker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentResult {

    @Id
    private long rollNo;

    private String studentName;
    private int math;
    private int physics;
    private int chemistry;
    private String grade;

    public Long getRollNo() {
        return rollNo;
    }
    public void setRollNo(Long rollNo) {
        this.rollNo = rollNo;
    }

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getMath() {
        return math;
    }
    public void setMath(int math) {
        this.math = math;
    }
    public int getPhysics() {
        return physics;
    }
    public void setPhysics(int physics) {
        this.physics = physics;
    }
    public int getChemistry() {
        return chemistry;
    }
    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }

}
