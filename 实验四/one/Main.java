package one;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        System.out.print("请问是否继续录入?(Y/N)");
        while(true) {
            String op = sc.nextLine();
            if(op.equals("Y") || op.equals("y") ) {
                System.out.print("请输入学生的姓名和分数: ");
                String s = sc.nextLine();
                String[] arr = s.split(" ");
                Student student = new Student(arr[0], Integer.parseInt(arr[1]));
                students.add(student);
                System.out.print("请问是否继续录入?(Y/N)");
            }
            if(op.equals("N") || op.equals("n")){ break; }
        };

        ByScoreComparator com = new ByScoreComparator();
        Collections.sort(students,com);

        for(Student student : students){
            System.out.println(student.getName() + " " + student.getScore());
        }
        
        sc.close();
    }
}
/*
Ming 34
Tom 87
Anna 90
Alice 32
Bob 67
Vivien 93
*/