class Person{
    public String name;
    public int age;
    public void Displayperson(){
        System.out.println("I am "+name+" and I am "+age+" years old");
    }
}
class Student extends Person{
    public int rollno;
    public void DisplayStudent(){
        System.out.println("I am "+name+" my roll no is "+ rollno+" and I am "+age+" years old");
    }
}
class Main {
    public static void main(String[] args) {
        Student S1=new Student();
        S1.name="Raja";
        S1.age=20;
        S1.rollno=1025;
        S1.DisplayStudent();
    }
}
