package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age, int grade){
        System.out.println(name + age + grade);
        this.name =name;
        this.age = age;
        this.grade = grade;
    }
    MemberConstruct(String name, int age){
        /*
        this.name =name;
        this.age = age;
        this.grade = 50;
        */
        this(name, age, 50); // 중복 제거 가능. 생성자 코드 첫줄에만 작성 가능.
    }
}
