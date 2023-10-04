package day14_Arrays;

public class C07_MultiDimensionalArrays {
    public static void main(String[] args) {

        int[] arr = {3,6,8,1};

        // arr ın tüm elementlerini yazdırın

        for (int i = 0; i <arr.length ; i++) {

            System.out.print(arr[i] + " ");
        } // 3 6 8 1
        System.out.println("");

        int[][] sayılar = {{3,5,6},{2,7},{1,5,8},{1}};
        // sayıların array ındeki tüm elementleri yazdırın

        for (int i = 0; i <sayılar.length ; i++) { // auter loop auter array i kontrol eder

            for (int j = 0; j <sayılar[i].length ; j++) { /// inner loop da inner arry i kontrol edcek


                System.out.print(sayılar[i][j] + " ");
            }
        } //3 5 6 2 7 1 5 8 1



    }
}
