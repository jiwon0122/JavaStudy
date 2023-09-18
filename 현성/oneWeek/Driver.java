package oneWeek;

import oneWeek.CheckCardAccount;

public class Driver {
    public static void main(String[] args) {
        CheckCardAccount card = new CheckCardAccount(
                "선남"
                ,"1001"
                ,"0912"
        );
        card.setMoney(100000);
        System.out.println("100000원을 입금한다.");
        System.out.println("상품을 구매한다.");

        card.calc(card);
        card.contine();
        card.withdrawMoney();
        card.result(card);
    }
}
