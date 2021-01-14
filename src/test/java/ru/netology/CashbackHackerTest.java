package ru.netology;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackerTest {

    @Test
    public void shouldReturn100IfAmountIs900() {
        CashbackHacker cashbackHacker = new CashbackHacker();
        int amount = 900;

        int actual = cashbackHacker.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldReturn0IfAmountIs1000() {
        CashbackHacker cashbackHacker = new CashbackHacker();
        int amount = 0;

        int actual = cashbackHacker.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldReturn1000IfAmountIs1000() {
        CashbackHacker cashbackHacker = new CashbackHacker();
        int amount = 1000;

        int actual = cashbackHacker.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}