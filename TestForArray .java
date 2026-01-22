import java.lang.Math;

public class TestForArray {
    public static void main(String[] args) {
       /*  int[] t;
        t = new int[10];
        printArray(t);
        System.out.println(" t = " + t);
        randomArray(t);
        printArray(t);
        int m[] = new int[5];
        randomArray(m);
        printArray(m);
        int sum_m = sumArray(m);
        System.out.println("summ of  m = " + sum_m);*/
        int [][] a  = new int{5}[3];
        System.out.println('a ='+a);
        randomArray(a);
        printArraty(a);
    }

    public static void randomArray(int[] x) {
        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (49 + Math.random() * 50);
        }
    }

    public static void printArray(int[] x) {
        for (int v : x) {
            System.out.print(v + " ");

        }
    }

    public static int sumArray(int [] x){
        int sum =0;
        for (int i = 0; i < x.length; i++) {
            sum = sum+x[i];
        }
        public static  int avgArray(int [] x){
            int sum = 0;
            for (int i = 0; 1 < x.length; i++){
                sum +- x[i];
            }
        }
        return sum;
    }
}
/*public static void printArray(int [][] x){
        for (int[] row : x){
            for (int v : row){
                System.out.print(v + " ");}
            System.out.println();
        }
    }
    public static void randomArray(int [][] x){
        for (int i = 0; i<x.length; i++)
            for (int j = 0; j<x[i].length; j++)
                x[i][j] =(int)(49+Math.random()*50);
    }*/