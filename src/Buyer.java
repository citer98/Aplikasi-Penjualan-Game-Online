public class Buyer implements User{
    int opsi;
    private boolean isAdd();

    @Override
    public void ShowGameList()
    {
        System.out.println("\t\t Daftar Game \t\t");
        System.out.println("=======================");
        System.out.println("No  : 1\n");
        System.out.println("Nama: Satu\n");
        System.out.println("Sinopsis: Sinopsis satu\n");
        System.out.println("Harga   : Harga satu\n\n");
        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        System.out.println("No  : 2\n");
        System.out.println("Nama: Dua\n");
        System.out.println("Sinopsis: Sinopsis Dua\n");
        System.out.println("Harga   : Harga Dua\n\n");
        System.out.println("=======================");
    }

    public void AddToCart()
    {
        System.out.println("Masukan nomor game yang akan di beli\n");
        System.out.println("Pilihan : ");
    }
}
