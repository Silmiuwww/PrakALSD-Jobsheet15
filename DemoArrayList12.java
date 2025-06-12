import java.util.ArrayList;
import java.util.Collections;
public class DemoArrayList12 {

    public static void main(String[] args) {
        ArrayList<Customer12> customers = new ArrayList<>(2);

        Customer12 customer1 = new Customer12(1, "Zakia");
        Customer12 customer2  = new Customer12(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        customers.add(new Customer12(4, "Cica"));

        customers.add(new Customer12(100, "Rosa"));

        System.out.println(customers.indexOf(customer2));
        
        Customer12 customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";

        ArrayList<Customer12> newCustomers = new  ArrayList<>();
        newCustomers.add(new Customer12(201, "Della"));
        newCustomers.add(new Customer12(202, "Victor"));
        newCustomers.add(new Customer12(203, "Sarah"));

        customers.addAll(newCustomers);

        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");
        Collections.sort(daftarSiswa);

        System.out.println(daftarSiswa);

        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));
        System.out.println(customers);

        for (Customer12 cust : customers) {
            System.out.println(cust.toString());
        }

        System.out.println(customers);
    }
}