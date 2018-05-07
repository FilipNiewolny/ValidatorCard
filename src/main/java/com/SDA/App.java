package com.SDA;

import com.SDA.cardGenerator.CardGeneratorFactory;
import com.SDA.cardGenerator.CardIssuersEnum;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Filip\\Desktop\\SDA\\Projekty\\pliki\\Card.csv";
        String cardNumber = "5100000000000090";
        String cardNumber2 = "4221143134311219";

        CardInfo cardInfo = new CardInfo();
        System.out.println(cardInfo.identifyCard(cardNumber2, filePath));

        CardGeneratorFactory card = new CardGeneratorFactory();
        card.produce(CardIssuersEnum.VISA);

    }
}
