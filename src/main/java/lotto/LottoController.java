package lotto;

import org.kokodak.Randoms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoController {
    private static List <Integer> lottoNumberList;
    private static List<Integer> lotto = new ArrayList<>();

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



}
