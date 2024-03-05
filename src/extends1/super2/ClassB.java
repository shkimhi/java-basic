package extends1.super2;

public class ClassB extends ClassA{

    public ClassB(int a) {
        this(a,0); // this로 자신의 생성자에게 넘기더라도 언젠가는 super를 호출 해야함.
        System.out.println("ClassB 생성자 a = "+ a);
    }
    public ClassB(int a,int b) {
        super(); // 기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a = "+ a + "b = "+b);
    }

}
