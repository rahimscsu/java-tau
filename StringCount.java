package chapter8;

public class StringCount {

    public static void main(String[] args) {
        countWords("I love test automation university");
    }

    public static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your test contains %d words. ", numberOfWords);
        System.out.println(message);

        for(int i = 0; i < numberOfWords; i++) {
            System.out.println(words[i]);
        }

    }
}
