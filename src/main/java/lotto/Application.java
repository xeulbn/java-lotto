package lotto;


import org.kokodak.Randoms;

import java.util.ArrayList;
import java.util.List;

import static lotto.LottoController.*;
import static lotto.LottoInput.answerNumber;
import static lotto.LottoInput.bonusNumber;

public class Application {
    private static List<Lotto> lottoList;
    static int[] matchArray;
    static int[] bonusArray;

    public static void main(String[] args) {
        LottoInput input = new LottoInput();

        input.purchaseCost();

        int lottoPrice = input.lottoPrice;

        LottoController purchase = new LottoController();
        lottoList=purchase.makeLottoList(lottoPrice/1000);
        System.out.println();
        input.answerNumber(); //당첨번호 입력
        input.bonusNumber(); //보너스 번호 입력
        System.out.println();
        matchArray=new int[lottoPrice/1000];
        System.out.println("당첨 통계");
        System.out.println("-----");
        matchArray=countOfMatch(lottoList,answerNumber);
        bonusArray=bonusBallMatch(lottoList);
        Result.letMatch();
        Result.printResult();









    }
}
