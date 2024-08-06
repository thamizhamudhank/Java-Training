package New_22;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSet12 {
    public static void main(String[] args) {
        String str = "big black bug is sitting on big black nose of big black dog";
        String[] s = str.split(" ");
        System.out.println(Arrays.toString(s));
        HashSet<String> hs = new HashSet<String>();
        for (String x : s) {
            hs.add(x);
        }
        System.out.println(hs);
        LinkedHashSet<String> fs = new LinkedHashSet<String>();
        for (String x : s) {
            fs.add(x);
        }
        System.out.println(fs);

    }
}
