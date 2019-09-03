package cn.eleven.bean;

import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: spring环境测试
 * @date: 2019-09-02 18:57
 * @author: 十一
 */
public class SpringTest {

	@org.junit.Test
	public  void test() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Person person = (Person) applicationContext.getBean("person");
		System.out.println("name: " + person.getName());
		Assert.assertEquals("eleven",person.getName());
	}
}
