public class Runner {


    public static void main(String[] args) {
        Bear bear = new Bear("Balu");
        String intro = bear.getName();
        System.out.println(intro);
        bear.setName("Yogi");
        intro =  bear.getName();
        System.out.println(intro);

//      picnic_baskets = Bear.number_of_picnic_baskets; // Will not work as the variable is private
        String picnicBaskets = bear.getPicnicBaskets();
        System.out.println(picnicBaskets);

        bear.stealPicnicBaskets(2);
        picnicBaskets = bear.getPicnicBaskets();
        System.out.println(picnicBaskets);


    }


}
