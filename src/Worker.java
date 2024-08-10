public class Worker {

    private String firstName;
    private String lastName;


    public void repair(Vehicle vehicle)
    {
        System.out.println(firstName +" " + lastName + "repairs: " +vehicle.getMark() + " " + vehicle.getModel());
    }
}
