package static2;

import static static2.DecoData.staticCall;

public class DecoDataMain {

    public static void main(String[] args) {
        staticCall(); // 정적 호출

        DecoData decoData = new DecoData();
        decoData.instanceCall(); // 인스턴스 호출

        DecoData decoData1 = new DecoData();
        decoData1.instanceCall(); // 인스턴스 호출

        staticCall(decoData1);

        //추가 , 인스턴스를 통한 접근
        DecoData decoData3 = new DecoData();
        decoData3.staticCall(); //인스턴스를 메서드를 호출하는것 같은 착각을 줌. ( 가독성 X)

        staticCall();


    }

}
