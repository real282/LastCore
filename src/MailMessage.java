public class MailMessage extends Sendable{
    public MailMessage(String from, String to, String content) {
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
    public String getContent() {
        return (String) super.getContent();
    }
}