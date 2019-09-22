import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTests {

    @Test
    void findIndexTestOne() {
        int[] arr = {1};
        int numberToFind = 10;
        assertEquals(-1, BinarySearch.findIndex(arr, 0, arr.length-1, numberToFind));
    }

    @Test
    void findIndexTestTwo() {
        int[] arr = {1,2,3,5,6,7};
        int numberToFind = 4;
        assertEquals(-1, BinarySearch.findIndex(arr, 0, arr.length-1, numberToFind));
    }

    @Test
    void findIndexTestThree() {
        int[] arr = {1,2,3,5,6,7};
        int numberToFind = 6;
        assertEquals(4, BinarySearch.findIndex(arr, 0, arr.length-1, numberToFind));
    }

    @Test
    void findIndexTestFour() {
        int[] arr = {1,2,3,5,6,7};
        int numberToFind = 1;
        assertEquals(0, BinarySearch.findIndex(arr, 0, arr.length-1, numberToFind));
    }

}
