package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
        //인스턴스 변수 , 인스턴스 메서드에는 접근 불가능
        //instanceValue++;
        //instanceMethod()//
        staticValue++; // 정적 변수에 접근
        staticMethod(); // 정적 메서드 접근
    }

    public void instanceCall(){
        instanceValue++; // 인스턴스 변수 접근 가능
        instanceMethod(); // 인스턴스 메서드 접근 가능

        staticValue++; // 정적 변수 접근 가능
        staticMethod(); // 정적 메서드 접근 가능
    }

    public static void staticCall(DecoData data){
        data.instanceValue++;
        data.instanceMethod();
    }

    private void instanceMethod(){
        System.out.println(instanceValue);
    }
    private static void staticMethod(){
        System.out.println(staticValue);
    }


}
