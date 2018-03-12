package main;
import cn.net.sdkd.*;
import java.util.*;
import cn.sd.*;

public class Main {
	public static void main(String[] args) {
        Teacher[] teachers = new Teacher[6];
        teachers[0] = new Teacher(150112,"Tom",18,"Biology");
        teachers[1] = new Teacher(150217,"Vivien",20,"Economics");
        teachers[2] = new Teacher(150004,"Anna",19,"Traffic");
        teachers[3] = new Teacher(150155,"Jennifer",19,"Physics");
        teachers[4] = new Teacher(150107,"Sara",21,"Computer");
        teachers[5] = new Teacher(150039,"Alice",18,"Foreign Language");
        
        System.out.println("请选择方式1或者方式2来对老师进行排序:");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        if(op == 1) {
        	Arrays.sort(teachers);	
        }else {
        	Arrays.sort(teachers, new ByNoComparator());
        }
        
        for(Teacher t : teachers) {
        	System.out.println(t.toString());
        }
        System.out.println('\n'+"请输入想要找寻的老师姓名:");
        Scanner scc = new Scanner(System.in);
        String name = scc.nextLine();
        TeacherManagement tm = new TeacherManagement(teachers);
        String res = tm.search(name);
        System.out.println(res);

        sc.close();
        scc.close();
	}
}