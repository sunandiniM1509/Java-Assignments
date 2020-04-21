import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class RegexCapsTest {

   private RegexCaps regexCaps;

   @Before
   public void setUp()
   {
       regexCaps = new RegexCaps();
   }

    @Test
    public void testConstraints_1()
    {
        String query = "The perfect sentence to pass.";
        Assert.assertEquals(true,regexCaps.checkConstraints(query));
    }
    @Test
    public void testConstraints_2()
    {
        String query = "     ";
        Assert.assertEquals(false,regexCaps.checkConstraints(query));
    }
    @Test
    public void testConstraints_3()
    {
        String query = ".Start with period end with capS";
        Assert.assertEquals(false,regexCaps.checkConstraints(query));
    }
    @Test
    public void testConstraints_4()
    {
        String query = "Too. .many. .periods.";
        Assert.assertEquals(true,regexCaps.checkConstraints(query));
    }
    @Test
    public void testConstraints_5()
    {
        String query = "A start and end with caps A";
        Assert.assertNotEquals(true,regexCaps.checkConstraints(query));
    }
    @Test
    public void testConstraints_6()
    {
        String query = " Oh I start with space.";
        Assert.assertFalse(regexCaps.checkConstraints(query));
    }
    @Test
    public void testConstraints_7()
    {
        String query = "................................A";
        Assert.assertFalse(regexCaps.checkConstraints(query));
    }
    @Test
    public void testConstraints_8()
    {
        String query = "It is a long sentence.";
        Assert.assertTrue(regexCaps.checkConstraints(query));
    }
    @Test
    public void testConstraints_9()
    {
        String query = "AAAAAAAAAAAAAAAAAAAAAA";
        Assert.assertFalse(regexCaps.checkConstraints(query));
    }
    @Test
    public void testConstraints_10()
    {
        String query = "B.o.r.i.n.g.sentence.";
        Assert.assertTrue(regexCaps.checkConstraints(query));
    }

}
