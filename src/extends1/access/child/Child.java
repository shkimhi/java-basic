package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call(){
        publicValue = 1;
        protectedValue = 1; // 상속관계 or 같은 패키지( 여기서는패키지는 다르지만 상속관계라 가능)
        //defualtValue =1;; // 다른패키지 접근 X , 컴파일 에러
        //private =1 ; // 접근 X , 컴파일 에러

        publicMethod();
        protectedMethod(); //상속관계 or 같은 패키지( 여기서는패키지는 다르지만 상속관계라 가능)
        //defaultMethod();//다른패키지 접근 X , 컴파일 에러
        printParent();
    }
}
