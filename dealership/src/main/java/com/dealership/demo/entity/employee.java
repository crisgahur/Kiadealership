package com.dealership.demo.entity;

/**
 *
 * @author Cristian Gallego
 */
public class employee {

    private int id;
    private String full_name;

    public employee() {

    }

    public employee(int id, String full_name) {
        super();
        this.id = id;
        this.full_name = full_name;
    }

    public String getName() {
        return full_name;
    }

    public void setName(String full_name) {
        this.full_name = full_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
