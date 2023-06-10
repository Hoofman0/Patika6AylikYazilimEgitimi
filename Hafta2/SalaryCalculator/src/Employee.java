public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(double salary) {
        if (salary <= 1000) {
            return 0;
        }
        return salary * 0.03;
    }

    int bonus(int workHours) {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        }
        return 0;
    }

    double raiseSalary(int hireYear) {
        if (2021 - hireYear < 10) {
            return salary * 0.05;
        } else if ((2021 - hireYear > 9) && (2021 - hireYear < 20)) {
            return salary * 0.1;
        } else {
            return salary * 0.15;
        }
    }

    void print() {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Çalışma Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax(salary));
        System.out.println("Bonus : " + bonus(workHours));
        System.out.println("Maaş Artışı : " + raiseSalary(hireYear));
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (salary - tax(salary) + bonus(workHours)));
        System.out.println("Toplam Maaş : " + (salary - tax(salary) + bonus(workHours) + raiseSalary(hireYear)));
    }
}
