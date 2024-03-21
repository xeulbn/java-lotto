package lotto;


import org.kokodak.Randoms;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        LottoInput input = new LottoInput();


        input.purchaseCost();
        input.answerNumber();
        input.bonusNumber();

        int lottoPrice = input.lottoPrice;
        System.out.println(lottoPrice);

        for(int i=0;i<lottoPrice/1000;i++){
            List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
            Lotto lotto = new Lotto(numbers);
            lotto.printLotto(numbers);
            System.out.println();
        }

    }
}
