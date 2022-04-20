package lib.info;

import java.util.Calendar;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Date;
import lib.TaxFunction;

public class Salary {
	private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;
    private Employee info;
	    
    public Salary(int otherMontlyIncome, int annualDeductible) {
        this.annualDeductible = annualDeductible;
        this.setOtherMonthlyIncome(otherMontlyIncome);
    }

    public int getMonthlyIncome() {
        return monthlySalary;
    } 
    public int getOtherMonthlyIncome() {
        return otherMonthlyIncome;
    }
    public int getAnnualDeductible() {
        return annualDeductible;
    }
    public void setMonthlyIncome(int monthlyIncome) {
        this.monthlySalary = monthlySalary;
    }
    public void setOtherMonthlyIncome(int otherMonthlyIncome) {
        this.otherMonthlyIncome = otherMonthlyIncome;
    }
    public void setAnnualDeductible(int deductible) {
        this.annualDeductible = deductible;
    }
	
    public int getAnnualIncomeTax() {
		
		LocalDate date = LocalDate.now();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(info.joinedDate);

		if (date.getYear() == calendar.get(Calendar.YEAR)) {
			info.monthWorkingInYear = date.getMonthValue() - calendar.get(Calendar.MONTH);
		}else {
			info.monthWorkingInYear = 12;
		}
		
		return TaxFunction.calculateTax(monthlySalary, otherMonthlyIncome, info.monthWorkingInYear, annualDeductible, spouseIdNumber.equals(""), childIdNumbers.size());
	}

    public void setMonthlySalary(int grade) {	
		if (grade == 1) {
			monthlySalary = 3000000;
			if (info.isForeigner) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}else if (grade == 2) {
			monthlySalary = 5000000;
			if (info.isForeigner) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}else if (grade == 3) {
			monthlySalary = 7000000;
			if (info.isForeigner) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}
	}
}
