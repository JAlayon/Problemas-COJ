package problems.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import problems.Problem1003;
import static problems.Problem1003.indexMax;

public class Problem1003Test {

    private int array_test[] = {20, 40, 100, 90, 20, 10, 5, 10};
    
    private int votes_test[] = {159, 213, 450,
                                512, 890, 993,
                                215, 420, 397};
    
    private int N = 3;
    private int M = 3;

    @Test
    public void testIndexMax() {
        int indexMax = Problem1003.indexMax(array_test);
        assertThat(indexMax, is(equalTo(3)));
    }

    @Test
    public void testProblem() {
        int solution = Problem1003.solutionTest(M, N, votes_test);
        assertThat(solution, is(equalTo(3)));
    }

    
    
}
