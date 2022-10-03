import com.lzj.config.SpringConfig;

import com.lzj.domain.Tb_user;
import com.lzj.service.UserService;
import com.lzj.service.impl.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AppForMybatis {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        UserService bean = ctx.getBean(UserService.class);

        List<Tb_user> all = UserService.findAll();

        System.out.println(all);



    }
}
