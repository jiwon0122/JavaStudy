package study5;

public class CheckCardAccount {
    private String ownerName; //소유자이름
    private String accountNumber; //계좌번호
    private String expirationDate; //만기연월
    private int balance; //잔고
    //클래스 멤버 변수 정의

    public CheckCardAccount(String ownerName, String accountNumber, String expirationDate) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.expirationDate = expirationDate;
        this.balance = 0;
    } // 생성자 메소드

    public boolean verifyIdentity(String inputOwnerName, String inputAccountNumber, String inputExpirationDate) {
        if (inputOwnerName.equals(ownerName) && inputAccountNumber.equals(accountNumber) && inputExpirationDate.equals(expirationDate)) {
            System.out.println("신원 확인 성공");
            return true;
        } else {
            System.out.println("신원 확인 실패");
            return false;
        }
    } // 신원확인 메소드

    public void useCard(String inputOwnerName, String inputAccountNumber, String inputExpirationDate, int chargeAmount) {
        if (verifyIdentity(inputOwnerName, inputAccountNumber, inputExpirationDate)) {
            if (chargeAmount > 0) {
                balance -= chargeAmount;
                if (balance < 0) {
                    System.out.println("잔고 초과");
                    balance += chargeAmount;
                }
            } else {
                System.out.println("잘못된 청구 금액");
            }
        } else {
            System.out.println("잘못된 신원 정보");
        }
    } // 카드사용 메소드

    public void deposit(int depositAmount) {
        if (depositAmount > 0) {
            balance += depositAmount;
        }
    } // 입금 메소드

    public void withdraw(int withdrawalAmount) {
        if (withdrawalAmount > 0) {
            balance -= withdrawalAmount;
            if (balance < 0) {
                System.out.println("잔고 초과");
            }
        }
    } // 출금 메소드

    public String getAccountInfo() {
        return "예금주 이름: " + ownerName + "\n계좌번호: " + accountNumber + "\n만기연월: " + expirationDate + "\n잔고: " + balance;
    } // 계좌정보 메소드
}

