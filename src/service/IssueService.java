package service;

import model.Issue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class IssueService {

    private PriorityQueue<Issue> issues = new PriorityQueue<>();

    public void initializeIssues() {
        // TODO: Add at least 5 issues
        issues.add(new Issue("clash",10));
        issues.add(new Issue("clas",8));
        issues.add(new Issue("cla",6));
        issues.add(new Issue("cl",4));
        issues.add(new Issue("bug",1));
        System.out.println("5 issues added");
    }

    public void showMostUrgent() {
        // TODO: Show most urgent issue
        System.out.println(issues.peek());
    }

    public void resolveIssues() {
        // TODO: Remove 2 issues
        System.out.println("Removed : "+issues.poll());
        System.out.println("Removed : "+issues.poll());
    }

    public void printRemainingIssues() {
        // TODO: Print using iterator
        System.out.println("Remaining issues :");
        Iterator<Issue> iterator = issues.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void addNewIssue(String description, int urgency) {
        // TODO: Add new issue
        issues.add(new Issue(description,urgency));
        System.out.println("New issue added");
    }
}