package com.SDA.cardGenerator;

import com.SDA.CSVReaderCardRules;
import com.SDA.CardRules;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class VisaCardGenerator implements CardGeneratorInterface {
    @Override
    public String createCardNumber(CardIssuersEnum cardIssuersEnum ,String filePath) throws IOException {

        CSVReaderCardRules csvReaderCardRules = new CSVReaderCardRules();
        List<CardRules> rules = csvReaderCardRules.rules(filePath);

        int y   = 0;
        for (int i = 0; i < rules.size(); i++) {
            if (rules.get(i).getExhibitor().toLowerCase().equals(CardIssuersEnum.VISA.toString())){
                i = y;
            }
        }


        int[] cardNumber = new int[16];
        cardNumber[0] = 4;
        Random random = new Random();
        for (int i = 1; i < 15; i++) {
            cardNumber[i] = random.nextInt(10);
        }
        int sum = 0;
        int tmp;
        for (int i = cardNumber.length - 2; i >= 0; i--) {
            if (i % 2 == 0) {
                tmp = cardNumber[i] * 2;
                if (tmp >= 10) {
                    tmp -= 9;
                }
            } else {
                tmp = cardNumber[i];
            }
            sum += tmp;
        }
        cardNumber[15] = 10 - (sum % 10);
        return Arrays.toString(cardNumber);
    }
}
