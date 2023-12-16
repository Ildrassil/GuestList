import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuestListTest {

    @Test
    void shouldBeEmptyInitially() throws IOException {
        GuestList guestList = new GuestList();
        guestList.setGuestList(List.of());
        List<String> expected = List.of();
        List<String> guestList1 = guestList.getGuestList();
        assertEquals(expected, guestList1);


    }
    @Test
    void shouldReadSameGuestsAsWrittenBefore() throws IOException {
        GuestList guestList = new GuestList();
        guestList.setGuestList(List.of("Karl","Ute"));
        List<String> expected = List.of("Karl","Ute");
        assertEquals(expected,guestList.getGuestList());
    }

    @Test
    void shouldWriteToFileSystem() throws IOException {
        GuestRepo guestlist = new GuestRepo();
        guestlist.setGuestList(List.of("Theodor", "Anette"));


    }
}
