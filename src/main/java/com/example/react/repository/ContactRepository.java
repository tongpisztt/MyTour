package com.example.react.repository;

import com.example.react.model.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ContactRepository extends MongoRepository<Contact, String> {

    List<Contact> findAll();
    Contact findById(Integer id);
}
