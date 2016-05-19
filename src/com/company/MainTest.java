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
        String testResult = Main.encryptPair(originalInput);
        assertEquals("", testResult);
    }
    @org.junit.Test
    public void yxskaft() throws Exception {
        String originalInput = "tx";
        String testResult = Main.encryptPair(originalInput);
        assertEquals("ul", testResult);
    }
    @org.junit.Test
    public void x() throws Exception {
        String originalInput = "tx";
        String testResult = Main.encryptPair(originalInput);
        assertEquals("ul", testResult);
    }
    @org.junit.Test
    public void lx() throws Exception {
        String originalInput = "lx";
        String testResult = Main.encryptPair(originalInput);
        assertEquals("yw", testResult);
    }
}