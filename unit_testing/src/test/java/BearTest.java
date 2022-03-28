import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear bear;

    @Before
    public void beforeEach() {
         bear = new Bear("Baloo", 25, 25.01f);
    }

    @Test
    public void hasName(){
        assertEquals("Baloo", bear.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(25, bear.getAge());
    }
    @Test
    public void hasWeight() {
        assertEquals(25.01f, bear.getWeight(), 0.01);
    }
    @Test
    public void isReadyToHibernate() {
        assertEquals(true, bear.isReadyToHibernate());
    }

    @Test
    public void isNotReadyToHibernate() {
        Bear malnourishedBear = new Bear("Kodak", 15, 19.7f);
        assertEquals(false, malnourishedBear.isReadyToHibernate());
    }

    @Test
    public void numberOfPicnicBaskets(){}
    Bear yogi = new Bear("Yogi", 20, 30.1f);
}
