public class Main {
    public static void main(String[] args) {
        String[] s = new String[6];
        s[0] = "a";
        s[1] = "b";
        s[2] = "c";
        s[3] = "d";
        s[4] = "c";
        s[5] = "d";
        String[] rename = new String[6];
        for (int i = 0; i < 6; i++) {
            rename[i] = s[i];
        }
        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < 6; j++) {
                if (rename[i] != null & rename[j] != null) {
                    if (rename[i].equals(rename[j])) {
                        rename[i] = null;
                        rename[j] = null;
                    }
                }
            }
            System.out.print(rename[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < rename.length; i++) {
            if (rename[i] == null) {
                if (i != rename.length) {
                    System.arraycopy(rename, i, rename, i, rename.length-i );
                }
                System.out.println("");
                return;
            } else {
                System.out.print(rename[i] + " ");
            }
        }
    }
}