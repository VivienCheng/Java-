package four;

public class Student {
    private int number;
    private String name;
    private String courseName;
    private int score;

    public int getNumber() { return number; }
    public void setNumber(int number) { this.number = number; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }
    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }
    public String toString(){
        return "ѧ��������" + this.getName() + " ѧ���γ̣�" + this.getCourseName() + " �γ̳ɼ���" + this.getScore();
    }
}