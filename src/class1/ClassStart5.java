package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 16;
        student1.grade = 90;

        Student student2 = new Student(); //주소를 보관하는 역할
        student2.name = "학생2";
        student2.age = 17;
        student2.grade = 80;

        //Student[] students = new Student[]{student1, student2};
        Student[] students = {student1, student2};


        for(int i =0; i< students.length; i++){
            System.out.println("이름:" + students[0].name + " 나이:" + students[0].age + " 성적:" + students[0].grade);
        }
        System.out.println(student1);
        System.out.println(student2);
    }
}
