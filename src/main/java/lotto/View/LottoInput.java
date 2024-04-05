package lotto.View;

import org.kokodak.Console;

import java.util.List;

public class LottoInput {

    public static int lottoPrice;
    public static int bonusNumber;

    private static String[] inputArray;
    public static int[] answerNumber;

    static List<Integer> lottoanswer;

    public void purchaseCost(){
        System.out.println("구입 금액을 입력해주세요. ");
        lottoPrice=Integer.parseInt(Console.readLine());

        if(lottoPrice%1000!=0){
            System.out.println("[ERROR} 로또 금액을 잘못 입력하셨습니다.");
            throw new IllegalArgumentException();
        }
        System.out.println();
        System.out.println(lottoPrice/1000+"개를 구매했습니다.");
    }

    public void answerNumber(){
        System.out.println("당첨 번호를 입력해주세요.");
        inputArray = Console.readLine().split(",");
        answerNumber =new int[inputArray.length];
        for(int i=0;i<inputArray.length;i++){
            answerNumber[i]=Integer.parseInt(inputArray[i]);
        }
        System.out.println();
    }

    public void bonusNumber(){
        System.out.println("보너스 번호를 입력해주세요.");
        bonusNumber = Integer.parseInt(Console.readLine());
    }



}
