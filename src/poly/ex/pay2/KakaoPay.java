package poly.ex.pay2;

public class KakaoPay implements Pay{

    @Override
    public boolean pay(int amount) {
        System.out.println("KakaoPay");
        System.out.println("결제 금액 : " + amount);
        return true;
    }
}
