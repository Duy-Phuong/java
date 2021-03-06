package hibernate;
// Generated Apr 2, 2018 10:09:38 AM by Hibernate Tools 4.3.1



/**
 * Employee generated by hbm2java
 */
public class Employee  implements java.io.Serializable {


     private Integer id;
     private Address address;
     private String firstName;
     private String lastName;
     private Integer salary;

    public Employee() {
    }

	
    public Employee(String fname, String lname, int salary, Address address) {
        this.firstName = fname;
        this.lastName = lname;
        this.salary = salary;
        this.address = address;
    }
    
    public Employee(Address address) {
        this.address = address;
    }
    public Employee(Address address, String firstName, String lastName, Integer salary) {
       this.address = address;
       this.firstName = firstName;
       this.lastName = lastName;
       this.salary = salary;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Address getAddress() {
        return this.address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Integer getSalary() {
        return this.salary;
    }
    
    public void setSalary(Integer salary) {
        this.salary = salary;
    }




}


