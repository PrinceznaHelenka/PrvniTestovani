import com.helenka.havelkova.Pocty;
import org.junit.Assert;
import org.junit.Test;
//import org.junit.jupiter.api.*;

/**
 * Created by helena on 21.6.17.
 */
public class PoctyTest {
    @Test
    public void TestScitani() { Assert.assertEquals("Je to spatne!", 10, Pocty.scitani(5,5));}
    @Test
    public void TestOdecitani() {
        Assert.assertEquals("Je to spatne!", 10, Pocty.odecitani(15,5));
    }
    @Test
    public void TestNasobeni() {Assert.assertEquals("Je to spatne!", 10, Pocty.nasobeni(2,5));}
    @Test
    public void FailujiciTest() {
        Assert.assertEquals("Je to spatne!", 15, Pocty.nasobeni(2,5));
    }

    @Test
    public void TestDeleni() {
        Assert.assertEquals("Je to spatne!", 10, Pocty.deleni(50,5));
    }

}
