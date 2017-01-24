package com.schoolmanager.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Mahdi on 3/24/2016.
 */

@Entity
public class Authorities {
    @Id
    @GeneratedValue
    private int authoritiesId;
    private String username;
    private String authority;

}
