public class comissionEmployee {
   //private fields
private string firstName;
private string lastName ;
private string socialSecurityNumber;
private double grossSale;
private double comissionRate;
// constructor

public comissionEmployee(string firstName, string lastName, string socialSecurityNumber, double grossale, double comissionRate){
   this.firstName = firstName;
   this.lastName = lastName;
   setGrossSales(grosSales);
   setCommissionRate(commissionRate);
}
// getters and setters
public string getFirstName() {
return firstName;
}
public string getlastName(){
   return lastName;
}
public string getsocialsecurityNumber(){
   return socialSecurityNumber;
}
public double getgrossale(){
   return grossSale;
}
public double getcommissionRate(){
   return comissionRate;
}

public void setCommissionRate(double commissionRate) {
   if (commissionRate < 0.0 || commissionRate > 1.0) {
       throw new IllegalArgumentException("Commission rate must be between 0.0 and 1.0");
   }
   this.commissionRate = commissionRate;
}

// Method to calculate earnings
public double earnings() {
   return grossSales * commissionRate;
}

// toString method to display employee details
@Override
public String toString() {
   return String.format("Commission Employee: %s %s%nSocial Security Number: %s%nGross Sales: %.2f%nCommission Rate: %.2f",
           firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
}

// Main method to test the CommissionEmployee class
public static void main(String[] args) {
   try {
       // Create a CommissionEmployee object
       CommissionEmployee employee = new CommissionEmployee("John", "Doe", "123-45-6789", 10000.0, 0.1);
       // Display the employee's details
       System.out.println(employee);

       // Update the employee's grossSales and commissionRate
       employee.setGrossSales(15000.0);
       employee.setCommissionRate(0.15);
       // Display the updated details
       System.out.println("Updated Employee Details:");
       System.out.println(employee);

       // Calculate and display the employee's earnings
       System.out.printf("Earnings: %.2f%n", employee.earnings());

       // Test validation by trying to set invalid values
       employee.setGrossSales(-5000.0); // This should throw an exception
   } catch (IllegalArgumentException e) {
       System.out.println("Error: " + e.getMessage());
   
      
    
      
   

}

}

}




    
