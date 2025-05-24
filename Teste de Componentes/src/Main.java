import entities.Employee;
import services.PensionService;
import services.SalaryService;
import services.TaxService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nome");
        String name = sc.nextLine();
        System.out.println("Salário Bruto:");
        double grossSalary = sc.nextDouble();
        Employee employee = new Employee(name, grossSalary);
        TaxService taxService = new TaxService();
        PensionService pensionService = new PensionService();
        SalaryService salaryService = new SalaryService(taxService, pensionService);

        double netSalary = salaryService.netSalary(employee);
        System.out.printf("Salário Líquido: %.2f", netSalary);
    }
}