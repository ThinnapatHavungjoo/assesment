/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kbtg.bootcamp.posttest.lottery;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/**
 *
 * @author thinnapath
 */
@Entity
@Table(name = "lottery")
public class Lottery {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column (name = "lottoTicket")
    private String lottoTicket;
    
    private int price;
    
    private int amount;

    // getters and setters

    public Lottery(Long id, String lottoTicket, int price, int amount) {
        this.id = id;
        this.lottoTicket = lottoTicket;
        this.price = price;
        this.amount = amount;
    }

    Lottery() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLottoTicket() {
        return lottoTicket;
    }

    public void setLottoTicket(String lottoTicket) {
        this.lottoTicket = lottoTicket;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmout() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    
}
