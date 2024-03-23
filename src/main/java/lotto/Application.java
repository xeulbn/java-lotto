package lotto;


import org.kokodak.Randoms;

import java.util.ArrayList;
import java.util.List;

import static lotto.LottoController.match;
import static lotto.LottoController.matcharr;

public class Application {
    private static List<Lotto> lottoList;

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
        System.out.println("당첨 통계");
        System.out.println("-----");
        match(lottoList);
        for(int i=0;i<6;i++){
            System.out.println(matcharr[i]);
        }










    }
}
