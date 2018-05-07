package com.SDA;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class CardInfoTest {

    private AlgorithmLuhna algorithmLuhna;
    private CSVReaderCardRules csvReaderCardRules;
    private SearchForIssuser searchForIssuser;


    @Before
    public void init(){
        this.algorithmLuhna = new AlgorithmLuhna();
        this.csvReaderCardRules=new CSVReaderCardRules();
        this.searchForIssuser = new SearchForIssuser();
    }
    @Test
    public void identifyCardTest() throws IOException {
        //Given
        String filePath = "C:\\Users\\Filip\\Desktop\\SDA\\Projekty\\pliki\\Card.csv";
        CardRules cardRules = new CardRules();
        cardRules.setLength("16");
        cardRules.setExhibitor("visa");
        cardRules.setPrefix("4");
        //when
        List<CardRules> rules = csvReaderCardRules.rules(filePath);
        //then

        Assert.assertEquals(cardRules.getExhibitor() ,rules.get(0).getExhibitor());
        Assert.assertEquals(cardRules.getLength() ,rules.get(0).getLength());
        Assert.assertEquals(cardRules.getPrefix() ,rules.get(0).getPrefix());
    }
}
