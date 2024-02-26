/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kbtg.bootcamp.posttest.users;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author thinnapath
 */
class UsersGetResponseDto {
    @JsonProperty("id")
    private String ticketId;

    public UsersGetResponseDto(String lottery) {
    }

    public String getTicketId() {
        return ticketId;
    }
    
    
}
