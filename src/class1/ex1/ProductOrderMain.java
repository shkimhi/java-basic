package class1.ex1;

public class ProductOrderMain {

    public static void main(String[] args) {
        ProductOrder keyboard = new ProductOrder();
        ProductOrder mouse = new ProductOrder();
        ProductOrder speaker = new ProductOrder();

        keyboard.productName="키보드";
        keyboard.price=2000;
        keyboard.quantity=2;

        mouse.productName="마우스";
        mouse.price=5000;
        mouse.quantity=1;

        speaker.productName="스피커";
        speaker.price=1500;
        speaker.quantity=2;

        int sum = 0;

        ProductOrder[] productOrders = {keyboard,mouse,speaker};

        for (ProductOrder productOrder : productOrders) {
            sum += productOrder.price * productOrder.quantity;
            System.out.println("상품명: "+productOrder.productName+" 가격: "+productOrder.price+" 수량: "+productOrder.quantity);
        }
        System.out.println("총 결제 금액: "+sum);



    }
}
