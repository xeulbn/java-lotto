package lotto;

import org.kokodak.Randoms;

import java.util.Collections;
import java.util.List;


public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    public void printLotto(List<Integer> numbers){
        for(int i=0;i<numbers.size();i++){
            System.out.print(numbers.get(i)+" ");
        }
    }



}
