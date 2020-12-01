package com.dingwang.seanail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 海螺系统
 *
 * @version 1.0
 * @author 钱丁君-chandler 2020-10-24 15:09
 * @since 1.8
 */
@SpringBootApplication
@ImportResource(locations = {"classpath*:spring-seanail.xml"})
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

}
