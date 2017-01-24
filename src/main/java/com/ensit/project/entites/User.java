package com.ensit.project.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User implements Serializable {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long id;
   private String email;
   private String password;
   private boolean enabeled;
   private String role;
public boolean isEnabeled() {
	return enabeled;
}
public void setEnabeled(boolean enabeled) {
	this.enabeled = enabeled;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
   
}
