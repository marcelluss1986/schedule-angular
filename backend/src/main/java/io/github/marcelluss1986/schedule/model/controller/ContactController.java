package io.github.marcelluss1986.schedule.model.controller;

import io.github.marcelluss1986.schedule.model.ContactDTO;
import io.github.marcelluss1986.schedule.model.entity.Contact;
import io.github.marcelluss1986.schedule.model.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/contacts")
public class ContactController {

    @Autowired
    private ContactRepository repository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ContactDTO save(@RequestBody ContactDTO dto){
       Contact contact = new Contact();
        contact.setName(dto.getName());
        contact.setEmail(dto.getEmail());
        contact.setFavorite(dto.getFavorite());
        repository.save(contact);
        return new ContactDTO(contact);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }

    @GetMapping
    public List<Contact> list(){
        return repository.findAll();
    }

    @PatchMapping("{id}/favorite")
    public void favorite(@PathVariable Long id, @RequestBody Boolean favorite){
       Optional<Contact> contact = repository.findById(id);
       contact.ifPresent(c -> {
           c.setFavorite(favorite);
           repository.save(c);
       });
    }

}
