
import com.lzj.config.SpringConfig;
import com.lzj.dao.BookDao;
import com.lzj.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

public class AppForAnnotaion {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao);
        BookService bookService = (BookService) ctx.getBean(BookService.class);
        System.out.println(bookService);
    }
}
