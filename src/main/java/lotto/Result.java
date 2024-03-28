package lotto;

import static lotto.Application.matchArray;
import static lotto.LottoInput.lottoPrice;

public class Result {

    private static void printResult(){
        System.out.println("3개 일치 (5000원) - ");
        System.out.println("4개 일치 (50,000원) - ");
        System.out.println("5개 일치 (1,500,000원) - ");
        System.out.println("5개 일치, 보너스 볼 일치 (30,000,000원) - ");
        System.out.println("6개 일치 (2,000,000,000원) - ");
        System.out.println("총 수익률은 "+" 입니다.");
    }

    private static void letMatch(){
        for(int i=0;i<(lottoPrice/1000);i++){
            if(matchArray[i]==3){

            }
        }
    }
}
