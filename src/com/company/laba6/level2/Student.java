package com.company.laba6.level2;

import com.company.laba6.Person;

import java.util.Date;

/**
 * Created by User on 10.02.2018.
 */
public interface Student extends Person {
    int limitUniversityLength = 100;
    void setFirstDate(Date d);
    Date getFirstDate();
    void setUniversity (String u);
    String getUniversity();
}
