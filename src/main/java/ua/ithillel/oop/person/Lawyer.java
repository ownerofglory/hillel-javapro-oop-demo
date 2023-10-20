package ua.ithillel.oop.person;

import java.util.Date;
import java.util.List;

public class Lawyer {
    private List<Order> schedule;
    private List<Date> vacationDates;

    private boolean checkAvailability(Order order) {
        // if there is  not order with specified date

        // check if the date is niot on WE

        // check is date is not on vacation

        return false;
    }

    public Date order(Order order) {
        if (checkAvailability(order)) {
            schedule.add(order);
            return order.getDate();
        }

        return null;
    }
}
