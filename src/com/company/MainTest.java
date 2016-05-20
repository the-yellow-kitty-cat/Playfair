package com.company;

import static org.junit.Assert.*;

/**
 * Created by cof on 2016-05-18.
 */
public class MainTest {
    @org.junit.Test
    public void ka() throws Exception {
        String originalInput = "ka";
        String testResult = Main.encryptPair(originalInput);
        assertEquals("zw", testResult);
    }
    @org.junit.Test
    public void hd() throws Exception {
        String originalInput = "hd";
        String testResult = Main.encryptPair(originalInput);
        assertEquals("db", testResult);
    }
    @org.junit.Test
    public void katt() throws Exception {
        String originalInput = "katt";
        String testResult = Main.getPlayfairEncryption(originalInput);
        assertEquals("zwulul", testResult);
    }
    @org.junit.Test
    public void tx() throws Exception {
        String originalInput = "tx";
        String testResult = Main.encryptPair(originalInput);
        assertEquals("ul", testResult);
    }
    @org.junit.Test
    public void gl() throws Exception {
        String originalInput = "gl";
        String testResult = Main.encryptPair(originalInput);
        assertEquals("lr", testResult);
    }
    @org.junit.Test
    public void tom() throws Exception {
        String originalInput = "";
        String testResult = Main.getPlayfairEncryption(originalInput);
        assertEquals("", testResult);
    }
    @org.junit.Test
    public void yxskaft() throws Exception {
        String originalInput = "Yxskaftbud, ge vår WC-zonmö IQ-hjälp.";
        String testResult = Main.getPlayfairEncryption(originalInput);
        assertEquals("nwavgeupqbsaksmlmbqorcovsvgwbl", testResult);
    }
    @org.junit.Test
    public void lynx() throws Exception {
        String originalInput = "Mr. Jock, TV quiz PhD, bags few lynx.";
        String testResult = Main.getPlayfairEncryption(originalInput);
        assertEquals("riocmuvqukmhhdbzgsfeaxynxw", testResult);
    }
    @org.junit.Test
    public void cr() throws Exception {
        String originalInput = "cr";
        String testResult = Main.encryptPair(originalInput);
        assertEquals("mi", testResult);
    }
    @org.junit.Test
    public void nq() throws Exception {
        String originalInput = "nq";
        String testResult = Main.encryptPair(originalInput);
        assertEquals("od", testResult);
    }
    @org.junit.Test
    public void lx() throws Exception {
        String originalInput = "lx";
        String testResult = Main.encryptPair(originalInput);
        assertEquals("yw", testResult);
    }
    @org.junit.Test
    public void depressed() throws Exception {
        String originalInput = "IF YOU ARE" +
                "DEPRESSED YOU ARE" +
                "LIVING IN THE PAST. IF" +
                "YOU ARE ANXIOUS YOU" +
                "ARE LIVING IN THE" +
                "FUTURE. IF YOU ARE AT" +
                "PEACE YOU ARE LIVING" +
                "IN THE PRESENT" +
                "" +
                "LAO TZU";
        String testResult = Main.getPlayfairEncryption(originalInput);
        assertEquals("osnikecgbfgtaffahncqgmgxvhoysrlqbszggvosnikecgfwyccqyicqgmgxvhoysrlqbseqvkcgosnikecggkbgemsxcqgmgxvhoysrlqbsgtaffxprfmkpbc", testResult);
    } @org.junit.Test
    public void yxkaft() throws Exception {
        String originalInput = "Yxskaftbud, ge vår WC-zonmö IQ-hjälp.";
        String testResult = Main.getPlayfairEncryption(originalInput);

        assertEquals("nwavgeupqbsaksmlmbqorcovsvgwbl", testResult);
    }

}