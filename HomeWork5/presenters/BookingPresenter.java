package HomeWork5.presenters;

import java.util.Date;

import HomeWork5.models.Reservation;
import HomeWork5.models.Table;
import HomeWork5.models.TableModel;

public class BookingPresenter implements ViewObserver {

    private final View bookingView;
    private final Model tableModel;

    public BookingPresenter(View bookingView, TableModel tableModel){
        this.bookingView = bookingView;
        this.tableModel = tableModel;
        bookingView.setObserver(this);
    }

    public void showTables(){
        bookingView.updateTablesView(tableModel.loadTables());
    }

    @Override
    public void onReservationTable(Date reservationDate, int tableNo, String name) {
        int reservationNo = tableModel.reservationTable(reservationDate, tableNo, name);
        bookingView.updateReservationTableResult(reservationNo);
    }

    @Override
    public void onChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        for (Table table : tableModel.loadTables()) {
            for (Reservation reservation : table.getReservations()) {
                if (reservation.getId() == oldReservation) {
                    table.getReservations().remove(reservation);
                    int newReservationNo = tableModel.reservationTable(reservationDate, tableNo, name);
                    bookingView.updateReservationTableResult(newReservationNo);
                    return;
                }
            }
        }
    }
}