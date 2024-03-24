package phone;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Main2Test {

    @Test
    void 저장이_잘_되었는지_확인 () throws IOException {
        // given
        Main2 main = new Main2();
        main.saveBooks();
        // when
        List<String> numbers = main.getNumbers("kimbumsoo");
        // then
        assertEquals(3, numbers.size());
    }

    @Test
    void 저장이_순서대로_잘_되었는지_확인 () throws IOException {
        // given
        Main2 main = new Main2();
        main.saveBooks();
        // when
        List<String> numbers = main.getNumbers("kimbumsoo");
        // then
        assertEquals("01012341234", numbers.get(1));
    }
    
    @Test
    void 전체적으로_저장이_잘_되었는지_확인 () throws IOException {
        // given
        Main2 main = new Main2();
        main.saveBooks();
        // when
        List<String> numbers = main.getNumbers();
        // then
        assertEquals(7, numbers.size());
    }
    
}