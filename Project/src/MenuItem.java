class  MenuItem{
    private String itemName;
    private double price;
    private boolean side;

    
    public MenuItem() {
        itemName="";
        price=0.00;
        side=true;

    }

    public MenuItem(String itemName, double price, boolean side) {
        this.itemName = itemName;
        this.price = price;
        this.side = side;
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

    public boolean isSide() {
        return side;
    }

    public void setSide(boolean side) {
        this.side = side;
    }
    
    public String toString()
    {
    	return this.itemName + " $" + this.price;
    }
}