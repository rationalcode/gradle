package stc.inno;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class MainTest {

    @Test
    @Disabled
    void main() {
        assertDoesNotThrow(Main::new);
    }

}