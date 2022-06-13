package com.kodilla.patterns.observer.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentHomework implements Observable{
    private List<Homework> homeworks;
    private String studentName;
    private Observer mentor;

    public StudentHomework(String studentName) {
        this.homeworks = new LinkedList<>();
        this.studentName = studentName;
    }

    @Override
    public void chooseMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    @Override
    public void addHomework(Homework homework) {
        homeworks.add(homework);
        notifyMentor(homeworks.size());
    }

    @Override
    public void notifyMentor(int homeworksSize) {
        mentor.notifyUpdate(studentName,homeworksSize);
    }

    public List<Homework> getHomeworks() {
        return homeworks;
    }

    public String getStudentName() {
        return studentName;
    }

    public Observer getMentor() {
        return mentor;
    }
}
