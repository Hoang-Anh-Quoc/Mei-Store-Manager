package CodeManager;

import java.io.IOException;

public class MainTest {
    public static void main(String[] args) throws IOException {

        System.out.println(CutStringFrom("|Tra Sua|2|", 1));

    }

    static String CutStringFrom(String StringNeedCut, int Start) {
        // Datatype is "|...|...|" so start is number of "|"
        for (int i = 0; i < Start; ++i) {
            StringNeedCut = StringNeedCut.substring(StringNeedCut.indexOf("|") + 1);
        }
        return StringNeedCut.substring(0, StringNeedCut.indexOf("|"));
    }
}