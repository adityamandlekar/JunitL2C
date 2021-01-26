import org.junit.Test;

class findLargestNumberArrayTest {

    @Test
    public void findMaxValue() {
        int[] numbers = new int[] {229, 2, 3, 58, 47, 229, 40};
        int maxValue = findLargestNumberArray.findLargestNumber(numbers);
        assert(maxValue == 229);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldBeIllegalArgumentException() {
        int[] emptyArray = new int[] {};
        int maxValue = findLargestNumberArray.findLargestNumber(emptyArray);
    }

    @Test
    public void findMaxValueSingleNumber() {
        int[] numbers = new int[] {229};
        int maxValue = findLargestNumberArray.findLargestNumber(numbers);
        assert(maxValue == 229);
    }

    @Test
    public void findMaxValueTwoNumbers() {
        int[] numbers = new int[] {229,230};
        int maxValue = findLargestNumberArray.findLargestNumber(numbers);
        assert(maxValue == 230);
    }
}
