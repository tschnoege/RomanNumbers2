import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumberTest {
    @Test
    public void testUnits()
    {
        assertEquals("I", RomanNumber.toRomanNumber(1));
        assertEquals("II", RomanNumber.toRomanNumber(2));
        assertEquals("III", RomanNumber.toRomanNumber(3));
        assertEquals("IV", RomanNumber.toRomanNumber(4));
        assertEquals("V", RomanNumber.toRomanNumber(5));
        assertEquals("VI", RomanNumber.toRomanNumber(6));
        assertEquals("VII", RomanNumber.toRomanNumber(7));
        assertEquals("VIII", RomanNumber.toRomanNumber(8));
        assertEquals("IX", RomanNumber.toRomanNumber(9));
    }

    @Test
    public void testTenths()
    {
        assertEquals("X", RomanNumber.toRomanNumber(10));
        assertEquals("XX", RomanNumber.toRomanNumber(20));
        assertEquals("XXX", RomanNumber.toRomanNumber(30));
        assertEquals("XL", RomanNumber.toRomanNumber(40));
        assertEquals("L", RomanNumber.toRomanNumber(50));
        assertEquals("LX", RomanNumber.toRomanNumber(60));
        assertEquals("LXX", RomanNumber.toRomanNumber(70));
        assertEquals("LXXX", RomanNumber.toRomanNumber(80));
        assertEquals("XC", RomanNumber.toRomanNumber(90));
    }

    @Test
    public void testCents()
    {
        assertEquals("C", RomanNumber.toRomanNumber(100));
        assertEquals("CC", RomanNumber.toRomanNumber(200));
        assertEquals("CCC", RomanNumber.toRomanNumber(300));
        assertEquals("CD", RomanNumber.toRomanNumber(400));
        assertEquals("D", RomanNumber.toRomanNumber(500));
        assertEquals("DC", RomanNumber.toRomanNumber(600));
        assertEquals("DCC", RomanNumber.toRomanNumber(700));
        assertEquals("DCCC", RomanNumber.toRomanNumber(800));
        assertEquals("CM", RomanNumber.toRomanNumber(900));
    }

    @Test
    public void testThousands()
    {
        assertEquals("M", RomanNumber.toRomanNumber(1000));
        assertEquals("MM", RomanNumber.toRomanNumber(2000));
        assertEquals("MMM", RomanNumber.toRomanNumber(3000));
    }

    @Test
    public void testMiscNumbers()
    {
        assertEquals("DCCCXLVI", RomanNumber.toRomanNumber(846));
        assertEquals("MCMXCIX", RomanNumber.toRomanNumber(1999));
        assertEquals("MMVIII", RomanNumber.toRomanNumber(2008));
    }
}
