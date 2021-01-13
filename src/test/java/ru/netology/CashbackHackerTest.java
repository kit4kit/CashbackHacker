package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerTest {

    @Test
    public void testRemain() {
        CashbackHacker cashbackHacker = new CashbackHacker();
        int amount = 900;

        int actual = cashbackHacker.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }
}