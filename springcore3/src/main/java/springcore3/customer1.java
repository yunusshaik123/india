package springcore3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class customer1 {

	public static void main(String[] args)
	{
        Resource rs = new ClassPathResource("bean.xml");
		
		BeanFactory bn  = new XmlBeanFactory(rs);
		
		customer cs = (customer)bn.getBean("cst1");
		
		cs.display();

	}

}
