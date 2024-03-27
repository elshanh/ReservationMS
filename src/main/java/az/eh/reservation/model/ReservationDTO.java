package az.eh.reservation.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReservationDTO {

    private Long id;
    private Long tableId;
    private String reservStartTime;
    private String reservEndTime;
    private String status;
}
