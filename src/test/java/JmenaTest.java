import com.helenka.havelkova.Jmena;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by helena on 25.6.17.
 */
public class JmenaTest {
    @Test
    public void TestJmena() {
        Assert.assertEquals("Je to špatně!", "Helenko Havelková", Jmena.pozdrav("Helenko", "Havelková"));
        System.exit(0);}
    @Test
    public void FailujiciTestJmena() {
        Assert.assertEquals("Je to špatně!", "Ahoj Helenko Havelková", Jmena.pozdrav("H", "H"));
        System.exit(0); }
}
