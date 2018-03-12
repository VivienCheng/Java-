package one;

import java.util.*;
public class ByScoreComparator implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s2.getScore() - s1.getScore();
    }
}
