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
                System.err.println("�������˳�");
                break;
            } else if ("#1".equalsIgnoreCase(code)) {
                String tmpStr = null;
                int tmpInt;
                while (true) {
                    System.out.print("ѧ��ѧ�ţ�");
                    tmpInt = s.nextInt();
                    student = new Student();
                    student.setNumber(tmpInt);
                    System.out.print("ѧ��������");
                    tmpStr = s.next();
                    student.setName(tmpStr);
                    System.out.print("ѧ���γ̣�");
                    tmpStr = s.next();
                    student.setCourseName(tmpStr);
                    System.out.print("�γ̳ɼ���");
                    tmpInt = s.nextInt();
                    student.setScore(tmpInt);
                    datas.add(student);
                    System.out.println("����exit������Ϣ¼��,������������¼��");
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
                        System.out.println("����ɹ�");
                        saveStudents(datas);
                    } else {
                        System.err.println("�޿ɱ����ѧ����Ϣ");
                    }
                } catch (IOException e) {
                    System.err.println("����ѧ����Ϣ�쳣");
                    e.printStackTrace();
                }
            } else if ("#2".equalsIgnoreCase(code)) {
                List<Student> students = readStudentDat(studentDat);
                if (students == null || students.size() == 0) {
                    System.err.println("����ѧ����Ϣ");
                    showMenu();
                } else {
                    System.err.println("����ѧ��������" + students.size());
                    for(Student stu : students){ // ���ѧ����Ϣ
                        System.out.println(stu.toString());
                    }
                }
            } else {
                System.err.println("�޷�ʶ��Ĳ˵�");
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
        System.out.println("----------#1��¼��ѧ����Ϣ----------");
        System.out.println("----------#2���鿴ѧ����Ϣ----------");
        System.out.println("----------#3������ѧ����Ϣ----------");
        System.out.println("----------#4���˳�----------");
        System.out.println("-----------------------------------------------");
    }
}