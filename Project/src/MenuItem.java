class  MenuItem{
    private String itemName;
    private double price;
    private boolean entree;

    
    public MenuItem() {
        itemName="";
        price=0.00;
        entree=false;

    }

    public MenuItem(String itemName, double price, boolean entree) {
        this.itemName = itemName;
        this.price = price;
        this.entree = entree;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isEntree() {
        return entree;
    }

    public void setEntree(boolean entree) {
        this.entree = entree;
    }
}