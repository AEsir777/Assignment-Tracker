package demo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

import demo.demo.repository.DueRepository;
import demo.demo.entity.Due;


@SpringBootApplication
public class DemoApplication /* implements CommandLineRunner */ {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println(SpringVersion.getVersion());
	}

/* 	@Autowired
	private DueRepository dueRepository;

	@Override
	public void run(String... args) throws Exception {
		Due due1 = new Due("CS348", "2023-6-22 11:59pm", false);
		dueRepository.save(due1);

		Due due2 = new Due("CS241", "2023-6-23 11:59pm", false);
		dueRepository.save(due2);

	}
 */
}
