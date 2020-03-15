package com.example.react.controller;

import com.example.react.model.Contact;
import com.example.react.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ourtour")
public class ContactController {

    @Autowired
    ContactRepository contactRepository;

    @GetMapping(value = "/contacts")
    public List<Contact> contact() {
        return contactRepository.findAll();
    }

    @PostMapping(value = "/contacts")
    public String save(@RequestBody Contact contact) {
        contactRepository.save(contact);

        return "Add \"" + contact.getName() + "\" contact successfully!";
    }

    @GetMapping(value = "/contacts/{id}")
    public Contact show(@PathVariable Integer id) {
        return contactRepository.findById(id);
    }

}
