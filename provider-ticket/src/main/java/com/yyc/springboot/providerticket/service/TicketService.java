package com.yyc.springboot.providerticket.service;

import org.springframework.stereotype.Service;

@Service
public class TicketService {
    public String getTicket() {
        System.out.println("8082");
        return "《电影01》";
    }
}
