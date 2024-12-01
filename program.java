public class program {
    public static void main(String[] args) throws Exception {
        String name = "map.txt";
        // Character [][] arr = generateMap.arrayMap(name);
        int arr1[][] = generateMap.arrayMapInt(name);
        int[][] arr2 = waveMethod.start(arr1, generateMap.lengthMap(name), generateMap.weidhtMap(name));
        printarray.printTerminal(arr2, generateMap.lengthMap(name), generateMap.weidhtMap(name));
        // generateMap.weidhtMap (name));
        waveMethod.result(arr2, generateMap.lengthMap(name), generateMap.weidhtMap(name));
    }
}
