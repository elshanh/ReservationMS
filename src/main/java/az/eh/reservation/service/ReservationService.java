package az.eh.reservation.service;

import az.eh.reservation.model.ReservationDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "reservationMS", url = "http://localhost:8085/")
public interface ReservationService {

	@PostMapping("/internal/api/v1/reservation")
	ReservationDTO saveReservation(ReservationDTO reservationDTO);
}
