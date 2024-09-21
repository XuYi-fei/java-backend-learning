package github.xuyifei.spring01ioc.config;

import github.xuyifei.spring01ioc.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: java-backend-learning
 * @description:
 * @author: XuYifei
 * @create: 2024-09-21
 */

@Configuration
public class PersonConfig {
    @Bean
	public Person person() {
		Person person = new Person();
		person.setName("zhangsan");
		person.setAge(0);
		person.setGender("");

		return person;
	}
}
