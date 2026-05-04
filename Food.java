class Food extends Items{

    private String name;
    private double price;
    private int filling;
    private String wording;

    public void Food(String name, double price, int filling, String wording) {
        this.price = price;
        this.filling = filling;
        this.wording = wording;
    }

    public String getWording(Item food){
        return food.price;
    }

    public int getFilling(Item food){
        return food.filling;
    }


}