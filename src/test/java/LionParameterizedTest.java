import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private final String sexLion;
    private final boolean hasManeException;
    public LionParameterizedTest(String sexLion, boolean hasManeException) {
        this.sexLion = sexLion;
        this.hasManeException = hasManeException;
    }
    @Parameterized.Parameters
    public static Object[][] getLionParameters() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }
    @Test
    public void isHasManeTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline, sexLion);
        Assert.assertEquals(hasManeException, lion.doesHaveMane());
    }
}
