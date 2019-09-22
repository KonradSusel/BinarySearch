public class BinarySearch {

    public static void main(String[] args) {
        int numberToFind = 1;
        int[] arr = {1, 3, 18, 20, 38, 51};

        System.out.println("Index number: " + findIndex(arr, 0, arr.length-1, numberToFind));
    }

    public static int findIndex(int[] arr, int first, int last, int numberToFind) {
        if (first >= last) {
            if (arr[first] == numberToFind) {
                return first;
            } else {
                return -1; //not found
            }
        }

        int middleIndex = first + (last - first) /2;
        if (arr[middleIndex] == numberToFind) {
            return middleIndex;
        } else if (arr[middleIndex] > numberToFind){
            return findIndex(arr, 0, middleIndex-1, numberToFind);
        } else {
            return findIndex(arr, middleIndex+1, last, numberToFind);
        }
    }
}
