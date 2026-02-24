package service;

import java.util.LinkedList;
import java.util.Iterator;

public class AppointmentService {

    private LinkedList<String> appointments = new LinkedList<>();

    public void initializeAppointments() {
        // TODO: Add 3 normal appointments
        appointments.add("Danya");
        appointments.add("Dany");
        appointments.add("Dan");
        System.out.println("added 3 normal appointments");
        // TODO: Add 1 urgent appointment at the beginning
        appointments.addFirst("Danon");
        System.out.println("added 1 urgent appointment");

    }

    public void cancelLast() {
        // TODO: Remove last appointment
        System.out.println("Removed last appointment : "+appointments.removeLast());
    }

    public void showFirstAndLast() {
        // TODO: Print first and last appointment
        System.out.println("First appointment : "+appointments.getFirst());
        System.out.println("Last appointment : "+appointments.getLast());
    }

    public void printAppointments() {
        // TODO: Traverse using Iterator
        System.out.println("Appointments :");
        Iterator<String> iterator = appointments.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}