import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class ReversewordsTest {


// TODO: Replace examples and use TDD development by writing your own tests


        @Test
        public void exampleCases() {
            assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", Reversewords.reverseWords("The quick brown fox jumps over the lazy dog."));
            assertEquals("elppa", Reversewords.reverseWords("apple"));
            assertEquals("a b c d", Reversewords.reverseWords("a b c d"));
            assertEquals("elbuod  decaps  sdrow", Reversewords.reverseWords("double  spaced  words"));
        }


}