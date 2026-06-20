package design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    List<OrderPlacedObserver> li;

    public Amazon() {
        li = new ArrayList<>();
    }

    public void addObserver(OrderPlacedObserver observer) {
        li.add(observer);
    }

    public void removeObserver(OrderPlacedObserver observer) {
        li.remove(observer);
    }

    public void orderPlacedNotification() {
        for (OrderPlacedObserver observer : li) {
            observer.orderPlaced();
        }
    }
}
