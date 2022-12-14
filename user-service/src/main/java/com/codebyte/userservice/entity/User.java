package com.codebyte.userservice.entity;

import com.codebyte.userservice.converter.ULIDConverter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Convert(converter = ULIDConverter.class)
    private String userUlid;
    private String name;
    private String email;
}
