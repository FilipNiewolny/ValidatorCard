package com.SDA;

import java.util.Arrays;
import java.util.stream.Stream;

public class AlgorithmLuhna {

    public boolean luhna(String cardNumber){
        char[] arrayCard = cardNumber.toCharArray();
        int[] intArrayCard = new int[cardNumber.length()];
        for (int i = 0; i < arrayCard.length; i++) {
            intArrayCard[i] = Integer.valueOf(String.valueOf(arrayCard[i]));

        }

        for (int i = intArrayCard.length - 2; i >= 0 ; i-=2) {
            intArrayCard[i] *= 2;
            if (intArrayCard[i] >= 10){
                intArrayCard[i] -= 9;
            }
        }
        return Arrays.stream(intArrayCard).sum() % 10 == 0;

    }
}
