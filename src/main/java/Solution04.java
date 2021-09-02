/*
 *  UCF COP3330 Fall 2021 Assignment 1 exercise04 Solution04
 *  Copyright 2021 Juan Guarnizo
 */

/*
* Pseudocode
*
* Create 4 String variables named: noun, verb, adjective, adverb.
* create Scanner variable input.
*
* Print message: "Enter a noun:".
* noun = user's input.
*
* Print message:"Enter a verb:".
* verb = user's input.
*
* Print message:"Enter an adjective:".
* adjective = user's input.
*
* Print message:"Enter an adverb:".
* adverb = user's input.
*
* Print message:"Once upon a time, Little Red Riding Hood was cooking with her mother.
* Her mother told her: \"why don't you sweetie bring me my noun? it's in my room.
* Little Red Riding Hood found it but she decided to verb with it instead.
* It was a funny-looking and adjective thing for this little child.
* Finally she decided to adverb stop and bring it to her mother."
*
*
* */

import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {

        String noun, verb, adjective, adverb;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a noun:");
        noun = input.nextLine();

        System.out.println("Enter a verb:");
        verb = input.nextLine();

        System.out.println("Enter an adjective:");
        adjective = input.nextLine();

        System.out.println("Enter an adverb:");
        adverb = input.nextLine();

        System.out.printf("""
                Once upon a time, Little Red Riding Hood was cooking with her mother.
                Her mother told her: "why don't you sweetie bring me my %s? it's in my room.
                Little Red Riding Hood found it but she decided to %s with it instead.
                It was a funny-looking and %s thing for this little child.
                Finally she decided to %s stop and bring it to her mother.
                """, noun, verb, adjective, adverb);

    }
}
