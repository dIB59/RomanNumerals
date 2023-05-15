package romannumerals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {
    @Test
    void convertCIToArabic() {
        assertEquals(101, RomanConverter.toArabic("CI"));
        }

    @Test
    void convertXVToArabic() {
        assertEquals(15, RomanConverter.toArabic("XV"));
    }

    @Test
    void convertXIToArabic() {
        assertEquals(11, RomanConverter.toArabic("XI"));
    }

    @Test
    void convertXXToArabic() {
        assertEquals(20, RomanConverter.toArabic("XX"));
    }

    @ParameterizedTest
    @CsvSource({
            "I, 1",
            "IV, 4",
            "V, 5",
            "IX, 9",
            "X, 10",
            "XL, 40",
            "L, 50",
            "XC, 90",
            "C, 100",
            "CD, 400",
            "D, 500",
            "CM, 900",
            "M, 1000",

    })
    void convertAllRomanToArabic(String Roman, int Arabic) {
        assertEquals(Arabic, RomanConverter.toArabic(Roman));
    }

    }

