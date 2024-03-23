package lotto;

import org.kokodak.Randoms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static lotto.LottoInput.*;

public class LottoController {
    private static List <Integer> lottoNumberList;
    private static List<Integer> lotto = new ArrayList<>();
    public static int[] matcharr;
    public static int[] bonusMatch;

    private static List<Lotto> lottoList;
    public static List<Integer> setRandomNum(){
        lottoNumberList = Randoms.pickUniqueNumbersInRange(1,45,6);
        List<Integer> lottoTicketNumberList = new ArrayList<>(lottoNumberList);
        Collections.sort(lottoTicketNumberList);
        return lottoTicketNumberList;

    }

    public static Lotto makeLotto(){
        lotto = new ArrayList<>();
        lotto=setRandomNum();
        System.out.println(lotto);
        return new Lotto(lotto);
    }

    static List<Lotto> makeLottoList(int ticketCount){
        lottoList = new ArrayList<>();
        for(int i=0;i<ticketCount;i++){
            lottoList.add(makeLotto());
        }
        return lottoList;
    }

    static int countOfMatch(Lotto lottoNumber, int[] answernumber){
        int matchCount=0;
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(lottoNumber.getNumbers().get(j)==answernumber[j]){
                    matchCount++;
                }
            }
        }
        System.out.println(matchCount);
        return matchCount;
    }

    static int bonusBallMatch(Lotto lottoNumber){
        int bonusMatchCount=0;
        for(int i=0;i<6;i++){
            if(bonusNumber==lottoNumber.getNumbers().get(i)){
                bonusMatchCount++;
            }
        }
        return bonusMatchCount;
    }

    static void match(List<Lotto> lottoList){
        for(int i=0;i<(lottoPrice/1000);i++){
            matcharr[i]=countOfMatch(lottoList.get(i),answerNumber);
        }

        for(int i=0;i<(lottoPrice/1000);i++){
            bonusMatch[i]=bonusBallMatch(lottoList.get(i));
        }

    }

}
