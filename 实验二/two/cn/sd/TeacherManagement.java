package cn.sd;
import cn.net.sdkd.*;

public class TeacherManagement {
	private Teacher[] teachers;
	public TeacherManagement(Teacher[] teachers) {this.teachers = teachers;}
	public Teacher[] getTeachers() {return teachers;}
	public void setTeachers(Teacher[] teachers) {this.teachers = teachers;}
	public String search(String name) {
		for(Teacher t : this.teachers) {
			if(name.equals(t.getName())) {
				String res = t.toString();
				return res;
			}
		}	
		return "没有符合条件的教师";
	}
}