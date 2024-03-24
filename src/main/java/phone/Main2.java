package phone;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class Main2 {

    public static void main(String[] args) throws IOException {
        Main2 main2 = new Main2();
        main2.saveBooks();
    }

    public void saveBooks() throws IOException {
        String fileName = Objects.requireNonNull(getClass().getClassLoader().getResource("dummy.json")).getFile();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            StringBuilder stringBuilder = new StringBuilder();
            String readLine = "";
            while (readLine != null) {
                readLine = reader.readLine();
                if (readLine != null)
                    stringBuilder.append(readLine).append("\n");
            }
        }
        // json 을 변환하여 저장할 것
    }

    public String getNumber(String name) {
        return null;
    }

    public List<String> getNumbers(String name) {
        return null;
    }


    public List<String> getNumbers() {
        return null;
    }

}
