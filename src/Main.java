import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> controlHashMap = new HashMap<>();
        AdressBook myAdressBook = new AdressBook();

        Scanner sc = new Scanner(System.in);

        String controlContact = "";
        String controlPhone ="";

        boolean isTrue = true;
        int control;

        System.out.println("Libro de contactos");
        System.out.println("Lista de de acciones");
        System.out.println("1.- load\n2.- save\n3.- list\n4.- create\n5.- delete\n6.- exit");

        do{
            System.out.print("Inserta una acción:");
            control = sc.nextInt();
            switch (control){
                case 1:
                    myAdressBook.load(controlHashMap);
                    break;
                case 2:
                    myAdressBook.save(controlHashMap);
                    break;
                case 3:
                    myAdressBook.list();
                    break;
                case 4:
                    myAdressBook.create(controlHashMap);
                    break;
                case 5:
                    myAdressBook.delete();
                    break;
                case 6:
                    isTrue = false;
                    break;
                default:
                    System.out.println("inserta números del 1 al 6 solamente");
            }
        }while(isTrue);
    }
}