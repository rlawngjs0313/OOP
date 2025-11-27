import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.exit;

public class Homework9 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("src/db.txt"));
        Map<String, String> map = new HashMap<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            String[] idPassword = line.split(":");
            map.put(idPassword[0], idPassword[1]);
        }

        while (true){
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");

            String id = scanner2.nextLine();

            if (!map.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            System.out.print("password : ");
            String password = scanner2.nextLine();

            if (!map.get(id).equals(password)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            System.out.println("id와 비밀번호가 일치합니다.");
            exit(0);
        }
    }
}