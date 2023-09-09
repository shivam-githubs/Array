package Arrays;

public class Frequency {

    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 10, 10, 20, 25, 30, 40 };
        int f[] = new int[a.length];
        int vis = -1;

        for (int i = 0; i < a.length; i++) {
            int count = 1; // Initialize count to 1 for each element

            // Check if the element is not marked as visited
            if (a[i] != vis) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        count++;
                        // Mark the duplicate element as visited
                        a[j] = vis;
                    }
                }
                // Store the count in the corresponding index in 'f'
                f[i] = count;
                System.out.println(a[i] + " occurred " + count + " times");
            }
        }
    }
}
