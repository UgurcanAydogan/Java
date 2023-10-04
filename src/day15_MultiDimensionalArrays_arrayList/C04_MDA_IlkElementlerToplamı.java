package day15_MultiDimensionalArrays_arrayList;

public class C04_MDA_IlkElementlerToplamı {
    public static void main(String[] args) {

        // verilen MDA da
        // her bir array in ilk elementlerinin toplamini
        // bize donduren bir method olusturun

        int[][] arr = {{1,4,7},{3,5},{1,9,0,8},{5,2}};

        System.out.println("İlk elementler toplamı : " + ilkElemanlarToplamı(arr)); // İlk elementler toplamı : 10
    }

    public static int ilkElemanlarToplamı(int[][] arr){

        // tum elemalara ihtiyacimiz yok
        // for loop inne arry leri getirirse biz o inner array in ilk elemanı alırız

        int toplam = 0;


        for (int i = 0; i <arr.length ; i++) { // arr[0], arr[1], arr[2], arr[3]

            toplam += arr[i][0];
            }
        return toplam;
        }
    }

