package chengmo.soft.mes;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@SpringBootApplication()
@MapperScan(value = "chengmo/soft/mes/dao")        //自动扫描配置文件注解
public class MesApplication {
//    @RequestMapping("/")
//    public String hello()
//    {
//        return  "hello";
//    }


    public static void main(String[] args) {
        SpringApplication.run(MesApplication.class, args);
    }

}
