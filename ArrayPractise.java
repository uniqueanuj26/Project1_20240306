public class ArrayPractise {
    public static void main(String[] args) {
    
        int singleArray[] = new int[3];
        int multiArray[][] = new int[3][4];
        int jaggedArray[][] = new int[3][];
        // jaggedArray[0] = new int[3];
        // jaggedArray[1] = new int[4];
        // jaggedArray[2] = new int[5];


        
        InnerArrayPractise iap = new InnerArrayPractise();

        iap.setSingle(singleArray);
        iap.printSingle(singleArray);

        iap.setMulti(multiArray);
        iap.printMulti(multiArray,"Multi Dimension Array");

        iap.setJaggedArrayRange(jaggedArray);
        iap.setMulti(jaggedArray);
        iap.printMulti(jaggedArray, "Jagged Array");


        

        
    }
}


/**
 * InnerArrayPractise
 */
class InnerArrayPractise {

    public void setSingle(int single[]){
        for (int i = 0; i < single.length; i++) {
            single[i] = (int)(Math.random()*10);
        }

    }

    public void printSingle(int single[]){

        System.out.println("Single Dimension array:");
        for (int i : single) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }

    public void setMulti(int multi[][]){
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                multi[i][j] = (int)(Math.random()*10);
            }
        }

    }

    public void printMulti(int multi[][], String msg){
        System.out.println(msg);
        for (int i[] : multi) {
            for (int j : i) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public int[][] setJaggedArrayRange(int jagged[][]){

        for (int i = 0; i < jagged.length; i++) {
            int rand = (int)(Math.random()*5);
            jagged[i] = new int[rand];
            
        }

        return jagged;

    }
    
}
