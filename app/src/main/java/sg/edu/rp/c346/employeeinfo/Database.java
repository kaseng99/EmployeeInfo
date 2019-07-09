package sg.edu.rp.c346.employeeinfo;



public class Database {
private String name;
private String title;
private String salary;

    public Database(String name, String title, String salary) {
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }


}
