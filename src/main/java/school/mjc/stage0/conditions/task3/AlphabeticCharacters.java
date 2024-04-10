package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        char lowerChar = Character.toLowerCase(character);
        if (lowerChar < 'a' || lowerChar > 'z') {
            System.out.println("wrong alphabet!");
        } else if ("aeiou".indexOf(lowerChar) != -1) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
