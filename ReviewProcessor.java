import java.util.Scanner;

public class ReviewProcessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the review string
        System.out.println("Enter the product review: ");
        String review = scanner.nextLine();

        // 1. Word Count
        String[] words = review.split("\\s+"); // Splits by one or more spaces
        System.out.println("Word Count: " + words.length);

        // 2. Review Length
        int reviewLength = review.length();
        System.out.println("Review Length: " + reviewLength + " characters");

        // 3. Case Conversion
        String reviewUpperCase = review.toUpperCase();
        System.out.println("Review in Uppercase: " + reviewUpperCase);

        String reviewLowerCase = review.toLowerCase();
        System.out.println("Review in Lowercase: " + reviewLowerCase);

        // 4. Substring Extraction
        if (reviewLength > 10) {
            String substring = review.substring(0, 10); // Extract first 10 characters
            System.out.println("Extracted Substring (first 10 characters): " + substring);
        } else {
            System.out.println("Review is too short for substring extraction.");
        }

        // 5. String Replacement
        System.out.println("Enter a word or phrase to replace: ");
        String targetWord = scanner.nextLine();
        System.out.println("Enter the replacement word or phrase: ");
        String replacementWord = scanner.nextLine();
        String replacedReview = review.replace(targetWord, replacementWord);
        System.out.println("Review after replacement: " + replacedReview);

        // 6. Trimming Whitespace
        String trimmedReview = review.trim();
        System.out.println("Trimmed Review: '" + trimmedReview + "'");

        // 7. Checking Equality
        System.out.println("Enter a review to compare with the original review: ");
        String comparisonReview = scanner.nextLine();
        boolean isEqual = review.equals(comparisonReview);
        System.out.println("Are the reviews equal? " + isEqual);

        // 8. String Concatenation
        System.out.println("Enter a comment to append to the review: ");
        String comment = scanner.nextLine();
        String concatenatedReview = review.concat(" " + comment);
        System.out.println("Review after appending the comment: " + concatenatedReview);

        scanner.close();
    }
}
