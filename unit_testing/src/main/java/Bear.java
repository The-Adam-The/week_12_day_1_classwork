public class Bear {

    private String name;
    private int age;
    private float weight;
    private byte numberOfPicnicBaskets;

    public Bear(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getAge()  {
        return this.age;
    }

    public float getWeight() {
        return weight;
    }

    public boolean isReadyToHibernate() {
         return weight >= 21;

    }
}
