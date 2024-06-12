//Coder name: Abdullah Fouzi Naji
//Coder ID: 22012364


class Customer {
    private String name;
    private String address;

    // Default constructor
    public Customer() {
        this.name = "";
        this.address = "";
    }

    // Parameterized constructor
    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
