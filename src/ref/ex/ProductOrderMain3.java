package ref.ex;

import java.io.*;

public class ProductOrderMain3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.print("상품 개수를 입력하세요 :");
        ProductOrder[] productOrders = new ProductOrder[Integer.parseInt(br.readLine())];
        for(int i =0; i < productOrders.length; i++){
            productOrders[i] = createOrder(br.readLine(),Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()));
        }

        printOrders(productOrders);
        int totalAmount = getTotalAmount(productOrders); // Ctrl + alt + v;
        bw.write("총 금액 : " + getTotalAmount(productOrders));
        bw.close();
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
