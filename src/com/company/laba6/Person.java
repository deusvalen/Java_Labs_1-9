package com.company.laba6;

import java.util.Date;

/**
 * Created by User on 10.02.2018.
 */
public interface Person {
    int limityyyy = 1900;
    void setSurname(String surname);
    void setName(String name);
    void setFatherName(String fatherName);
    void setBirthday(int yyyy, int mm, int dd);
    String getSurname();
    String getName();
    String getFatherName();
    Date getBirthday();
}
