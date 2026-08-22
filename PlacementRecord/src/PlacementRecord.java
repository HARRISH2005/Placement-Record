class PlacementRecord {
    String name, company;
    double pack;
    PlacementRecord(String n, String c, double p) {
        name = n;
        company = c;
        pack = p;
    }
    void printRecord() {
        System.out.println(name + " -> " + company + " @ " + pack + " LPA");
    }
    public static void main(String[] args) {
        PlacementRecord a = new PlacementRecord("Ravi", "TCS", 4.5);
        PlacementRecord b = new PlacementRecord("Anitha", "Zoho", 6.2);
        PlacementRecord c = new PlacementRecord("Karthik", "Infosys", 4.0);
        a.printRecord();
        b.printRecord();
        c.printRecord();
    }
}