/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kbtg.bootcamp.posttest.users;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author thinnapath
 */
class UserResponseDto {
    @JsonProperty("tickets")
    private List<String> ticketNumber;

    @JsonProperty("cost")
    private BigDecimal pricePaid;

    @JsonProperty("count")
    private Long totalTicket;

    public UserResponseDto(List<String> ticketNumber, Long totalTicket) {
        this.ticketNumber = ticketNumber;
        this.pricePaid = pricePaid;
        this.totalTicket = totalTicket;
    }
    
}
