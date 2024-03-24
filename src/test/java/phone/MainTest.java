package phone;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void 전화번호부의_번호가_저장된다 () {
        Main main = new Main();
        // given
        String name = "NHN";
        String number = "01012341234";
        main.saveBook(name, number);
        // when
        String findNumber = main.getNumber(name);
        // then
        assertEquals(number, findNumber);
    }

    @Test
    void 전화번호부에_동일한_이름이_들어가게되면_가장_마지막에_넣은_번호가_먼저_나온다 () {
        // given
        Main main = new Main();
        String name = "NHN";
        String number = "01012341234";
        String number2 = "01011111111";
        // when
        main.saveBook(name, number);
        main.saveBook(name, number2);
        String findNumber = main.getNumber(name);
        // then
        assertEquals(number2, findNumber);

    }

    @Test
    void 전화번호부에_동일한_이름이_들어가게_되면_순서대로_번호가_저장된다 () {
        // given
        Main main = new Main();
        String name = "NHN";
        String number = "01012341234";
        String number2 = "01011111111";
        // when
        main.saveBook(name, number);
        main.saveBook(name, number2);
        // then
        List<String> numbers = main.getNumbers(name);
        assertEquals(number, numbers.get(0));
        assertEquals(number2, numbers.get(1));
    }

    @Test
    void 전화번호가_전부_다_저장되었는지_확인() {
        Main main = new Main();
        main.saveBook("111","1234");
        main.saveBook("222","124124");
        main.saveBook("5555","124124");
        main.saveBook("6666","1235234453");
        main.saveBook("111","12342314");
        List<String> numbers = main.getNumbers();
        assertEquals(5, numbers.size());
    }

}