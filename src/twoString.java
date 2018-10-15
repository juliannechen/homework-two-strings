public class twoString {

    public static void main(String[] args) {
        String abcTestTrue = ".dabc";
        String abcTestFalse = ".abc";
        String wordOne = "aaa";
        String wordTwo = "bbbbbb";

        System.out.println("true = " + abcTest(abcTestTrue));
        System.out.println("false = " + abcTest(abcTestFalse));
        System.out.println(alternateStrings(wordOne, wordTwo));
    }

    public static String alternateStrings(String wordOne, String wordTwo) {
        int smallerWordLengh = Math.min(wordOne.length(), wordTwo.length());
        String alternatedWord = "";

        for (int i = 0; i < smallerWordLengh; i++) {
            alternatedWord = alternatedWord + wordOne.substring(i, i + 1);
            alternatedWord = alternatedWord + wordTwo.substring(i, i + 1);

        }
        if (wordOne.length() > wordTwo.length()) {
            alternatedWord = alternatedWord + wordOne.substring(smallerWordLengh, wordOne.length());
        } else if (wordTwo.length() > wordOne.length()) {
            alternatedWord = alternatedWord + wordTwo.substring(smallerWordLengh, wordTwo.length());
        }
        return alternatedWord;
    }

    public static boolean abcTest(String word) {
        int indexOfABC = word.indexOf("abc");
        int indexOfPeriod = word.indexOf(".");

        if (indexOfABC - 1 == indexOfPeriod) {
            return false;
        } else if (indexOfABC > -1) {
            return true;
        }
        return false;
    }

}
