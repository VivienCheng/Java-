package cn.net.sdkd;
import java.util.*;

public class ByNoComparator implements Comparator<Teacher> {
	public int compare(Teacher t1, Teacher t2) {return t1.compareTo(t2);	}
}