package com.bestlalala.cloudschool.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Entity
@Table(name="user_table")
@NoArgsConstructor
public class User {
    @Id
    private Long id;

    @Setter
    private String name;

    private String email;

}
