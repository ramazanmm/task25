import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



//        Kiçik bir console app yazın :
//        Proqram bizdən neçə ölçülü bir array yaratmaq istədiyimizi soruşsun və
//        həmin qədər elementləri daxil edib bir arraya yığsın.
//        Sonra bu arrayın içərisindəki ən böyük ədədin təkmi yoxsa cütmü olduğunu tapsın.
//        Əgər ədəd cütdürsə faktorialını deyilsə ədədin özünü yazdırın.



        Scanner scanner = new Scanner(System.in);
        System.out.print("array-e nece element daxil edilsin: ");
        int arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];
        int i=0;

        while (i<arrayLength){
            System.out.print(i+1 + " reqemi daxil edin: ");
            array[i] = scanner.nextInt();
            i++;

        }

        for (int a:array) {
            System.out.println(a);
        }
        int max = array[0];

        for (i=0; i<arrayLength; i++){
            if (max < array[i]) {
                max = array[i];

            }
        }
//            System.out.println(max);

        if (max % 2 == 0){
            int faktorial = 1;
            for (int j=1; j<=max; j++){
                faktorial = faktorial * j;
            }
            System.out.println("en boyuk ededin faktoriali: " + faktorial);
        }
        else {
            System.out.println("en boyuk eded tekdir: " + max);
        }
    }
}