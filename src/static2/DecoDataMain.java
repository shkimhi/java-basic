package static2;

public class DecoDataMain {

    public static void main(String[] args) {
        DecoData.staticCall(); // 정적 호출

        DecoData decoData = new DecoData();
        decoData.instanceCall(); // 인스턴스 호출

        DecoData decoData1 = new DecoData();
        decoData1.instanceCall(); // 인스턴스 호출

        DecoData.staticCall(decoData1);


    }

}
