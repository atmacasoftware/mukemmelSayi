import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Değişkenlerin tanımlandığı bölüm
        int sayi, bolenSayiToplami = 0;

        //Scanner sınıfının import edilmesi
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan sayı alma
        System.out.println("Bir sayı giriniz : ");
        sayi = input.nextInt();

        //Tam sayı bölenlerini bulma
        for(int i=1; i<sayi; i++){
            if(sayi%i == 0){
                bolenSayiToplami += i;
            }
        }

        //Tam sayı bölen toplamı ile girilen sayının eşitliğinin kontrolü
        if(bolenSayiToplami == sayi){
            System.out.println(sayi + " sayısı mükemmel sayıdır.");
        }else{
            System.out.println(sayi + " sayısı mükemmel sayı değildir.");
        }

    }
}