public class Main {
    public static void main(String[] args) {

        Vehicle veh = new Vehicle("Volskwagen","golf",24000,"EKL563126FG8");

        String print = veh.print();

        System.out.println(print);

        Vehicle veh2 = new Vehicle();
        veh2.setMark("Toyota");
        veh2.setModel("Supra");
        veh2.setPrice(65000);
        veh2.setLicense_number("EKLXSA29FG4");
        print = veh2.print();
        System.out.println(print);


    }
}