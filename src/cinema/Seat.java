package cinema;

public class Seat {
    private int row;
    private int column;

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    // геттеры/сеттеры/конструктор(ы)
    public Seat(int r, int c) {
        this.row = r;
        this.column = c;
    }
}
