package lotto;


import org.kokodak.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private static List<Lotto> lottoList;
    public static void main(String[] args) {
        LottoInput input = new LottoInput();

        input.purchaseCost();

        int lottoPrice = input.lottoPrice;
        System.out.println(lottoPrice);

        LottoController purchase = new LottoController();
        lottoList=purchase.makeLottoList(lottoPrice/1000);


        input.answerNumber(); //당첨번호 입력
        input.bonusNumber(); //보너스 번호 입력




    }
}
