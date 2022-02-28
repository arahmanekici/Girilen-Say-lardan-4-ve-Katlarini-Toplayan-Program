import java.util.Scanner;
public class Main {
    static public void main(String[] args){
        Scanner input = new Scanner (System.in);
        String appInformation= ("Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.");
        System.out.println(appInformation);

        //int number = input.nextInt();
        int sayac=0;
        int total=0;
        while(sayac==0){

            int a= input.nextInt();

            if (!(a%2==0)) {
                sayac++;

            }
            else if(a%4==0 ) {
                System.out.println(a);
                total += a;
            }
        }
        System.out.println("Total: " + total);


    }






}
