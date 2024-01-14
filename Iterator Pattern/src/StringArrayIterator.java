public class StringArrayIterator implements Iterator {

    String[] standings;
    private int index = 0;

    public StringArrayIterator(String[] standings) {
        this.standings = standings;
    }

    public boolean hasNext() {
        return (index < standings.length);
    }

    public Object next() {
        return hasNext() ? standings[index++] : null;
    }

    public void resetIndex() {
        index = 0;
    }
}