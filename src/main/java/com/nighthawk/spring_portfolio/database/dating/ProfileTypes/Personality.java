package com.nighthawk.spring_portfolio.database.dating.ProfileTypes;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.nighthawk.spring_portfolio.database.dating.DatingProfile;
import com.nighthawk.spring_portfolio.database.person.Person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Personality extends ProfileType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn(name = "datingProfile_id")
    @ManyToOne(cascade = CascadeType.MERGE)
    private DatingProfile datingProfile;

    public String jsonString() {
        return "";
    }

    public Personality(DatingProfile datingProfile) {
        super();
        this.datingProfile = datingProfile;
    }
}
