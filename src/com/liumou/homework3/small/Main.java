package com.liumou.homework3.small;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("学生A"));
        students.add(new Student("学生B"));
        students.add(new Student("学生C"));
        // 添加更多的学生

        List<Candidate> candidates = new ArrayList<>();
        candidates.add(new Candidate("候选人A"));
        candidates.add(new Candidate("候选人B"));
        candidates.add(new Candidate("候选人C"));
        // 添加更多的候选人

        Election election = new Election(students, candidates);
        election.conductElection();
    }
}
