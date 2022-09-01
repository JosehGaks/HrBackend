package com.example.hrBackend;

import com.example.hrBackend.domain.model.Benefit;
import com.example.hrBackend.domain.model.Department;
import com.example.hrBackend.domain.model.Employee;
import com.example.hrBackend.domain.repo.BenefitRepository;
import com.example.hrBackend.domain.repo.DepartmentRepository;
import com.example.hrBackend.domain.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Set;

@SpringBootApplication
public class HrBackendApplication implements CommandLineRunner {

	@Autowired
	private BenefitRepository benefitRepository;

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(HrBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Department department1 = new Department("full-stack");
		Department department2 = new Department("marketing");
		Department department3 = new Department("sales");
		Department department4 = new Department("finance");

		departmentRepository.saveAll(List.of(department1,department2,department3,department4));

		Benefit benefit1 = new Benefit("Retirement and pension plan contributions");
		Benefit benefit2 = new Benefit("Paid vacations");
		Benefit benefit3 = new Benefit("Free meals");
		Benefit benefit4 = new Benefit("Use of a company car");

		benefitRepository.saveAll(Set.of(benefit1,benefit2,benefit3,benefit4));

		Employee employee1 = new Employee("Michael","Simon","johnson@gmail.com",department1, Set.of(benefit1,benefit2));
		Employee employee2 = new Employee("Mark","Joseph","mark@gmail.com",department3, Set.of(benefit1,benefit3));
		Employee employee3 = new Employee("Luke","Lama","lama@gmail.com",department2, Set.of(benefit4,benefit2));
		Employee employee4 = new Employee("John","Hamed","john@gmail.com",department4, Set.of(benefit3,benefit4));
		Employee employee5 = new Employee("Paul","Johnson","paul@gmail.com",department1, Set.of(benefit2,benefit3));

		employeeRepository.saveAll(List.of(employee1,employee2,employee3,employee4,employee5));
	}
}
