package com.SDA.cardGenerator;

public class CardGeneratorFactory {
    public CardGeneratorInterface produce(CardIssuersEnum cardIssuersEnum) {

        if (cardIssuersEnum.equals(CardIssuersEnum.VISA)) {
            return new VisaCardGenerator();
        } else if (cardIssuersEnum.equals(CardIssuersEnum.AMERICANEXPRES)) {

        } else if (cardIssuersEnum.equals(CardIssuersEnum.MASTERCARD)) {

        }
        return null;

    }
}
