import com.helenka.havelkova.pocty;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by helena on 21.6.17.
 */
public class testovaniPocty {
    @Test
    public void testScitani() {
        Assert.assertEquals("Je to spatne!", 10, pocty.scitani(1,5));
    }
    @Test
    public void testOdecitani() {
        Assert.assertEquals("Je to spatne!", 10, pocty.odecitani(15,5));
    }
    @Test
    public void testNasobeni() {
        Assert.assertEquals("Je to spatne!", 10, pocty.odecitani(2,5));
    }
    @Test
    public void testDeleni() {
        Assert.assertEquals("Je to spatne!", 10, pocty.odecitani(50,5));
    }

}
