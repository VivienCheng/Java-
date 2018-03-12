package four;

import java.util.*;

public class ByAgeComparator implements Comparator<Person>{
    public int compare(Person p1,Person p2){
        return  p2.getAge()- p1.getAge();
    }
}