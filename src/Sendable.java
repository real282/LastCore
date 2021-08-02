public abstract class Sendable<T> {
    private String from;
    private String to;
    private T content;

    public Sendable(String from, String to) {
        this.from = from;
        this.to = to;

    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public T getT() {
        return t;
    }
}
