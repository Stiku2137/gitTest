package files;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) throws IOException {

        File file = new File("text.txt");
        if(file.createNewFile()) {
            System.out.println("Stworzylem nowy plik");
        } else {
            System.out.println("Plik już istnieje");
        }


    }


}
