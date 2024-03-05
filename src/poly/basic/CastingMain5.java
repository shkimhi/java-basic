package poly.basic;

public class CastingMain5 {
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
        if(parent instanceof Child){ //인스턴스가 맞으면 ture , 아니면 false
            System.out.println("Child 인스턴스 맞음");
            ((Child) parent).childMethod();
        }else{
            System.out.println("Child 인스턴스가 아님.");
        }
    }
}
