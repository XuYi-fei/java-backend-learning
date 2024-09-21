package github.xuyifei.spring01ioc;

import github.xuyifei.spring01ioc.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

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

		// 4.1 从容器中获取组件 -- 名字
		Person person = (Person) ioc.getBean("person");
		System.out.println(person);

		// 4.2 从容器中获取组件 -- 类型
		Person person2 = ioc.getBean(Person.class);
		System.out.println(person2);

		// 5.1 获取FactoryBean创建的对象
		Object myBean = ioc.getBean("myBeanFactoryBean");
		System.out.println("bean的类型：" + myBean.getClass());
		// 5.2 获取FactoryBean本身
		Object myBeanFactoryBean = ioc.getBean("&myBeanFactoryBean");
		System.out.println("bean的类型：" + myBeanFactoryBean.getClass());
	}

	// 3. 向容器中注册组件，可以迁移到配置类中
//	@Bean
//	public Person person() {
//		Person person = new Person();
//		person.setName("zhangsan");
//		person.setAge(0);
//		person.setGender("");
//
//		return person;
//	}

}
