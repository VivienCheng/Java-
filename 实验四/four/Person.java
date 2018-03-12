package four;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) { this.name = name;this.age = age; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public boolean equals(Person p){
        if(p == null) return false;
        boolean res = false;
        if(p instanceof Person){
            Person p1 = (Person)p;
            if(this.getAge() == p1.getAge()) {
                return true;
            }
        }
        return res;
    }
    public String toString(){ return this.getName() + "-" + this.getAge(); }
}