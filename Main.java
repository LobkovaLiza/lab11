import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Напишите ваш айпи адрес"); //000.000.000.000
        Scanner in = new Scanner(System.in);
        String ip = in.next();
        Pattern pattern = Pattern.compile("\\b\\d\\d\\d\\.\\d\\d\\d\\.\\d\\d\\d\\.\\d\\d\\d");
        Matcher a = pattern.matcher(ip);
        if(a.find()){
            System.out.println("Отлично, теперь я приду к тебе домой ночью по адресу " + a.group());
        }
        else{
            System.out.println("Введите нормально!");
        }
    }
}
