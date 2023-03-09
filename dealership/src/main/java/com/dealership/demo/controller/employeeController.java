/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dealership.demo.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Cristian Gallego
 */
@RestController
public class employeeController {

    Map<String, String> EndpointMessage = new HashMap<>();

    @GetMapping("/employee/{id}")
    public Map<String, String> getEmployee() {
        EndpointMessage.put("message", "Get method is working");
        return EndpointMessage;
    }

    @PostMapping("/employee/{id}")
    public Map<String, String> postEmployee() {
        EndpointMessage.put("message", "Post method is working");
        return EndpointMessage;
    }

    @PutMapping("/employee/{id}")
    public Map<String, String> putEmployee() {
        EndpointMessage.put("message", "Put method is working");
        return EndpointMessage;
    }

    @DeleteMapping("/employee/{id}")
    public Map<String, String> deletetEmployee() {
        EndpointMessage.put("message", "Delete method is working");
        return EndpointMessage;
    }

    @PatchMapping("/employee/{id}")
    public Map<String, String> patchEmployee() {
        EndpointMessage.put("message", "Patch method is working");
        return EndpointMessage;
    }

}