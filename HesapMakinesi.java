import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        double n1, n2;
        int select;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: ");
        n1 = input.nextDouble();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = input.nextDouble();
        System.out.print("Toplama işlemi yapmak için 1'e, Çıkarmak işlemi yapmak için 2'ye,Bölme işlemi yapmak için 3'e, Çarpma işlemi yapmak için 4'e basınız.  : ");
        select = input.nextInt();
        switch (select){
            case 1:
                System.out.print("Sonuç: "+ (n1+n2));
                break;
            case 2:
                System.out.print("Sonuç: "+ (n1-n2));
                break;
            case 3:
                System.out.print("Sonuç: "+ (n1/n2));
                break;
            case 4:
                System.out.print("Sonuç: "+ (n1*n2));
                break;
            default:
                System.out.print("Hatalı Giriş.");

        }

    }
}

