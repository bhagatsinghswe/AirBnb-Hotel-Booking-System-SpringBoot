package com.bhagat.AirBnbApp.entity;


import com.bhagat.AirBnbApp.enums.Gender;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class Guest {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private Integer age;

//    @ManyToMany(mappedBy = "guests")
//    private Set<Booking> bookings;

}
