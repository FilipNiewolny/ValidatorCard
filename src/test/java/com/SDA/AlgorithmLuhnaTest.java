package com.SDA;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AlgorithmLuhnaTest {
    private AlgorithmLuhna algorithmLuhna;

    @Before
    public void init() {
        this.algorithmLuhna = new AlgorithmLuhna();
    }

    @Test
    public void luhnaTest() {
        //given
        String cardNumber1 = "748110";//false
        String cardNumber2 = "748210"; //true
        String cardNumber3 = "4221143134311219";  // true
        String cardNumber4 = "4221143134311218";  //false

        //when

        //then
        Assert.assertFalse(algorithmLuhna.luhna(cardNumber1));
        Assert.assertTrue(algorithmLuhna.luhna(cardNumber2));
        Assert.assertTrue(algorithmLuhna.luhna(cardNumber3));
        Assert.assertFalse(algorithmLuhna.luhna(cardNumber4));

    }
}
