package cn.cssl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//映射扫描
@MapperScan("cn.cssl.dao")
@SpringBootApplication
public class open {
	public static void main(String[] args) {
		SpringApplication.run(open.class, args);
	}
}
