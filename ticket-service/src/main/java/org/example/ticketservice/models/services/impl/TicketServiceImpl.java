package org.example.ticketservice.models.services.impl;

import lombok.RequiredArgsConstructor;
import org.example.ticketservice.models.dto.requests.CreateTicketRequest;
import org.example.ticketservice.models.dto.responses.TicketResponse;
import org.example.ticketservice.models.repositories.TicketDetailRepository;
import org.example.ticketservice.models.repositories.TicketRepository;
import org.example.ticketservice.models.services.TicketService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TicketServiceImpl implements TicketService {
    private final TicketRepository ticketRepository;
    private final TicketDetailRepository ticketDetailRepository;
    private final TripGatewayService tripGatewayService;

    @Override
    public TicketResponse createTicket(CreateTicketRequest request) {
        throw new UnsupportedOperationException();
    }
}
