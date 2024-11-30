public class printarray {
    public static void printTerminal (int arrch [][], int xmax, int ymax) {
        for (int i = 0; i < xmax; i++) {
            System.out.println();
            for (int j = 0; j < ymax; j++) {
                System.out.printf("%d%s", arrch [i][j], ' ');
        }
        }
    }
}
