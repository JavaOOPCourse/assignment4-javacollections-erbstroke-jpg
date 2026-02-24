package service;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ActionHistoryService {

    private ArrayDeque<String> actions = new ArrayDeque<>();

    public void initializeActions() {
        // TODO: Add 4 actions
        actions.push("Brawl Stars");
        actions.push("Brawl ");
        actions.push("Stars");
        actions.push("Clash Royal");
        System.out.println("4 actions were added");
    }

    public void undoLastAction() {
        // TODO: Remove last action
        if(actions.isEmpty()){
            System.out.println("Actions is Empty");
        }
        System.out.println("Last actions removed : "+actions.removeFirst());
    }

    public void addRequestedTranscript() {
        // TODO: Add "Requested Transcript"
        actions.push("Requested Transcript");
        System.out.println("Requested Transcript added");

    }

    public void showFirstAndLast() {
        // TODO: Print first and last action
        System.out.println("First Action : "+actions.peekLast());
        System.out.println("Last Action : "+actions.peekFirst());
    }

    public void printHistory() {
        // TODO: Iterate through history
        System.out.println("Actions history :");
        Iterator<String> iterator = actions.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}