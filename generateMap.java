import java.io.FileReader;

public class generateMap {

    public static Character[][] arrayMap(String name) throws Exception {
        /**
         * FileReader fr = new FileReader(name);
         * int c;
         * int i = 0;
         * int y = 0;
         * while ((c = fr.read()) != -1) {
         * char ch = (char) c;
         * if (ch == '\n') {
         * System.out.print(ch);
         * i++;
         * } else {
         * System.out.print(ch);
         * y++;
         * }
         * 
         * }
         * y = (y - i) / ++i;
         * System.out.println("\n" + y);
         * System.out.println(i);
         * Character [][] arrch = new Character[i][y];
         * int n = 0;
         * i = 0;
         * fr.close();
         */
        int i = lengthMap(name);
        int y = weidhtMap(name);
        Character[][] arrch = new Character[i][y];
        int c;
        int n = 0;
        i = 0;
        FileReader fr1 = new FileReader(name);
        while ((c = fr1.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                i++;
            } else {
                if (n == y) {
                    n = 0;
                } else {
                    arrch[i][n] = (char) c;
                    n++;
                }

            }
        }
        fr1.close();
        return arrch;
    }

    public static int[][] arrayMapInt(String name) throws Exception {
        /**
         * FileReader fr = new FileReader(name);
         * int c;
         * int i = 0;
         * int y = 0;
         * while ((c = fr.read()) != -1) {
         * char ch = (char) c;
         * if (ch == '\n') {
         * System.out.print(ch);
         * i++;
         * } else {
         * System.out.print(ch);
         * y++;
         * }
         * 
         * }
         * y = (y - i) / ++i;
         * System.out.println("\n" + y);
         * System.out.println(i);
         * Character [][] arrch = new Character[i][y];
         * int n = 0;
         * i = 0;
         * fr.close();
         */
        int i = lengthMap(name);
        int y = weidhtMap(name);
        int[][] arrch = new int[i][y];
        int c;
        int n = 0;
        int f = 0;
        i = 0;
        FileReader fr1 = new FileReader(name);
        while ((c = fr1.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                i++;
            } else {
                if (n == y+1) {
                    n = 0;
                } if (ch == 'x') {
                    arrch[i][n] = -1;

                } else if (ch == '0') {
                    arrch[i][n] = 0;
                }
                n++;

            }
        }
        System.out.println(f);
        fr1.close();
        return arrch;
    }

    public static int lengthMap(String name) throws Exception {
        FileReader fr = new FileReader(name);
        int c;
        int i = 1;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n')
                i++;
        }
        fr.close();
        return i;
    }

    public static int weidhtMap(String name) throws Exception {
        FileReader fr = new FileReader(name);
        int c;
        int i = 0;
        int y = 0;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                i++;
            } else {
                y++;
            }
        }
        y = (y - i) / ++i;
        fr.close();
        return y;
    }
}