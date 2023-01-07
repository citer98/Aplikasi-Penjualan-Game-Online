import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //objek aplikasi
        User GameStore = new Aplikasi();

        //objek Buyer
        Buyer Budi = new Buyer(GameStore);

        Scanner input = new Scanner(System.in);
        String aksi;

        while (true)
        {
            System.out.println("==========Opsi=========");
            System.out.println("|  1.Game List        |");
            System.out.println("|  2.Add To Cart      |");
            System.out.println("|  3.Remove From Cart |");
            System.out.println("|  4.Check Out        |");
            System.out.println("|  5.Exit             |");
            System.out.println("=======================");
            System.out.print(  "   Pilih Opsi Anda: ");
            aksi = input.nextLine();

            if(aksi.equalsIgnoreCase("1"))
            {
                Budi.GameList();
            }

            else if (aksi.equalsIgnoreCase("2"))
            {
                Budi.Add();
            } 
            
            else if (aksi.equalsIgnoreCase("3")) 
            {
                Budi.Remove();
            }

            else if (aksi.equalsIgnoreCase("4"))
            {
                Budi.Pay();
            }

            else if (aksi.equalsIgnoreCase("5"))
            {
                System.out.println("Terima Kasih\n");
                System.exit(0);
            }
            else
            {
                System.out.println("Opsi Tidak Ditemukan\n");
            }
        }

    }
}
