public class Bear {

    String name; // instance variable
    String sound = "Roar!!!!!!"; //class variable
    private int number_of_picnic_baskets;

    public Bear(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println("\n");
        if (this.name == "Balu"){
            System.out.println(this.name  +": 'Bear necessities...'  ");
        } else if (this.name == "Yogi"){
            number_of_picnic_baskets = 1;
            System.out.println(this.name  +": 'Imma stealing picnic baskets!'");
        } else {
            System.out.println(this.name  +": '" + this.sound + "'");
        }

        return "This bear is called " + this.name + ".";
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getPicnicBaskets() {
        return this.name + " has " + this.number_of_picnic_baskets + " picnic baskets.";
    }

    public void stealPicnicBaskets(int amount) {
        this.number_of_picnic_baskets += amount;
    }

}
