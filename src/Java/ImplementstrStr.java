package Java;

public class ImplementstrStr {
    public static void main(String[] args) {
        ImplementstrStr implementstrStr = new ImplementstrStr();
        System.out.println(implementstrStr.strStr("aa", "aa"));
    }

    public int strStr(String haystack, String needle) {
        char[] needleChars = needle.toCharArray();
        if (needleChars.length == 0) {
            return 0;
        }
        char[] hayStackChars = haystack.toCharArray();
        if (hayStackChars.length < needleChars.length) {
            return -1;
        }
        int hayStackCursor1;
        int needleCursor = 0;
        int complexity = hayStackChars.length - needleChars.length + 1;
        for (int hayStackCursor = 0; hayStackCursor < complexity; hayStackCursor++) {
            if (hayStackChars[hayStackCursor] == needleChars[needleCursor]) {
                if (needleChars.length == 1) {
                    return hayStackCursor;
                }
                hayStackCursor1 = hayStackCursor + 1;
                for (int needleCursor1 = 1; needleCursor1 < needleChars.length; needleCursor1++) {
                    if (hayStackCursor1 > hayStackChars.length - 1) {
                        return -1;
                    }
                    if (hayStackChars[hayStackCursor1] != needleChars[needleCursor1]) {
                        break;
                    }
                    if (needleCursor1 == needleChars.length - 1) {
                        return hayStackCursor;
                    }
                    hayStackCursor1 += 1;
                }
            }
        }
        return -1;
    }
}
