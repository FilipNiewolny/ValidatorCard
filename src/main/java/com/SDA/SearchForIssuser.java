package com.SDA;

import java.util.List;

public class SearchForIssuser {
    public String issuser(String cardNumber, List<CardRules> rules) {
        String result = "Unknown";
        for (int i = 0; i < rules.size(); i++) {
            if (cardNumber.startsWith(rules.get(i).getPrefix()) && cardNumber.length() == Integer.valueOf(rules.get(i).getLength())) {
                result = rules.get(i).getExhibitor();
            }
        }
        return result;
    }
}
