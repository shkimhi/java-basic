package poly.ex.pay2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayMain2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PayService payService = new PayService();

        String option = br.readLine();
        int amount  = Integer.parseInt(br.readLine());
        br.close();

        payService.processPay(option, amount);


    }


}
