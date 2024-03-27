package az.eh.reservation.controller;

import az.eh.reservation.model.ReservationDTO;
import az.eh.reservation.service.ReservationService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/internal/api/v1")
@RequiredArgsConstructor
public class ReservationController {

	@Autowired
	private ReservationService reservationService;

	@ApiOperation(value = "Reservation")
	@PostMapping("/reservation")
	public ReservationDTO saveRestaurant(@RequestBody ReservationDTO reservationDTO) {
		return reservationService.saveReservation(reservationDTO);
	}

}
