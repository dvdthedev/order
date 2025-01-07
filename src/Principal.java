import model.Order;
import model.OrderItem;
import model.Product;
import model.User;
import model.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        Order order;

        System.out.print("Birth date (DD/MM/YYYY): ");

        String dataInput = sc.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        Date data = dateFormat.parse(dataInput);

        User user = new User(name, email, data);
        System.out.println(user);
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.nextLine().toUpperCase();
        OrderStatus orderStatus = OrderStatus.valueOf(status);
        System.out.print("How many items to this order? ");
        int quantity = sc.nextInt();
        sc.nextLine();
        int i = 0;

        while (quantity > i){
            int exibitionNumber = i + 1;
            System.out.println("Enter #" + exibitionNumber  + " item data: ");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            sc.nextLine();
            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();
            sc.nextLine();
            order = new Order(orderStatus);
            order.addItem(new OrderItem(productQuantity, productPrice, new Product(productName, productPrice)));
            i++;
            System.out.println(order);
        };

    }
}
