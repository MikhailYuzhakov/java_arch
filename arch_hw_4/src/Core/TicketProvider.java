package Core;

import Interfaces.ITicketRepo;
import Models.Ticket;
import Services.TicketRepository;

import java.util.List;

/**
 * Класс - провайдер для работы с базой данных билетов
 */
public class TicketProvider implements ITicketRepo {
    private final ITicketRepo ticketRepo;

    public TicketProvider() {
        // Класс репозитория находится в единственном экземпляре для того, чтобы не создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
        this.ticketRepo = TicketRepository.getTicketRepository();
    }

    @Override
    public boolean create(Ticket ticket) {
        return ticketRepo.create(ticket);
    }

    @Override
    public List<Ticket> readAll(int routeNumber) {
        return ticketRepo.readAll(routeNumber);
    }

    @Override
    public boolean update(Ticket ticket) {
        return ticketRepo.update(ticket);
    }

    @Override
    public boolean delete(Ticket ticket) {
        return ticketRepo.delete(ticket);
    }

    /**
     * Метод получения билетов из базы данных
     *
     * @param routeNumber номер маршрута
     * @return список билетов
     * @throws RuntimeException
     */
    public List<Ticket> getTickets(int routeNumber) {
        try {
            return ticketRepo.readAll(routeNumber);
        } catch (RuntimeException e) {
            throw new RuntimeException();
        }
    }

    /**
     * Метод обновления статуса билета
     *
     * @param ticket билет
     * @return результат выполнения операции
     */
    public boolean updateTicketStatus(Ticket ticket) {
        return ticketRepo.update(ticket);
    }
}
