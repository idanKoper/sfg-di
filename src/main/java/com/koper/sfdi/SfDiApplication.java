package com.koper.sfdi;

import com.koper.sfdi.contoller.ConstructorInjectedController;
import com.koper.sfdi.contoller.GetterInjectedController;
import com.koper.sfdi.contoller.MyController;
import com.koper.sfdi.contoller.PropertyInjectedController;
import com.koper.sfdi.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfDiApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SfDiApplication.class, args);

/*		I18nController i18nController = (I18nController) applicationContext.getBean("i18nController");
		System.out.println(i18nController.sayHello());*/


		MyController controller = (MyController) applicationContext.getBean("myController");

		FakeDataSource fakeDataSource = (FakeDataSource) applicationContext.getBean(FakeDataSource.class);

/*		System.out.println("-------Primary Bean");
		System.out.println(sfController.sayHello());

		System.out.println("-------property");
		PropertyInjectController propertyInjectController = (PropertyInjectController) applicationContext.getBean("propertyInjectController");
		System.out.println(propertyInjectController.getGreeting());

		System.out.println("-------Setter");
		SetterInjectController setterInjectController = (SetterInjectController) applicationContext.getBean("setterInjectController");
		System.out.println(setterInjectController.getGreeting());

		System.out.println("-------Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());*/

		System.out.println(controller.sayHello());

		System.out.println(applicationContext.getBean(PropertyInjectedController.class).getGreeting());
		System.out.println(applicationContext.getBean(GetterInjectedController.class).getGreeting());
		System.out.println(applicationContext.getBean(ConstructorInjectedController.class).getGreeting());

		System.out.println(fakeDataSource.getUser());


	}

}
