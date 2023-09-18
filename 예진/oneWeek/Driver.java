package study5;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //체크카드 계좌 생성
        CheckCardAccount account = new CheckCardAccount("선남", "1001", "0912");
        //초기 입금
        int initialDeposit = 100000;
        account.deposit(initialDeposit);
        System.out.println(initialDeposit + "원을 입금한다.");
        //청구 과정
        boolean Continue = true;
        while (Continue) {
            System.out.print("청구할 금액을 입력하세요: ");
            int chargeAmount = sc.nextInt();
            sc.nextLine();

            if (chargeAmount == 0) {
                Continue = false;
                break;
            }

            System.out.print("고객 이름을 입력하세요: ");
            String inputOwnerName = sc.nextLine();
            System.out.print("계좌 번호를 입력하세요: ");
            String inputAccountNumber = sc.nextLine();
            System.out.print("만기연월을 입력하세요: ");
            String inputExpirationDate = sc.nextLine();

            // 신원 확인 후 청구 처리
            account.useCard(inputOwnerName, inputAccountNumber, inputExpirationDate, chargeAmount);

            System.out.print("계속하시겠습니까(true 혹은 false): ");
            Continue = sc.nextBoolean();
            sc.nextLine();
        }

        // 현금 출금
        int withdrawalAmount = 20000;
        account.withdraw(withdrawalAmount);
        System.out.println(withdrawalAmount + "원을 출금한다.\n");

        //계좌정보 출력
        System.out.println(account.getAccountInfo());
    }
}
