public class ApkUser {
    private User user;

    public ApkUser(User user){
        this.user = user;
    }
    void GameList(){
        this.user.ShowGameList();
    }
    void Add(){
        this.user.AddToCart();
    }
    void Remove(){
        this.user.RemoveFromCart();
    }
    void Pay(){
        this.user.CheckOut();
    }
    void Quit(){
        this.user.Exit();
    }
}

