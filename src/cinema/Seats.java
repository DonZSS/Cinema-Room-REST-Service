package cinema;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Seats {
    @JsonProperty("total_rows")
    private final int totalRows;

    @JsonProperty("total_columns")
    private final int totalColumns;

    @JsonProperty("available_seats")
    private final List<Seat> availableSeats;

    public int getTotalRows() {
        return totalRows;
    }

    public int getTotalColumns() {
        return totalColumns;
    }

    public List<Seat> getAvailableSeats() {
        return availableSeats;
    }

    // геттеры/сеттеры/конструктор(ы)
    public Seats(int rows, int cols) {
        this.totalRows = rows;
        this.totalColumns = cols;


        this.availableSeats = new ArrayList<>();
        for (int r = 1; r <= totalRows; r++) {
            for (int c = 1; c <= totalColumns; c++) {
                availableSeats.add(new Seat(r, c));
            }
        }
    }
}
