package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);

        /*
        new Parent() instanceof Parent // true
        new Parent() instanceof Child // false
        new Child() instanceof Parent // true
        new Child() instanceof Child // true
         */
    }

    private static void call (Parent parent){
        //Child 인스턴스 인 경우 childMethod() 실행
        if(parent instanceof Child child){ // 자바 16에 추가된 기능 . instanceof 후 변수 선언 가능 .( Pattern Matching for instanceof )
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        }else{
            System.out.println("Child 인스턴스가 아님.");
        }
    }
}
