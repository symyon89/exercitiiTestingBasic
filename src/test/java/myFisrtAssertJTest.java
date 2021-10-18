import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class myFisrtAssertJTest {

    @Test
    public void MyFirstAssertJTest(){
        String name ="Jhon";

        Assertions.assertThat(name)
                .startsWith("J")
                .contains("o")
                .doesNotContain("f");
    }
}
