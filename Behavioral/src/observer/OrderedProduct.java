package observer;

import java.util.ArrayList;
import java.util.List;

class OrderedProduct {
    private List<Observer> observers = new ArrayList<>();
    private String checkPoint;

    String getCheckPoint() {
        return checkPoint;
    }

    void setCheckPoint(String checkPoint) {
        this.checkPoint = checkPoint;
        notifyAllObservers();
    }

    void attach(Observer observer) {
        observers.add(observer);
    }

    private void notifyAllObservers() {
        for (Observer observer: observers) {
            observer.update();
        }
    }
}