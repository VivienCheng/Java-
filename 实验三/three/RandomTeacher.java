package three;

public class RandomTeacher {
    public static String[] getRandomTeachers(String[] teachers, int n) {
        String[] arr =  new String[n];
        String tmp = ",";
        for(int i = 0; i < n; ++i){
            int rand = (int)(Math.random() * teachers.length);
            if(!tmp.contains("," + rand + ",")){
                arr[i] = teachers[rand];
                tmp += rand + ",";
            }else{ i--; }
        }
        return arr;
    }
}