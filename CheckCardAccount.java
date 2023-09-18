package oneWeek;

import java.util.Scanner;

public class CheckCardAccount {
    Scanner sc = new Scanner(System.in);

    private String name;        //계좌 소유자 이름
    private String account;     //계좌번호
    private String date;        //만기연월
    private int money;          //통장 잔고

    public CheckCardAccount(String name, String account, String date) {
        this.name = name;
        this.account = account;
        this.date = date;
    }

    public void withdrawMoney(){
        System.out.println("20000원을 출금한다"+"\n");
        this.setMoney(this.getMoney()-20000);
    } //출금하는 메서드 만들기


    public void contine(){
        System.out.println("계속하시겠습니까(true 혹은 false): ");
        String str = sc.next();
        while(true){
        if(str.equals("true"))
            this.calc(this);
        else if(str.equals("false")){
            this.calc(this);
            break;
        }
        }
    }

    private boolean checkMember(String name , String account , String date){//신원확인을 위한 메서드
        if(name.equals(this.getName())
                && account.equals(this.getAccount())
                && date.equals(this.getDate()))
            return true;
        return false;
    }

    public void calc (CheckCardAccount card){

        System.out.println("청구 금액을 입력하세요: ");
        int cash = sc.nextInt();
        System.out.println("고객 이름을 입력하세요: ");
        String name = sc.next();
        System.out.println("고객 번호를 입력하세요: ");
        String account = sc.next();
        System.out.println("카드 만기연월을 입력하세요: ");
        String date = sc.next();

        if(checkMember(name , account , date)){
            System.out.println("신원 확인 성공");
            if(card.getMoney()>= cash){
            int restMoney = card.getMoney() - cash;
            card.setMoney(restMoney);
            }
            else{
                System.out.println("잔고초과");
            }
        } else{
            System.out.println("신원 확인 실패");
        }
    }

    public void result(CheckCardAccount checkCardAccount){
        System.out.println("예금주 이름: "
                + checkCardAccount.getName());
        System.out.println("계좌번호: "
                +checkCardAccount.getAccount());
        System.out.println("만기연월: "
                +checkCardAccount.getDate());
        System.out.println("잔고: "
                +checkCardAccount.getMoney());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
