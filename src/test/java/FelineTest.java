import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import java.util.Random;

public class FelineTest {
    private final List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
    Random random = new Random();
    private final int kittensCount = random.nextInt();
    Feline feline = new Feline();

    @Test
    public void eatMeatTest() throws Exception {

        Assert.assertEquals(expectedFood, feline.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void defaultGetKittensTest() {
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensTest() {
        Assert.assertEquals(kittensCount, feline.getKittens(kittensCount));
    }
}