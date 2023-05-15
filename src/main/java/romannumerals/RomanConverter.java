package romannumerals;

public class RomanConverter {

    enum RomanNumeral {
        I(1), IV(4), V(5), IX(9), X(10),
        XL(40), L(50), XC(90), C(100),
        CD(400), D(500), CM(900), M(1000);

        private int value;

        RomanNumeral(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public static int toArabic(String romanNumbers) {

        int previousNumeral = 0;
        int i = 0;
        int totalValue = 0;
        while (i < romanNumbers.length()) {
            boolean numberFound = false;

            // Convert Roman Numerals to Arabic
            for (RomanNumeral numeral : RomanNumeral.values()) {
                if (romanNumbers.startsWith(numeral.name(), i)) {
                    totalValue += numeral.getValue();

                    if (i > 0 && previousNumeral < numeral.getValue()){
                        totalValue = totalValue - 2 * previousNumeral;
                    }

                    previousNumeral = numeral.getValue();

                    i += numeral.name().length();

                    numberFound = true;
                    break;
                }
            }

            if (!numberFound) {
                return -1; // Indicate that the input is invalid or not found
            }
        }

        return totalValue; // Return the calculated total value
    }
}

