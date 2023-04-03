public class Item{
    String itemname;
    double fullprice;
    double salesprice;
    private Object stringprice;

    public Item(String itemname, double fullprice, double salesprice) {
        this.itemname = itemname;
        this.fullprice = fullprice;
        this.salesprice = salesprice;
    }

    public Item(String itemname,double fullprice) {
        this.itemname = itemname;
        this.fullprice = fullprice;

    }

    static double format;{

    
    
    }

    @Override
    public String toString() {
        return "{" +" itemname='" + getItemname() + "'" +", fullprice='" + getSalesprice() + "'" +
        ", salesprice='" + getSalesprice() + "'" +
            "}";
    }

    private String getItemname() {
        return null;
    }

    private String getSalesprice() {
        return null;
    }

    public static void format() {
    }

}
 public class TestItem{
    public static void main(String[]args){
        Item nest = new Item(null, 0);
        Item.format();
        System.out.println()

    }

 }