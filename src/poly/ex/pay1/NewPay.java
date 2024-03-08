package poly.ex.pay1;

public class NewPay implements Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("newPay 연결");
        System.out.println(amount+ "원 결제 시도");
        return true;
    }
}
