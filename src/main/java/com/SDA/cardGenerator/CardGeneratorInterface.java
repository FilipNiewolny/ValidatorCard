package com.SDA.cardGenerator;

import java.io.IOException;

public interface CardGeneratorInterface {
    String createCardNumber(CardIssuersEnum cardIssuersEnum ,String filePath) throws IOException;
}
