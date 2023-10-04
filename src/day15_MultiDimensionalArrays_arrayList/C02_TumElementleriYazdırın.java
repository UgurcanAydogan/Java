package day15_MultiDimensionalArrays_arrayList;

public class C02_TumElementleriYazdırın {
    public static void main(String[] args) {

        // verilen bir MDA daki tüm sayıları toplayın, toplamı yazdırıan bir method oluştrun

        int[][] arr2 = {{1, 4, 7}, {3, 5}, {1, 9, 0, 8}, {2}};
        arraydekiElementleriTopla(arr2); // Array deki tüm elementleri topla : 40

        arraydekiElementleriTopla(new int[][]{{4,6,7},{1,2}}); // Array deki tüm sayilarin toplami : 20

    }

    public static void arraydekiElementleriTopla(int[][] arr){

        int toplam = 0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

            toplam += arr[i][j];
            }
        }
        System.out.println("Array deki tüm elementleri topla : " + toplam);
    }
}
