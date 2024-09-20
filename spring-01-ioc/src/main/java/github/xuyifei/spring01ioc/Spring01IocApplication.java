package github.xuyifei.spring01ioc;

import github.xuyifei.spring01ioc.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

// 主入口类，主程序类
@SpringBootApplication
public class Spring01IocApplication {

	public static void main(String[] args) {
		// 1. ApplicationContext：代表IOC容器，Spring应用上下文对象
		ConfigurableApplicationContext ioc = SpringApplication.run(Spring01IocApplication.class, args);

		// 2. 容器中装了哪些组件
		String[] beanDefinitionNames = ioc.getBeanDefinitionNames();
		System.out.println("容器中装了" + ioc.getBeanDefinitionCount() + "个组件");
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
	}

	// 3. 向容器中注册组件
	@Bean
	public Person person() {
		Person person = new Person();
		person.setName("zhangsan");
		person.setAge(0);
		person.setGender("");

		return person;
	}

}
