package poly.ex.pay2;

public class DefaultPay implements Pay {
    @Override
    public boolean pay(int amount) {
        System.out.println("결제정보없음");
        return false;
    }
}
