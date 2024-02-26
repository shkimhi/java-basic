package ref.ex;

public class ProductOrderMain2 {

    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];
        productOrders[0] = createOrder("키보드", 2000,2);
        productOrders[1] = createOrder("마우스", 5000, 1);
        productOrders[2] = createOrder("스피커", 1500, 2);

        printOrders(productOrders);
        int totalAmount = getTotalAmount(productOrders); // Ctrl + alt + v;
        System.out.println("총 금액 : " + getTotalAmount(productOrders));
    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] productOrders){
        for(ProductOrder order : productOrders){
            System.out.println("상품명: "+order.productName+" 가격: "+order.price+" 수량: "+order.quantity);
        }
    }
    static int getTotalAmount(ProductOrder[] productOrder){
        int sum = 0;
        for (ProductOrder order : productOrder) {
            sum += order.price * order.quantity;
        }
        return sum;
    }

}
