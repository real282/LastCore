import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<MailMessage> {
    Map<String, List<T>> map = new HashMap<String, List<T>>();

    public Map<String, List<T>> getMailBox() {
        return  null;
    }


    @Override
    public void accept(MailMessage mailMessage) {
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(value)))
    }
}
