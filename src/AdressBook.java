import java.util.HashMap;
import java.util.Scanner;

public class AdressBook {

    HashMap<String,String> myContacts;

    /**
     * Constructor vacio
     */
    public void adressBook(){

    }

    /**
     * Guarda los datos en el atributo de mis contactos
     * @param hashToSave hashmap de control
     */
    public void save(HashMap<String,String> hashToSave){
        myContacts = hashToSave;
        System.out.println("Se guardó exitosamente");
    }

    /**
     * Se encarga de cargar los datos del hashmap de la clase al hashmap de control
     * @param hashToSave hashmap de control
     */
    public void load(HashMap<String,String> hashToSave){
        hashToSave = myContacts;
        System.out.println("Se cargó exitosamente");

    }

    /**
     * Se encarga de mostrar los contactos con telefonos
     */
    public void list(){

        System.out.println("Contactos:");
        for (HashMap.Entry<String, String> entry : myContacts.entrySet()) {
            System.out.println("{"+entry.getKey()+"}"+" : "+"{"+entry.getValue()+"}");
        }

    }

    /**
     * Crea un contacto nuevo
     * @param hashToCreate hashmap de control
     */
    public  void create(HashMap<String, String> hashToCreate){
        Scanner sc = new Scanner(System.in);
        String phone;
        String contact;
        System.out.print("inserta el nombre del contacto:");
        contact = sc.nextLine();
        System.out.print("inserta el telefono del contacto:");
        phone = sc.nextLine();
        hashToCreate.put(contact,phone);
        System.out.println("Se creo exitosamente");
    }

    /**
     * Se encarga de eliminar un contacto por su telefono
     */
    public void delete(){
        Scanner sc = new Scanner(System.in);
        String phone;
        System.out.print("Inserta el número de telefono del contacto que quieres eliminar:");
        phone = sc.nextLine();
        myContacts.remove(phone);
        System.out.println("Se elimino exitosamente");
    }

}
