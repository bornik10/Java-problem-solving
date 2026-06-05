class item {
    String name;
    int price;
    int item_quantity;

    item(String name, int price, int item_quantity) {
        this.name = name;
        this.price = price;
        this.item_quantity = item_quantity;
    }

    public int total_cost () {
        return (price * item_quantity);
    }
}

public class reg_52_lab01 {
    public static void main(String[] args) {
        item drinks = new item("Pran", 25, 10);
        item chips = new item("Potato",10,  10);

        System.out.println("Drinks : Pran > Total cost : " + drinks.total_cost());
        System.out.println("Chips : Potato > Total cost : " + chips.total_cost());

        
    }
}
