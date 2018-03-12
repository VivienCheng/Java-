package four;

import java.util.*;
import java.io.*;

public class StudentMgr {
    public static final String studentDat = "/Users/chengxiaohua/Desktop/data.dat";

    public static void main(String[] args) {
        showMenu();
        Scanner s = new Scanner(System.in);
        String code = null;
        Student student;
        List<Student> datas = new ArrayList<>();
        while (true) {
            code = s.next();
            if ("#4".equalsIgnoreCase(code)) {
                System.err.println("程序已退出");
                break;
            } else if ("#1".equalsIgnoreCase(code)) {
                String tmpStr = null;
                int tmpInt;
                while (true) {
                    System.out.print("学生学号：");
                    tmpInt = s.nextInt();
                    student = new Student();
                    student.setNumber(tmpInt);
                    System.out.print("学生姓名：");
                    tmpStr = s.next();
                    student.setName(tmpStr);
                    System.out.print("学生课程：");
                    tmpStr = s.next();
                    student.setCourseName(tmpStr);
                    System.out.print("课程成绩：");
                    tmpInt = s.nextInt();
                    student.setScore(tmpInt);
                    datas.add(student);
                    System.out.println("输入exit结束信息录入,输入其他继续录入");
                    tmpStr = s.next();
                    if ("exit".equalsIgnoreCase(tmpStr)) {
                        break;
                    }
                }
                if ("exit".equalsIgnoreCase(tmpStr)) {
                    showMenu();
                    continue;
                }
            } else if ("#3".equalsIgnoreCase(code)) {
                try {
                    if (datas.size() > 0) {
                        System.out.println("保存成功");
                        saveStudents(datas);
                    } else {
                        System.err.println("无可保存的学生信息");
                    }
                } catch (IOException e) {
                    System.err.println("保存学生信息异常");
                    e.printStackTrace();
                }
            } else if ("#2".equalsIgnoreCase(code)) {
                List<Student> students = readStudentDat(studentDat);
                if (students == null || students.size() == 0) {
                    System.err.println("暂无学生信息");
                    showMenu();
                } else {
                    System.err.println("已有学生人数：" + students.size());
                    for(Student stu : students){ // 输出学生信息
                        System.out.println(stu.toString());
                    }
                }
            } else {
                System.err.println("无法识别的菜单");
                showMenu();
            }
        }
        s.close();
    }

    public static List<Student> readStudentDat(String fileName) {
        if (fileName != null && !"".equals(fileName)) {
            File file = null;
            file = new File(fileName);
            Student student = null;
            if (file.exists()) {
                List<Student> datas = new ArrayList<>();
                try {
                    InputStream is = new FileInputStream(file);
                    BufferedReader br = new BufferedReader(new InputStreamReader(is, "gb2312"));
                    String str = null;
                    String[] infos = null;
                    while (true) {
                        str = br.readLine();
                        if (str != null) {
                            student = new Student();
                            str = br.readLine();
                            infos = str.split("#");
                            student.setNumber(Integer.parseInt(infos[0]));
                            student.setName(infos[1]);
                            student.setCourseName(infos[2]);
                            student.setScore(Integer.parseInt(infos[3]));
                            datas.add(student);
                        } else {
                            break;
                        }
                    }
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return datas;
            }
        }
        return null;
    }

    public static void saveStudents(List<Student> students) throws IOException {
        File file = new File(studentDat);
        if (!file.exists()) {
            file.createNewFile();
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
        StringBuffer sb = new StringBuffer();
        Student s = null;
        for (int i = 0; i < students.size(); i++) {
            s = students.get(i);
            sb.setLength(0);
            sb.append(s.getNumber() + "#" + s.getName() + "#" + s.getCourseName() + "#" + s.getScore());
            bw.write(sb.toString());
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    public static void showMenu() {
        System.out.println("-----------------------------------------------");
        System.out.println("----------#1、录入学生信息----------");
        System.out.println("----------#2、查看学生信息----------");
        System.out.println("----------#3、保存学生信息----------");
        System.out.println("----------#4、退出----------");
        System.out.println("-----------------------------------------------");
    }
}