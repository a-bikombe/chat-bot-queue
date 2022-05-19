package ChatBotQueue;

import java.util.ArrayList;
import java.util.*;

public class ChatBotQueue {

    static ArrayList<String> queue = new ArrayList<String>();
    static String name, answer;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hello! Welcome to your chat room. ");    // Display a message welcoming the user to the chat room

        do {    // loop
            System.out.print("Please enter your name: ");    // Create a loop that allows people to enter the chat room
            name = input.next();
            addToQueue(name);// Add the person to the queue using the addToQueue method
            handleQueue();// Call the handleQueue method to simulate the handling of the chat
            
            System.out.print("Press \"W\" to welcome the next person, otherwise type \"quit\": ");
            answer = input.next();
        } while (!answer.equalsIgnoreCase("quit"));    // Loop back to welcome the next person, or quit to exit
    }

    public static void addToQueue(String name) {
        queue.add(name);    // Add the name into the queue
        int peopleAhead = queue.indexOf(name);    // Display a message that tells the person how many people are ahead of them
        
        if (peopleAhead == 1) {    // to get proper grammar ("person" vs. "people")
            System.out.print("There is " + peopleAhead + " person ahead of you. ");
        } else {
            System.out.print("There are " + peopleAhead + " people ahead of you. ");
        }
    }

    public static void handleQueue() {
        int action = (int) (Math.random() * 4);
        if (action == 0) {
            int queueSize = queue.size();
            name = queue.remove(queueSize - 1);
            System.out.println("Chatting with " + name + "...");
        } else {
            System.out.println("Please hold...");
        }
    }
}
