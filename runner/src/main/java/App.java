import com.mail.message.api.Message;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Julia on 09.10.2016.
 */
public class App {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.mail");
        context.refresh();
        Message message = context.getBean(Message.class);
        System.out.println(message.getText());
    }
}
