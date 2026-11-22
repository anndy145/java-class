import java.util.*;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    int calculateSalary() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {
    int monthlyPayment;

    FullTimeEmployee(String name, int monthlyPayment) {
        super(name);
        this.monthlyPayment = monthlyPayment;
    }

    @Override
    int calculateSalary() {
        return monthlyPayment;
    }
}

class PartTimeEmployee extends Employee {
    int hour;
    int pay;

    PartTimeEmployee(String name, int pay, int hour) {
        super(name);
        this.pay = pay;
        this.hour = hour;
    }

    @Override
    int calculateSalary() {
        return pay * hour;
    }
}

public class Employee_Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = input.nextInt();
        input.nextLine(); // 清除換行符號
        Employee[] employees = new Employee[total];

        for (int i = 0; i < total; i++) {
            char FP = input.next().charAt(0);
            if (FP == 'F') {
                String name = input.next();
                int monthlyPayment = input.nextInt();
                new FullTimeEmployee(name, monthlyPayment);

                employees[i] = new FullTimeEmployee(name, monthlyPayment);
            } else if (FP == 'P') {
                String name = input.next();
                int pay = input.nextInt(); // 時薪
                int hour = input.nextInt(); // 工時

                new PartTimeEmployee(name, pay, hour);
                employees[i] = new PartTimeEmployee(name, hour, pay);
            }
        }

        for (Employee employee : employees) {
            System.out.println(employee.name + " " + employee.calculateSalary());
        }

        input.close();
    }
}