package cinema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

    }
}


@RestController
@RequestMapping("/seats")
class Controller {
    Seats seats = new Seats(9, 9);

    @GetMapping
    public Seats getSeats() {
        return seats;
    }
}

