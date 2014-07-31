import junit.framework.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class BundleTest {

    private ResourceBundle bundlePT;
    private ResourceBundle bundleEN;

    @BeforeTest
    private void init() {
        bundlePT = ResourceBundle.getBundle("message", new Locale("pt"));
        bundleEN = ResourceBundle.getBundle("message", new Locale("en"));
    }

    @Test
    public void testBundle() {
        Assert.assertNotNull(bundlePT);
        Assert.assertNotNull(bundlePT.getString("arquivo"));
        Assert.assertEquals("arquivo", bundlePT.getString("arquivo"));

        Assert.assertNotNull(bundleEN);
        Assert.assertNotNull(bundleEN.getString("arquivo"));
        Assert.assertEquals("file", bundleEN.getString("arquivo"));
    }

}
