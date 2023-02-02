package io.github.marcelluss1986.schedule.model.repository;

import io.github.marcelluss1986.schedule.model.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ContactRepository extends JpaRepository<Contact, Long> {

}
