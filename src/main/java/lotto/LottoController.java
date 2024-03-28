package lotto;

import org.kokodak.Randoms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static lotto.LottoInput.*;

public class LottoController {
    private static List <Integer> lottoNumberList;
    private static List<Integer> lotto = new ArrayList<>();
    public static int[] matcharr=new int[lottoPrice/1000];
    public static int[] bonusMatch=new int[lottoPrice/1000];

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


    static int[] countOfMatch(List<Lotto> lottoNumber, int[] answernumber){

        for(int i=0; i<(lottoPrice/1000);i++){
            matcharr[i]=matchOneByOne(lottoNumber.get(i),answernumber);
        }
        return matcharr;
    }

    static int matchOneByOne(Lotto lottoNum, int[] answerNum){
        int matchcnt=0;
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(lottoNum.getNumbers().get(i)==answerNum[j]){
                    matchcnt++;
                }
            }
        }
        return matchcnt;
    }

    static int[] bonusBallMatch(List<Lotto> lottoNumber){

        for(int i=0;i<6;i++){
            int bonusMatchCount=0;
            if(bonusNumber==lottoNumber.get(i).getNumbers().get(i)){
                bonusMatchCount++;
            }
            bonusMatch[i]=bonusMatchCount;
        }
        return bonusMatch;
    }

}
