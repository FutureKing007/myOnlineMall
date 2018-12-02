package com.pingyougou.pojo;

import java.io.Serializable;

public class Brand implements Serializable {
    private Integer id;
    private String name;
    private Character first_char;

    public Brand() {
    }

    public Brand(Integer id, String name, Character first_char) {
        this.id = id;
        this.name = name;
        this.first_char = first_char;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getFirst_char() {
        return first_char;
    }

    public void setFirst_char(Character first_char) {
        this.first_char = first_char;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", first_char=" + first_char +
                '}';
    }
}
