import java.io.FileWriter; // Для работы с файлами импортируем
import java.io.IOException;

public class work_with_files {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("file.txt", true)) {
            fw.write("line 1");
            fw.append("\n");
            fw.append("2");
            fw.append("\n");
            fw.write("line 2");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
