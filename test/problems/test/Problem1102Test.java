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

        boolean t1 = Problem1102.multipleEleven(numbers[0]);
        assertThat(t1, is(equalTo(true)));
        
        boolean t2 = Problem1102.multipleEleven(numbers[1]);
        assertThat(t2, is(equalTo(true)));
        
        boolean t3 = Problem1102.multipleEleven(numbers[2]);
        assertThat(t3, is(equalTo(true)));
        
        boolean t4 = Problem1102.multipleEleven(numbers[3]);
        assertThat(t4, is(equalTo(true)));
        
        boolean t5 = Problem1102.multipleEleven(numbers[4]);
        assertThat(t5, is(equalTo(true)));
        
        boolean multiple = Problem1102.multipleEleven(numbers[5]);
        assertThat(multiple, is(equalTo(false)));
        
    }
}
