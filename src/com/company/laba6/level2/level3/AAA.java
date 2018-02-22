package com.company.laba6.level2.level3;

import com.company.laba6.level2.Student;

import java.util.Date;

/**
 * Created by User on 10.02.2018.
 */
public class AAA implements Student {

    private String name;
    private String surname;
    private String fatherName;
    private Date birthday;
    private String university;
    private Date firstDate;

    @Override
    public void setSurname(String surname) {
    this.surname = surname;
    }

    @Override
    public void setName(String name) {
    this.name = name;
    }

    @Override
    public void setFatherName(String fatherName) {
    this.fatherName = fatherName;
    }

    @Override
    public void setBirthday(int yyyy, int mm, int dd) {
        if(yyyy < limityyyy) {
            birthday.setYear(yyyy);
        } else {
            birthday.setYear(0);
        }
    birthday.setMonth(mm);
    birthday.setDate(dd);
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getFatherName() {
        return fatherName;
    }

    @Override
    public Date getBirthday() {
        return birthday;
    }

    @Override
    public void setFirstDate(Date d) {
    firstDate = (Date) d.clone();
    }

    @Override
    public Date getFirstDate() {
        return firstDate;
    }

    @Override
    public void setUniversity(String u) {
        if(u.length() < limitUniversityLength) {
            university = "Default";
        } else {
            university = u;
        }
    }

    @Override
    public String getUniversity() {
        return university;
    }
}
