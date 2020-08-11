// Nama : Ridho Daffasyah
// NIM : 16519027
// Kelompok : 10
// Tantangan 2 - Membuat program sederhana dengan menggunakan bahasa java

// ---------------------------------------------------------------------------------------------------//

import java.time.Period;        //Import module time untuk periode
import java.time.LocalDate;     //Import module time untuk tanggal sekarang
import java.util.Scanner;       //Import module util scanner untuk input

public class AgeCalculator {

    public static void main(String[] args) {

        //Inisiasi scanner untuk input baru
        Scanner input = new Scanner(System.in);

        System.out.println("AGE CALCULATOR");
        System.out.println("Let's know your age!");

        //Validasi tahun
        int year = 0;       //Inisiasi variabel year
        boolean isYear;     //Inisiasi variabel isYear

        do{
            System.out.print("Input your year of birth : ");
            if (input.hasNextInt()){                            //Mengecek apakah inputan selanjutnya integer
                year = input.nextInt();
                isYear = true;
            }else{                                              //Jika bukan integer
                isYear = false;
                input.next();
            }
        //Tahun harus diantara 1-takhingga
        } while (!(isYear) || (year <=0));

        //Validasi bulan
        int month = 0;      //Inisiasi variabel month
        boolean isMonth;    //Inisiasi variabel isMonth

        System.out.println();
        do{

            System.out.print("Input your month of birth : ");
            if (input.hasNextInt()){                            //Mengecek apakah inputan selanjutnya integer
                month = input.nextInt();
                isMonth = true;
            }else{                                              //Jika bukan integer
                isMonth = false;
                input.next();
            }
        //Bulan harus diantara 1-12
        } while (!(isMonth) || (month <= 0) || (month > 12));

        //Validasi hari
        int dayOfMonth = 0;     //Inisiasi variabel dayOfMonth
        boolean isDay;          //Inisiasi variabel isDay

        System.out.println();
        do{

            System.out.print("Input your day of birth : ");
            if (input.hasNextInt()){                             //Mengecek apakah inputan selanjutnya integer
                dayOfMonth = input.nextInt();
                isDay = true;
            }else{                                              //Jika bukan integer
                isDay = false;
                input.next();
            }
        //Hari harus diantara 1-31
        } while (!(isDay) || (dayOfMonth <= 0) || (dayOfMonth > 31));

        //Main program
        LocalDate today = LocalDate.now();                          //Mengimport tanggal sekarang
        LocalDate bornDate = LocalDate.of(year, month, dayOfMonth); //Fungsi untuk mengisi tanggal lahirmu
        int years = Period.between(bornDate, today).getYears();     //Menghitung umurmu

        System.out.println();
        System.out.println("Date of The day : " + today);
        System.out.println("Your date of birth : " + bornDate);
        System.out.println("Your age now : " + years);
        System.out.println();
        System.out.println("Remember! The Greater your age is not the longer your life but the less your life");
    }
}
