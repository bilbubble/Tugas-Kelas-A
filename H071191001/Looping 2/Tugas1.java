import java.util.Scanner;

class Tugas1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan base :");
        double base = sc.nextInt();
        System.out.println("masukkan pangkat :");
        int pangkat = sc.nextInt();
        double base2 = base;
        int i;
        if (pangkat > 0){
        for(i = 1; i < pangkat; i++){
            base = base * base2;
            
        }
        System.out.printf("%.0f ^ %d = %f" ,base2, pangkat, base);
        } else {
            for (i = -1;i>pangkat;i--){
                base = base * base2;
            }
            double hasil = 1/base;
            System.out.printf("%.0f ^ %d = %f" ,base2, pangkat, hasil);
        }
    }
}