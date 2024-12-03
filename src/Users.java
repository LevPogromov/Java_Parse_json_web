public class Users {
    public int id;
    public String name;
    public String email;
    public String company;
    public String username;
    public String address;
    public String zip;
    public String state;
    public String country;
    public String phone;
    public String photo;

        @Override
        public String toString() {
            return "id: " + this.id + "\n" + "name: " + this.name + "\n" +
                    "username: " + this.username + "\n" + "company: " + this.company + "\n" +
                    "email: " + this.email + "\n" + "address: " + this.address + "\n" + "zip:"
                    + this.zip + "\n" + "state: " + this.state + "\n" + "country: " + this.country + "\n" +
                    "phone: " + this.phone;


    }
}
