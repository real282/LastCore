import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<MailMessage> {
    Map<String, List<T>> mailBox;

    public Map<String, List<T>> getMailBox() {
        mailBox = new HashMap<String, List<T>>() {
            @Override
            public List<T> get(Object key) {
                return super.getOrDefault(key, new LinkedList<T>());
            }
        };
        return mailBox;
    }

    @Override
    public void accept(Sendable<T> sendable) {
        List<T> list = new ArrayList<>();
        list.add(sendable.getContent());
        mailBox.put(sendable.getTo(), list);
    }
}