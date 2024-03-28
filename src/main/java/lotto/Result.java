package lotto;

import static lotto.Application.bonusArray;
import static lotto.Application.matchArray;
import static lotto.LottoInput.lottoPrice;

public class Result {

    static int[] result=new int[5];

    static void printResult(){
        System.out.println("3개 일치 (5000원) - "+result[0]);
        System.out.println("4개 일치 (50,000원) - "+result[1]);
        System.out.println("5개 일치 (1,500,000원) - "+result[2]);
        System.out.println("5개 일치, 보너스 볼 일치 (30,000,000원) - "+result[3]);
        System.out.println("6개 일치 (2,000,000,000원) - "+result[4]);
        System.out.println("총 수익률은 "+" 입니다.");
    }

    static void letMatch(){
        result[0]=0;
        result[1]=0;
        result[2]=0;
        result[3]=0;
        result[4]=0;

        for(int i=0;i<(lottoPrice/1000);i++){
            if(matchArray[i]==3){
                result[0]++;
            } else if(matchArray[i]==4){
                result[1]++;
            } else if(matchArray[i]==5&&bonusArray[i]!=1){
                result[2]++;
            } else if(matchArray[i]==5&&bonusArray[i]==1){
                result[3]++;
            } else if(matchArray[i]==6){
                result[4]++;
            }
        }
    }
}
