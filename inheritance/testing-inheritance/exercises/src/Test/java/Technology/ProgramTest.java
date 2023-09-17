package Technology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProgramTest {
    //Computer class tests
    @Test
    public void isOldReturnsTrueIfOlderThan3() {
        Computer test = new Computer(1,"Dell", 123, 2011);
        assertTrue(test.isOld());

    }

  @Test
   public void isOldReturnsFalseIfYoungerThan3() {
        Computer test = new Computer (3, "Dell", 123, 2022);
       assertFalse(test.isOld());

   }

    //LapTop class tests

    //SmartPhone class tests

}
