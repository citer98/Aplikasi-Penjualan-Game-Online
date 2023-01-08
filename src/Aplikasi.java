import java.util.Scanner;

public class Aplikasi implements User{

    int total = 0;
    int aa = 25000,bb = 70000 ,cc = 30000;

    @Override
    public void ShowGameList()
    {
        System.out.println("\n=====================================================================================================================================");
        System.out.println("|                                                          DAFTAR GAME                                                              |");
        System.out.println("=====================================================================================================================================");
        System.out.println("| ID       : 101                                                                                                                    |");
        System.out.println("| Nama     : Half Life 2 : Episode 3                                                                                                |");
        System.out.println("| Genre    : FPS, Action, Sci-Fi, Singleplayer, Shooter                                                                             |");
        System.out.println("| Sinopsis : Setelah kematian Eli Vance di akhir Episode 2, kamu (Gordon) dan Alyx mengubur jasadnya                                |\n"+
                           "|            kemudian melanjutkan perjalanan menaiki helikopter menuju antartika yang merupakan tempat                              |\n"+
                           "|            keberadaan Borealis, kapal riset milik Aperture Science yang disebut-sebut miliki teknologi                            |\n"+
                           "|            super rahasia. Helikopter yang kamu naiki tiba-tiba ditembak hancur dan kamu serta Alyx kini                           |\n"+
                           "|            sadar jika Borealis dijaga ketat oleh pasukan Combine. Borealis kini diperlihatkan sebagai                             |\n"+
                           "|            semacam portal yang mengatur waktu dan dimensi.                                                                        |");
        System.out.println("| Harga    : Rp. 25.000                                                                                                             |");
        System.out.println("|                                                                                                                                   |");
        System.out.println("| ID       : 202                                                                                                                    |");
        System.out.println("| Nama     : Minecraft                                                                                                              |");
        System.out.println("| Genre    : Sandbox, Adventure, Survival, Challenge                                                                                |");
        System.out.println("| Sinopsis : Menjelajahi dunia 3D kotak-kotak dengan bioma Minecraft beragam yang dihasilkan secara prosedural,                     |\n" +
                           "|            dan dapat menemukan dan membuat dari bahan baku, alat kerajinan, membangun struktur atau pekerjaan tanah,              |\n" +
                           "|            tergantung pada mode permainan, dapat melawan musuh yang dikendalikan oleh komputer, dan juga bekerja sama             |\n" +
                           "|            atau bersaing dengan pemain lain di dunia yang sama. Mode permainan dalam Minecraft termasuk mode bertahan hidup,      |\n"+
                           "|            di mana pemain harus mendapatkan sumber daya untuk membangun dunia dan menjaga kesehatan, dan mode kreatif,            |\n" +
                           "|            di mana pemain memiliki sumber daya tanpa batas. Pemain dapat memodifikasi game dengan mod untuk membuat mekanisme,    |\n"+
                           "|            item, tekstur, add-ons, dan aset alur permainan baru.                                                                  |");
        System.out.println("| Harga    : Rp. 70.000                                                                                                             |");
        System.out.println("|                                                                                                                                   |");
        System.out.println("| ID       : 303                                                                                                                    |");
        System.out.println("| Nama     : Hollow Knight                                                                                                          |");
        System.out.println("| Genre    : Metroidvania, Souls-like, Adventure, Platformer, 2D                                                                    |");
        System.out.println("| Sinopsis : Merupakan game yang menceritakan kisah hollow kecil bertopeng yang berusaha mengungkap rahasia                         |\n"+
                           "|            kerajaan serangga di masa lampau, Hollownest. Dalam game ini semakin banyak kita menemui NPC                           |\n"+
                           "|            yang ada semakin banyak pula rahasia yang akan terungkap. Dan jika kamu cukup beruntung kamu mungkin akan              |\n"+
                           "|            menemukan rahasia-rahasia tertentu di dalam game ini.                                                                  |");
        System.out.println("| Harga    : Rp. 30.000                                                                                                             |");
        System.out.println("=====================================================================================================================================\n");
    }

