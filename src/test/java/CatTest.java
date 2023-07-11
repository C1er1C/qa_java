import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class CatTest {
    Feline feline = new Feline();
    Cat cat = new Cat(feline);

    @Test
    public void getSoundCat() {
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void eatMeatTest() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}
