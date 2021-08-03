public class Salary extends Sendable{
    public Salary(String from, String to, Integer content) {
        super(from, to, content);
    }

    @Override
    public String getFrom() {
        return super.getFrom();
    }

    @Override
    public String getTo() {
        return super.getTo();
    }

    @Override
    public Integer getContent() {
        return (Integer) super.getContent();
    }
}