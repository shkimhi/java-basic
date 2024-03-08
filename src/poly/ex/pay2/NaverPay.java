package poly.ex.pay2;

public class NaverPay implements Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("NaverPay");
        System.out.println("결제 금액 : " + amount);
        return true;
    }
}
