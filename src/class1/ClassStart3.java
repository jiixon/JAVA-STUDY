package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 17;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 18;
        student2.grade = 80;

        Student student3 = new Student();
        student3.name = "학생3";
        student3.age = 17;
        student3.grade = 70;

        System.out.println("이름: "+student1.name + " 나이: "+student1.age + " 점수: "+student1.grade);
        System.out.println("이름: "+student2.name + " 나이: "+student2.age + " 점수: "+student2.grade);
        System.out.println("이름: "+student3.name + " 나이: "+student3.age + " 점수: "+student3.grade);
    }
}
