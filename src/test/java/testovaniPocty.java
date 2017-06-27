import com.helenka.havelkova.pocty;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by helena on 21.6.17.
 */
public class testovaniPocty {
    @Test
    public void TestScitani() { Assert.assertEquals("Je to spatne!", 10, pocty.scitani(5,5));}
    @Test
    public void TestOdecitani() {
        Assert.assertEquals("Je to spatne!", 10, pocty.odecitani(15,5));
    }
    @Test
    public void TestNasobeni() {
        Assert.assertEquals("Je to spatne!", 10, pocty.nasobeni(2,5));
    }
    @Test
    public void FailujiciTest() {
        Assert.assertEquals("Je to spatne!", 15, pocty.nasobeni(2,5));
    }

        @Test
    public void TestDeleni() {
        Assert.assertEquals("Je to spatne!", 10, pocty.deleni(50,5));
    }

}
