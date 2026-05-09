public class MyDistance {
    public static void main(String[] args) {
        Distance d1 = new Distance(5,7);
        Distance d2 = new Distance(7,9);
        Distance d3 = new Distance();
        d3 = d1.addDistance(d2);
        d1.displayDistance();
        d2.displayDistance();
        System.out.println("After addition of D1 and D2 : ");
        d3.displayDistance();
        // Additional test cases
//        Distance d4 = new Distance(3, 11);
//        Distance d5 = new Distance(2, 10);
//        d4.addDistance(d5).displayDistance();  // Method chaining
    }
}
class Distance{
    private int feet;
    private int inches;
    public Distance(){
        this.feet = 0;
        this.inches = 0;
    }
    public Distance(int feet, int inches){
        this.feet = feet;
        this.inches = inches;
    }
    public int getFeet() {
        return feet;
    }

    public int getInches(){
        return inches;
    }
    public void setFeet(int feet){
        this.feet = feet;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }
        public Distance addDistance(Distance d) {
            Distance add = new Distance();

            // Add inches and handle carry-over to feet
            int totalInches = this.inches + d.inches;
            add.inches = totalInches % 12;  // Remainder becomes inches
            int carryFeet = totalInches / 12;  // Quotient becomes additional feet add.feet += totalInches/12;

            // Add feet including the carry-over
            add.feet = this.feet + d.feet + carryFeet;// add.feet += this.feet + d.feet;

            return add;
            // Create new Distance object which will normalize automatically
            //        return new Distance(totalFeet, totalInches);
        }
    public void displayDistance(){
        System.out.println("Feet : "+this.feet+" Inches : "+this.inches);
    }
}