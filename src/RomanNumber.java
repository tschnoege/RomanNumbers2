public class RomanNumber {
    final static String[] romanUnit = {"I", "V", "X", "L", "C", "D", "M"};

    public static String toRomanNumber(int num) {

        final int units = num % 10;
        final int tenths = num % 100 / 10;
        final int cents = num % 1000 / 100;
        final int thousands = num % 10000 / 1000;

        return String.valueOf(toRomanDigit(thousands, 6)) +
                toRomanDigit(cents, 4) +
                toRomanDigit(tenths, 2) +
                toRomanDigit(units, 0);
    }

    private static StringBuilder toRomanDigit(int num, int i) {
        final StringBuilder romanNumber = new StringBuilder();

        if (num > 0) {
             if (num >= 5) {
                if (num == 9) {
                    romanNumber.append(romanUnit[i]);
                    romanNumber.append(romanUnit[i + 2]);
                    num = 0;
                }
                else {
                    romanNumber.append(romanUnit[i + 1]);
                    num -= 5;
                }
            } else if (num == 4) {
                romanNumber.append(romanUnit[i]);
                romanNumber.append(romanUnit[i + 1]);
                num = 0;
            }

            romanNumber.append(String.valueOf(romanUnit[i]).repeat(num));
        }

        return romanNumber;
    }
}
