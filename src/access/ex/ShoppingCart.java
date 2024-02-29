package access.ex;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Item> cart = new ArrayList<>();


    public void addItem(Item item){
        if(cart.size() >= 10){
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        cart.add(item);
    }

    public void displayItems(){
        int sum =0;
        for (Item item : cart) {
            System.out.println("상품명 : "+ item.getName()+ "합계 : "+item.getTotalPrice());
            sum += item.getTotalPrice();
        }
        System.out.println("전체 가격 합 :" + sum);
    }



}
