import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class printarray {
    public static void printTerminal(int arrch[][], int xmax, int ymax) {
        for (int i = 0; i < xmax; i++) {
            System.out.println();
            for (int j = 0; j < ymax; j++) {
                System.out.printf("%d%s", arrch[i][j], ' ');
            }
        }
    }

    public static void printFile(String arrch[][], int xmax, int ymax) {

        for (int i = 0; i < xmax; i++) {
            System.out.println();
            for (int j = 0; j < ymax; j++) {
                System.out.printf("%3s", arrch[i][j]);
            }
        }
        
        try (PrintStream res = new PrintStream("result.txt")) {
            res.println("Result \n");
            for (int i = 0; i < xmax; i++) {
                for (int j = 0; j < ymax; j++) {
                    res.printf("%3s",arrch [i][j]);
                }
            res.append('\n');
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        /** 
            * Здесь создать файл result<data>. txt
            * сделать красивый вывод результата в txt. Желательно с начальным
        */
    }
}
