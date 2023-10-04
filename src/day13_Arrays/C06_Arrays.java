package day13_Arrays;

public class C06_Arrays {
    public static void main(String[] args) {
        // Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini
        //         ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] arr = {3,4,2,6,5,4,5,7,8,2,3,9};
        int arananSayı = 3;

        elemanSayısıYazdır(arr,3); // Aranan eleman array de 2 kere kullanılmış
        elemanSayısıYazdır(arr,11); // Aranan eleman arry de yok
        elemanSayısıYazdır(arr,7); // Aranan eleman array de 1 kere kullanılmış

    }

    public static void elemanSayısıYazdır(int[] arr, int arananSayı){

        int sayac = 0;

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i] == arananSayı){
                sayac++;
            }
        }

        if (sayac == 0){
            System.out.println("Aranan eleman array de yok");
        }else {
            System.out.println("Aranan eleman array de " + sayac + " kere kullanılmış");
        }




    }
}
