package threeWeek;

import java.util.InputMismatchException;
import java.util.Scanner;

public class hsFlowerShop {

    public static void main(String[] args) {
        String flower[] = {"수선화", "장미", "카네이션", "튤립", "국화"};
        int price[] = {2000, 3000, 5000, 7000, 4000};

        Scanner sc = new Scanner(System.in);
        System.out.print("좋아하는 꽃을 입력하세요: ");
        String favoriteFlower = sc.next();

        //좋아하는 꽃이 있는지 체크
        boolean isFlower = false;
        int favoriteFlowernumber =0;
        for(int i=0; i<flower.length; i++){
            if(flower[i].equals(favoriteFlower)){
                isFlower = true;
                favoriteFlowernumber =i;
            }
        }
        //원하는 꽃의 송이 수 입력받기
        if (isFlower == false) {
            System.out.println("좋아하는 꽃이 없습니다.");
        }else {
            System.out.print("원하는 송이 수를 입력하세요:");
            try {
                int number = sc.nextInt();
                if(number <0)
                    throw new IllegalArgumentException("송이 수가 음수라서 총 가격을 계산할 수 없다");
                int total = price[favoriteFlowernumber]* number;
                System.out.print("가격이 "+price[favoriteFlowernumber]+"인 "
                        +flower[favoriteFlowernumber]+" "+(favoriteFlowernumber+1)+"송이의 가격 = "
                        +total);
            }catch (InputMismatchException e) {
                System.out.println("송이 수가 숫자가 아닙니다.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
