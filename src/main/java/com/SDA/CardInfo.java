package com.SDA;

import java.io.IOException;
import java.util.List;

public class CardInfo {
    public String identifyCard (String cardNumber , String filePath) throws IOException {
        AlgorithmLuhna algorithmLuhna = new AlgorithmLuhna();
        CSVReaderCardRules csvReaderCardRules = new CSVReaderCardRules();
        SearchForIssuser searchForIssuser = new SearchForIssuser();
        List<CardRules> rules = csvReaderCardRules.rules(filePath);
        return algorithmLuhna.luhna(cardNumber) ?  searchForIssuser.issuser(cardNumber , rules): "Invalid Card Number";
    }
}
