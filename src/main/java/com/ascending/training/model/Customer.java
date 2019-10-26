package com.ascending.training.model;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    public Customer(){
    }

    public Customer(String name, Integer age, Integer gender, Integer height, Integer weight, Integer primer){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.height=height;
        this.weight=weight;
        this.primer=primer;
    }
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "gender")
    private Integer gender;

    @Column(name = "height")
    private Integer height;

    @Column(name = "weight")
    private Integer weight;

    @Column(name = "primer")
    private Integer primer;


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public Integer getAge(){
        return age;
    }
    public void setAge(Integer age){
        this.age=age;
    }

    public Integer getGender(){
        return gender;
    }
    public void setGender(Integer gender){
        this.gender=gender;
    }

    public Integer getHeight(){
        return height;
    }
    public void setHeight(Integer height){
        this.height=height;
    }

    public Integer getWeight(){
        return weight;
    }
    public void setWeight(Integer weight){
        this.weight=weight;
    }

    public Integer getPrimer(){
        return primer;
    }
    public void setPrimer(Integer primer){
        this.primer=primer;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }
}
