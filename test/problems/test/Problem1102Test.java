package problems.test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;
import problems.Problem1102;

/**
 *
 * @author alayon
 */
public class Problem1102Test {

    String numbers[] = {"112233", "30800", "2937", "323455693", "5038297", "112234"};

    @Test
    public void testMultpleEleven() {

        boolean multiple = Problem1102.multipleEleven(numbers[0]);
        assertThat(multiple, is(equalTo(false)));
    }
}
