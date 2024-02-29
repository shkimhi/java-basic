package static1;

import memory.Data;

public class DataCountMain3 {

    public static void main(String[] args) {
        Data3 data1 = new Data3("a");
        System.out.println(Data3.count);
        Data3 data2 = new Data3("b");
        System.out.println(Data3.count);
        Data3 data3 = new Data3("c");
        System.out.println(Data3.count);

        //추가
        //인스턴스를 통한 접근 ( 권장 X ) ( 인스턴스 변수에 접근하는 것 처럼 보임 )
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);

        //클래스를 통한 접근
        System.out.println(Data3.count);
    }
}
