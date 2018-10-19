public class TwoStrings {
    public static String alternateStrings(String abc, String xyz) {
        String returner = "";
        int i = 0;
        while(i < abc.length() || i < xyz.length()){
            if(i < abc.length()) returner += abc.substring(i, i + 1);
            if(i < xyz.length()) returner += xyz.substring(i, i + 1);
            i++;
        }
        return returner;
    }

    public static boolean abcTest(String s) {
        if(s.contains(".") && s.contains("abc")) return !isValid(s);
        return true;
    }

    private static boolean isValid(String s) {
        int indexOfDot = s.indexOf(".");
        String dotBeforeABCCheck = s.substring(indexOfDot + 1, indexOfDot + 4);
        return (dotBeforeABCCheck.equals("abc"));
    }
}
