import com.liulq.gradle.todo.model.TodoItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * @author liulq
 * @version 1.0
 * @description: TODO
 * @date 2022/1/10 17:10
 */
public class App {
    static Logger log = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        while (++i > 0) {
            System.out.println(i + ". Please input todo item name: ");
            TodoItem item  = new TodoItem(scanner.nextLine());
            System.out.println(item);
        }
    }
}
