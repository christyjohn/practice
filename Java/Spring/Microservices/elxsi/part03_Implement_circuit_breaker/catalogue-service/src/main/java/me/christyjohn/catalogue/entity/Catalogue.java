package me.christyjohn.catalogue.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Catalogue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long catalogueId;
    private String catalogueName;
    private String catalogueCode;

}
