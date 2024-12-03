public class Companies {
    public int id;
    public String name;
    public String address;
    public String zip;
    public String country;
    public String employeeCount;
    public String industry;
    public String marketCap;
    public String domain;
    public String logo;
    public String ceoName;

    @Override
    public String toString() {
        return "id: " + this.id + "\n" + "name: " + this.name + "\n" +
                "address: " + this.address + "\n" + "zip: " + this.zip + "\n" +
                "country: " + this.country + "\n" + "employeeCount: " + this.employeeCount +
                "\n" + "Industry: " + this.industry + "\n" + "MarketCap: " + this.marketCap +
                "\n" + "Domain: " + this.domain + "\n" + "Logo: " + this.logo + "\n" +
                "CeoName: " + this.ceoName;

    }
}