    @Override
    public void AddToCart()
    {
        System.out.println("\nMasukan ID game yang akan di beli");
        System.out.print("ID : ");
        Scanner input = new Scanner(System.in);
        int add;
        add = input.nextInt();
        if (add==101)
        {
            total=total+aa;
            if (add==101 && total==50000) //aa aa
            {
                System.out.println("\nGame 'Half Life 2 : Episode 3' Sudah Ada Dalam Keranjang!!!\n");
                total=total-aa;
            }
            else if (add==101 && total==75000) //aa cc
            {
                System.out.println("\nGame 'Half Life 2 : Episode 3' Sudah Ada Dalam Keranjang!!!\n");
                total=total-aa;
            }
            else if (add==101 && total==120000) //aa bb
            {
                System.out.println("\nGame 'Half Life 2 : Episode 3' Sudah Ada Dalam Keranjang!!!\n");
                total=total-aa;
            }
            else if (add==101 && total==150000) // aa bb cc
            {
                System.out.println("\nGame 'Half Life 2 : Episode 3' Sudah Ada Dalam Keranjang!!!\n");
                total=total-aa;
            }
            else
            {
                System.out.println("\nGame 'Half Life 2 : Episode 3' Berhasil Ditambahkan\n");
            }
        }

        else if (add==202)
        {
            total=total+bb;
            if (add==202 && total==140000) //bb bb
            {
                System.out.println("\nGame 'Minecraft' Sudah Ada Dalam Keranjang!!!\n");
                total=total-bb;
            }
            else if (add==202 && total==165000) // bb aa
            {
                System.out.println("\nGame 'Minecraft' Sudah Ada Dalam Keranjang!!!\n");
                total=total-bb;
            }
            else if (add==202 && total==170000) // bb cc
            {
                System.out.println("\nGame 'Minecraft' Sudah Ada Dalam Keranjang!!!\n");
                total=total-bb;
            }
            else if (add==202 && total==195000) // bb aa cc
            {
                System.out.println("\nGame 'Minecraft' Sudah Ada Dalam Keranjang!!!\n");
                total=total-bb;
            }
            else
            {
                System.out.println("\nGame 'Minecraft' Berhasil Ditambahkan\n");
            }
        }

        else if (add==303)
        {
            total=total+cc;
            if (add==303 && total==60000) //cc
            {
                System.out.println("\nGame 'Hollow Knight' Sudah Ada Dalam Keranjang!!!\n");
                total=total-cc;
            }
            else if (add==303 && total==75000) //cc aa
            {
                System.out.println("\nGame 'Hollow Knight' Sudah Ada Dalam Keranjang!!!\n");
                total=total-cc;
            }
            else if (add==303 && total==130000) //cc bb
            {
                System.out.println("\nGame 'Hollow Knight' Sudah Ada Dalam Keranjang!!!\n");
                total=total-cc;
            }
            else if (add==303 && total==150000) //cc aa bb
            {
                System.out.println("\nGame 'Hollow Knight' Sudah Ada Dalam Keranjang!!!\n");
                total=total-cc;
            }
            else
            {
                System.out.println("\nGame 'Hollow Knight' Berhasil Ditambahkan\n");
            }
        }
        else
        {
            System.out.println("\nID Game Tidak Ditemukan\n");
        }
    }

    @Override
    public void RemoveFromCart()
    {
        System.out.println("\nMasukan ID game yang akan di dikembalikan");
        System.out.print("ID : ");
        Scanner input = new Scanner(System.in);
        int remove;
        remove = input.nextInt();
        if (remove==101)
        {
            total=total-aa;
            if (total<=0)
            {
                System.out.println("\nGame 'Half Life 2 : Episode 3' Belum Ditambahkan Ke Dalam Keranjang!!!\n");
            }
            else if (remove==101 && total==75000) //bb cc
            {
                System.out.println("\nGame 'Half Life 2 : Episode 3' Belum Ditambahkan Ke Dalam Keranjang!!!\n");
                total=total+aa;
            }
            else
            {
                System.out.println("\nGame 'Half Life 2 : Episode 3' Berhasil Dikembalikan\n");
            }
        }

        else if (remove==202)
        {
            total=total-bb;
            if (total<=0)
            {
                System.out.println("\nGame 'Minecraft' Belum Ditambahkan Ke Dalam Keranjang!!!\n");
            }
            else
            {
                System.out.println("\nGame 'Minecraft' Berhasil Dikembalikan\n");
            }
        }

        else if (remove==303)
        {
            total=total-cc;
            if (total<=0)
            {
                System.out.println("\nGame 'Hollow Knight' Belum Ditambahkan Ke Dalam Keranjang!!!\n");
            }
            else if (remove==303 && total==65000) //aa bb
            {
                System.out.println("\nGame 'Hollow Knight' Belum Ditambahkan Ke Dalam Keranjang!!!\n");
                total=total+cc;
            }
            else
            {
                System.out.println("\nGame 'Hollow Knight' Berhasil Dikembalikan\n");
            }
        }
        else
        {
            System.out.println("\nID Game Tidak Ditemukan\n");
        }
    }

