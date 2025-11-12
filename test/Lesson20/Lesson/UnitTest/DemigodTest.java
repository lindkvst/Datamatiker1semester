package Lesson20.Lesson.UnitTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemigodTest {

    @Test
    void testZeusReturnsCabin1() {
        Demigod thalia = new Demigod("Thalia","Zeus",1);
        assertEquals("Cabin 1", thalia.getCampCabin());
    }

    @Test
    void testUnderageNotElligible() {
        Demigod silena = new Demigod("Silena", "Zeus", 8);
        assertFalse(silena.isEligibleForQuest());
    }


    @Test
    void testEmptyName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Demigod("", "Poseidon", 20);
        });
    }

    @Test
    void testAthenaReturnsCabin6() {
        Demigod annabeth = new Demigod("Annabeth", "Athena", 20);
        assertEquals("Cabin 6", annabeth.getCampCabin());
    }

}