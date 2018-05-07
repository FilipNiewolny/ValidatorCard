package com.SDA;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private SearchForIssuser searchForIssuser;

    @Before
    public void init() {
        this.searchForIssuser = new SearchForIssuser();
    }

    @Test
    public void mainTest(){
        //given
        List<CardRules> rules = new ArrayList<>();
        CardRules rule1 = new CardRules();
        CardRules rule2 = new CardRules();
        CardRules rule3 = new CardRules();

        rule1.setPrefix("4");
        rule2.setPrefix("51");
        rule3.setPrefix("34");

        rule1.setLength("16");
        rule2.setLength("16");
        rule3.setLength("15");

        rule1.setExhibitor("Visa");
        rule2.setExhibitor("Master Card");
        rule3.setExhibitor("American Express");

        rules.add(rule1);
        rules.add(rule2);
        rules.add(rule3);

        String cardNumber1 = "4321645165321653"; // visa
        String cardNumber2 = "5121645165321653"; // MC
        String cardNumber3 = "342164516532165"; // AE
        String cardNumber4 = "2332164516532165"; // Unknown

        String expectedResult1 = "Visa";
        String expectedResult2 = "Master Card";
        String expectedResult3 = "American Express";
        String expectedResult4 = "Unknown";


        String result1 = searchForIssuser.issuser(cardNumber1, rules);
        String result2 = searchForIssuser.issuser(cardNumber2, rules);
        String result3 = searchForIssuser.issuser(cardNumber3, rules);
        String result4 = searchForIssuser.issuser(cardNumber4, rules);

        Assert.assertEquals(expectedResult1, result1);
        Assert.assertEquals(expectedResult2, result2);
        Assert.assertEquals(expectedResult3, result3);
        Assert.assertEquals(expectedResult4, result4);


    }
}
