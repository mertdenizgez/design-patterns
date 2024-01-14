import java.util.ArrayList;
import java.util.List;

public class Subject {

    private final List<Observer> obsList = new ArrayList<>();
    private String state;

    public ObserverIterator getIteratorObject() {
        return new ObserverIterator();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        if (this.state != state) {
            this.state = state;
            notifyAllObserver();
        } else System.out.println("No Change");
    }

    public void attach(Observer observer) {
        obsList.add(observer);
    }

    private void notifyAllObserver() {
        Iterator itr = this.getIteratorObject();
        while (itr.hasNext()) {
            itr.next().update();
        }
    }

    private class ObserverIterator implements Iterator {

        private int index = 0;

        public boolean hasNext() {
            return (index < obsList.size());
        }

        public Observer next() {
            return hasNext() ? obsList.get(index++) : null;
        }

    }

}

