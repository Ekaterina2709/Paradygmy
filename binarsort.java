public class binarsort {

    public static void main(String[] args) {
        int[] values = {1, 1, 2, 3, 4, 7, 9, 11, 10};
        int elem = 10;

        System.out.printf("Index elem = %d%n", binarySearch(values, elem, 0, values.length - 1));
    }

    private static int binarySearch(int[] sortedArray, int elem, int low, int high) {
        int index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sortedArray[mid] < elem) {
                low = mid + 1;
            } else if (sortedArray[mid] > elem) {
                high = mid - 1;
            } else if (sortedArray[mid] == elem) {
                index = mid;
                break;
            }
        }
        return index;
    }

}
