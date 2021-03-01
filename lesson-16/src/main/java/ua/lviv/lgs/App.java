package ua.lviv.lgs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

		StudentDao dao = context.getBean(StudentDao.class);

		dao.create(new Student(1, "Max", 29));
		dao.create(new Student(2, "Andrew", 38));
		dao.readAll().forEach(System.out::println);
		System.out.println("---------------------------------------------------\n");

		dao.update(new Student(2, "Jon", 23));
		System.out.println(dao.readById(2));
		System.out.println("---------------------------------------------------\n");

		dao.delete(2);
		dao.readAll().forEach(System.out::println);
	}
}
