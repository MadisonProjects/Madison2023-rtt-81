package stringmethods;

public class SubstringDemo {

    public static void main(String[] args) {

        // -------------------0123456789012345
        String string = "This is a string";

        // Extract a substring from position 5 to 6 (exclusive)
        String sub = string.substring(5, 7);
        System.out.println(sub); // Output: "is"

        // Extract a substring starting from position 5 to the end
        String sub1 = string.substring(5);
        System.out.println(sub1); // Output: "is a string"

        String filename = "someimage.jpg";

        int lastDot = filename.lastIndexOf(".");

        // Extract the file extension using substring
        String ext = filename.substring(lastDot);
        System.out.println(ext); // Output: ".jpg"

        // -------------------01234567890
        String name = "Madison Buck";

        // Find the position of the last space in the name
        int spacePosition = name.lastIndexOf(" ");

        // Extract the first name from the full name
        String firstName = name.substring(0, spacePosition);
        System.out.println(firstName); // Output: "Madison"
        
        // Extract the last name from the full name
        String lastName = name.substring(spacePosition + 1);
        System.out.println(lastName); // Output: "Buck"
    }
}

	
	// Find the position of the last space in the string
	// Find the position of the last space in the string
	
	// Substiring of the character between the first