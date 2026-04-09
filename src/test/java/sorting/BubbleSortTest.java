package sorting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
/*
 * i test cosi con le liste sono uno sbatti copiero questo test per ogni algoritmo 
 */
public class BubbleSortTest {
	
	@Test
    void testBubbleSort() {
        List<Integer> input = new ArrayList<>();
        input.add(5);
        input.add(8);
        input.add(1);
        input.add(2);
        input.add(15);
        input.add(4);

        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(4);
        expected.add(5);
        expected.add(8);
        expected.add(15);

        List<Integer> result = BubbleSort.bubbleSort(input);

        assertEquals(expected, result);
	}
}
