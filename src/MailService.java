import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Sendable<T>> {
    Map<String, List<T>> mailBox = new HashMap<String, List<T>>() {
        @Override
        public List<T> get(Object key) {
            if (containsKey(key)) {
                return super.get(key);
            } else {
                return super.getOrDefault(key, new LinkedList<T>());
            }
        }
    };

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

    // Обработка списка писем почтовым сервисом
    @Override
    public void accept(Sendable<T> sendable) {
        List<T> list = new ArrayList<>();

        list.add(sendable.getContent());
        mailBox.put(sendable.getTo(), list);
    }
}