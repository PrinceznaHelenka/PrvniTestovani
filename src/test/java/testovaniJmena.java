import com.helenka.havelkova.jmena;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by helena on 25.6.17.
 */
public class testovaniJmena {
    @Test
    public void TestJmena() {
        Assert.assertEquals("Je to špatně!", "Helenko Havelková", jmena.pozdrav("Helenko", "Havelková"));
    }
    @Test
    public void FailujiciTestJmena() {
        Assert.assertEquals("Je to špatně!", "Ahoj Helenko Havelková", jmena.pozdrav("H", "H"));
    }
}
