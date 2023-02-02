package io.github.marcelluss1986.schedule;

import io.github.marcelluss1986.schedule.model.entity.Contact;
import io.github.marcelluss1986.schedule.model.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ScheduleApplication {


	public static void main(String[] args) {
		SpringApplication.run(ScheduleApplication.class, args);
	}

}
