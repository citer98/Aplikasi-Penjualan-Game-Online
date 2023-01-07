public class Buyer {
    private User user;

    public Buyer(User user){
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

}

