package com.SDA;

import pl.SDA.FileReaderFactory;
import pl.SDA.MyObject;
import pl.SDA.SDAFileReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CSVReaderCardRules {
    public List<CardRules> rules(String filePath) throws IOException {
        SDAFileReader reader = FileReaderFactory.produce(filePath);
        List<MyObject> read = reader.read(filePath);
        String[] listRules = new String[read.size()];

        Iterator<String> keySet = read.get(0).getMap().keySet().iterator();
        List<String> headers = new ArrayList<>();
        while (keySet.hasNext()) {
            headers.add(keySet.next());
        }

        List<CardRules> rulesList = new ArrayList<>();
        for (int i = 0; i < listRules.length; i++) {
            CardRules cardRules = new CardRules();
            cardRules.setExhibitor(read.get(i).getMap().get(headers.get(0)));
            cardRules.setPrefix(read.get(i).getMap().get(headers.get(1)));
            cardRules.setLength(read.get(i).getMap().get(headers.get(2)));
            rulesList.add(cardRules);
        }


        return rulesList;


    }
}
