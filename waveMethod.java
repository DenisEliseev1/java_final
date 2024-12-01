import java.util.Scanner;

public class waveMethod {
    public static int [][] start (int [][] arrch, int xmax, int ymax) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Координата Х начальной точки");
        int xA = sc.nextInt ();
        System.out.println("Координата У начальной точки");
        int yA = sc.nextInt();
        if (arrch[xA][yA] == 'x') {
            System.out.println("Ошибка - координата начальной точки не корректна");
            start (arrch, xmax, ymax);
        }
        System.out.println("Координата Х конечной точки");
        int xB = sc.nextInt ();
        System.out.println("Координата У конечной точки");
        int yB = sc.nextInt();
        if (arrch[xB][yB] == 'x') {
            System.out.println("Ошибка - координата конечной точки не корректна");
            start (arrch, xmax, ymax);
        }
        sc.close();
        arrch [xA][yA] = 0;
        arrch = waveMapFstep(arrch, xA, yA, xA, yA,xmax, ymax);
        arrch = waveMapStep (arrch, xA, yA, xmax, ymax, 1);
        return arrch;
    }
    //   вар1 - точка В (проблема - нет всех путей)
    public static int [][] waveMapFstep (int [][] arrch,int x0, int y0, int x, int y, int xmax, int ymax) throws Exception {
        if ((x-1 >= 0) &&  (arrch [x-1][y] == 0)) {
            if ((y != y0) || (x-1 != x0)) {
                arrch [x-1][y] = arrch [x][y]+1;
            }
            //System.out.println(1);
        } if ((y+1 < ymax)  && (arrch [x][y+1] == 0)) {
            if ((x != x0) || (y+1 != y0)) { 
            //System.out.println(2);
            arrch [x][y+1] = arrch [x][y]+1;;
            //System.out.println(arrch [x][y+1]);
            }
        } if ((x+1 < xmax)  && (arrch [x+1][y] == 0)) {
            if ((y != y0) ||  (x+1 != x0))
           //System.out.println(3);
            arrch [x+1][y]= arrch [x][y]+1;
        } if ((y-1 >= 0) && (arrch [x][y-1] == 0)) {
            if ((x != x0) || (y-1 != y0)) {
                arrch [x][y-1]+= arrch [x][y]+1;
            }
            //System.out.println(4);
 }
            //System.out.println(arrch [x][y-1]);
        printarray.printTerminal(arrch, xmax, ymax);
        System.out.println();
        return arrch;
    }
    public static int [][] waveMapStep (int [][] arrch,int x0, int y0, int xmax, int ymax, int r) throws Exception {
        int flag = 0;
        for (int x = 0; x < xmax; x++) {
            for (int y = 0; y < ymax; y++) {
                if ((arrch [x][y] == 0) && (x != x0) && (y != y0)) {
                    flag++;
                }
                if (arrch [x][y] == r) {
                    arrch = waveMapFstep(arrch, x0, y0, x, y, xmax, ymax);
                }
            }
        }
        r++;
        if (flag > 0) { 
            arrch = waveMapStep (arrch, x0, y0, xmax, ymax,r);//????????????????????????????????????????????????
        }
        return arrch;
    }
    
        /** Начальную и конечную точку задаём вручную в файле буквами А и В
        Создать алгоритм заполнения всех возможных путей от А до В, окончание которого должно обозначать 
        отсутствие "не закрашенных" областей лабиринта/карты
        Основной вариант - рекурсия, основной вопрос - какой выход из рекурсии????
        вар1 - точка В (проблема - нет всех путей)
        вар2 - полное заполнение - нет незаполненных ячеек (проблема - большая загрузка)

        */

    
}
