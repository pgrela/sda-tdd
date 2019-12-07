import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KlasaProdukcyjnaTest {
    @Test
    public void dodawanie(){
        // given
        KlasaProdukcyjna klasaProdukcyjna = new KlasaProdukcyjna();

        // whenFIRST
        int wynik = klasaProdukcyjna.dodaj(2, 3);

        // then
        Assertions.assertEquals(5, wynik);
    }
}
