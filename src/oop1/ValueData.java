package oop1;

public class ValueData { //데이터와 기능이 합쳐짐 .
    int value;

    void add(){ // 메서드는 객체를 생성해야 호출할 수 있다. 그런데 static이 붙으면 객체를 생성하지 않고도 메서드를 호출 할 수 있다.
        value++;
        System.out.println("숫자증가 value ="+ value);
    }
}
