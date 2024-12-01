public class program {
    public static void main(String[] args) throws Exception {
        String name = "map.txt";
        //Character [][] arr = generateMap.arrayMap(name);
        int arr1 [][] = generateMap.arrayMapInt(name);
        //printarray.printTerminal(arr1, generateMap.lengthMap(name), generateMap.weidhtMap (name)); 
        //System.out.println(arr1 [1][0]);
        //System.out.println(arr1 [0][2]);        
        int [][] arr2 = waveMethod.start(arr1, generateMap.lengthMap(name), generateMap.weidhtMap (name));    
        //printarray.printTerminal(arr2, generateMap.lengthMap(name), generateMap.weidhtMap (name)); 

    }
}
