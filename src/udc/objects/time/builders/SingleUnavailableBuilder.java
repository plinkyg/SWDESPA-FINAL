package udc.objects.time.builders;

import udc.objects.enums.AgendaType;
import udc.objects.time.concrete.Unavailable;

import java.time.LocalDateTime;

public class SingleUnavailableBuilder extends UnavailableBuilder {

    public Unavailable build (LocalDateTime start, LocalDateTime end, String doctor, String client) {
        this.build(start, end);

        this.getUnavailable().setType(AgendaType.SINGLE);

        return this.getUnavailable();
    }

    public Unavailable build (int id, LocalDateTime start, LocalDateTime end, String doctor, String client) {
        this.build(id, start, end);

        this.getUnavailable().setType(AgendaType.SINGLE);

        return this.getUnavailable();
    }
}