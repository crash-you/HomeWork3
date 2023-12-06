package com.liumou.homework3.small;

import java.util.List;
import java.util.Scanner;

public class Election {
    private List<Student> students;
    private List<Candidate> candidates;

    public Election(List<Student> students, List<Candidate> candidates) {
        this.students = students;
        this.candidates = candidates;
    }

    public void conductElection() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("候选人列表：");
            for (int i = 0; i < candidates.size(); i++) {
                System.out.println(i + ": " + candidates.get(i).getName());
            }

            System.out.print("请输入候选人编号进行投票（输入-1结束投票）：");
            int choice = scanner.nextInt();

            if (choice == -1) {
                System.out.println("投票结束");
                break;
            }

            if (choice < 0 || choice >= candidates.size()) {
                System.out.println("无效的候选人编号，请重新输入。");
                continue;
            }

            Student currentStudent = students.get(choice);

            if (currentStudent.hasVoted()) {
                System.out.println("请勿重复投票。");
            } else {
                currentStudent.vote();
                candidates.get(choice).incrementVotes();
                System.out.println("感谢你的投票！");
                System.out.println("---------------------------");
            }
        }

        System.out.println("投票结果：");
        for (Candidate candidate : candidates) {
            System.out.println(candidate.getName() + ": " + candidate.getVotes() + "票");
        }

        scanner.close();
    }
}
