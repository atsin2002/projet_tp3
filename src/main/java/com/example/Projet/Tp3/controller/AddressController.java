package com.example.Projet.Tp3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Projet.Tp3.model.Address;
import com.example.Projet.Tp3.model.AddressRepository;


@Controller
public class AddressController {
 @Autowired
 AddressRepository addressRepository;
 @GetMapping("/addresses")
 public String showAddresses(Model model) {
 model.addAttribute("allAddresses", addressRepository.findAll());
 return "addresses";
 }
 
 
}
