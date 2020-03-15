package com.example.react.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collection = "Contacts")
public class Contact {

    @Id
    private Integer id;
    private String name;
    private String address;
    private String city;
    private String phone;
    private String email;

}
