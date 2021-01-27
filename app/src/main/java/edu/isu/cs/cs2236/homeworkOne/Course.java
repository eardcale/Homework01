package edu.isu.cs.cs2236.homeworkOne;

import com.google.common.collect.Lists;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Objects;

public class Course { //instance variables
    private int number;
    private String subject;
    private String title;
    private int credits;
    private int index;
    private static String[] departments = {"BTNY","CHEM","CS","MATH","PHYS","ZOO"};

    public Course(int number, int subject, String title, int credits) {
        this.number = number;
        this.subject = departments[subject];
        this.title = title;
        this.credits = credits;
        this.index = subject;
    }

    public int getNumber() {
        return number;
    }

    public String getSubject() {
        return subject;
    }

    public String getTitle() {
        return title;
    }

    public int getCredits() {
        return credits;
    }

    public int getIndex() {
        return index;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return getNumber() == course.getNumber() && getCredits() == course.getCredits() && Objects.equals(getSubject(), course.getSubject()) && Objects.equals(getTitle(), course.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber(), getSubject(), getTitle(), getCredits());
    }

    @Override
    public String toString() {
        return subject+" "+number+" "+title+"    "+credits+" credits";
    }
}
