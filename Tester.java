public class Tester {
    public static void main(String [] args) {

        Phone p1 = new Phone("Channel", "Classic", 16.3, 1998, true, true, true, 'T', new String[]{"GPS", "Bluetooth"});
        Phone p2 = new Phone("Dior", "Cajial", 86.44 , 1995 , false , false , false ,'T', new String[]{" GPS ","Bluetooth"} );

        System.out.println(p1);
        System.out.println(p2);

        p1.toString();
        p2.toString();

    }
}