    @Override
    public void CheckOut()
    {
        if (total<=0)
        {
            System.out.println("\nMaaf Tapi Keranjang Anda Masih Kosong");
            total=0;
            System.out.println("Total : Masih "+total+"\n");
        }
        else
        {
            System.out.println("");
            System.out.println("===================================");
            System.out.println("|            Check Out            |");
            System.out.println("===================================");
            total = total;
            if (total==25000)
            {
                System.out.println("| ID    : 101                     |");
                System.out.println("| Game  : Half Life 2 : Episode 3 |");
                System.out.println("| Harga : Rp."+aa+"                |");
                System.out.println("|                                 |");
                System.out.println("| Total : Rp."+total+"                |");
                System.out.println("===================================\n");
            }
            else if (total==70000)
            {
                System.out.println("| ID    : 202                     |");
                System.out.println("| Game  : Minecraft               |");
                System.out.println("| Harga : Rp."+bb+"                |");
                System.out.println("|                                 |");
                System.out.println("| Total : Rp."+total+"                |");
                System.out.println("===================================\n");
            }
            else if (total==30000)
            {
                System.out.println("| ID    : 303                     |");
                System.out.println("| Game  : Hollow Knight           |");
                System.out.println("| Harga : Rp."+cc+"                |");
                System.out.println("|                                 |");
                System.out.println("| Total : "+total+"                   |");
                System.out.println("===================================\n");
            }
            else if (total==95000)
            {
                System.out.println("| ID    : 101                     |");
                System.out.println("| Game  : Half Life 2 : Episode 3 |");
                System.out.println("| Harga : Rp."+aa+"                |");
                System.out.println("|                                 |");
                System.out.println("| ID    : 202                     |");
                System.out.println("| Game  : Minecraft               |");
                System.out.println("| Harga : Rp."+bb+"                |");
                System.out.println("|                                 |");
                System.out.println("| Total : "+total+"                   |");
                System.out.println("===================================\n");
            }
            else if (total==55000)
            {
                System.out.println("| ID    : 101                     |");
                System.out.println("| Game  : Half Life 2 : Episode 3 |");
                System.out.println("| Harga : Rp."+aa+"                |");
                System.out.println("|                                 |");
                System.out.println("| ID    : 303                     |");
                System.out.println("| Game  : Hollow Knight           |");
                System.out.println("| Harga : Rp."+cc+"                |");
                System.out.println("|                                 |");
                System.out.println("| Total : "+total+"                   |");
                System.out.println("===================================\n");
            }
            else if (total==100000)
            {
                System.out.println("| ID    : 202                     |");
                System.out.println("| Game  : Minecraft               |");
                System.out.println("| Harga : Rp."+bb+"                |");
                System.out.println("|                                 |");
                System.out.println("| ID    : 303                     |");
                System.out.println("| Game  : Hollow Knight           |");
                System.out.println("| Harga : Rp."+cc+"                |");
                System.out.println("|                                 |");
                System.out.println("| Total : "+total+"                  |");
                System.out.println("===================================\n");
            }
            else if (total==125000)
            {
                System.out.println("| ID    : 101                     |");
                System.out.println("| Game  : Half Life 2 : Episode 3 |");
                System.out.println("| Harga : Rp."+aa+"                |");
                System.out.println("|                                 |");
                System.out.println("| ID    : 202                     |");
                System.out.println("| Game  : Minecraft               |");
                System.out.println("| Harga : Rp."+bb+"                |");
                System.out.println("|                                 |");
                System.out.println("| ID    : 303                     |");
                System.out.println("| Game  : Hollow Knight           |");
                System.out.println("| Harga : Rp."+cc+"                |");
                System.out.println("|                                 |");
                System.out.println("| Total : "+total+"                  |");
                System.out.println("===================================\n");
            }
        }

    }
}
