package stream.employee;

import java.util.LinkedList;
import java.util.List;

public class AddLinkedLists {

    public static LinkedList<Integer> addLinkedLists(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> result = new LinkedList<>();
        int carry = 0;

        // Iterate through both lists simultaneously
        while (!l1.isEmpty() || !l2.isEmpty() || carry > 0) {
            int sum = carry;

            // Add digits from l1 (if any)
            if (!l1.isEmpty()) {
                sum += l1.removeLast();
            }

            // Add digits from l2 (if any)
            if (!l2.isEmpty()) {
                sum += l2.removeLast();
            }

            // Calculate digit to add to result and carry
            int digit = sum % 10;
            carry = sum / 10;
            result.addFirst(digit); // Add digit to the front of the result list
        }

        return result;
    }

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>(List.of(2, 4, 3));
        LinkedList<Integer> l2 = new LinkedList<>(List.of(5, 6, 4));
        LinkedList<Integer> result = addLinkedLists(l1, l2);
        System.out.println("Result: " + result); // Output: [7, 0, 8]
    }
}
