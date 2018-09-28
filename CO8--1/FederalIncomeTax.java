public class FederalIncomeTax {

int Status;

double Income;

double Tax;

java.util.Date federalIncomeTaxDate;

public FederalIncomeTax( int Status, double Income, double Tax) {

this.Status = Status;

this.Income = Income;

this.Tax = Tax;

}

public double getStatus() { // retunr status

return Status;

}

public void setStatus (int Status){ //set an new status

this.Status = Status;

}

public double getIncome(){ //retunr income;

return Income;

}

public void SetIncome (double Income){ //set a new icnome

this.Income = Income;

}

public double getTotalTax(){

if (Status == 0) { // Compute tax for single filers

if (Income <= 8350)

Tax = Income * 0.10;

else if (Income <= 33950)

Tax = 8350 * 0.10 + (Income - 8350) * 0.15;

else if (Income <= 82250)

Tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +

(Income - 33950) * 0.25;

else if (Income <= 171550)

Tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +

(82250 - 33950) * 0.25 + (Income - 82250) * 0.28;

else if (Income <= 372950)

Tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +

(82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +

(Income - 171550) * 0.33;

else

Tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +

(82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +

(372950 - 171550) * 0.33 + (Income - 372950) * 0.35;

}

else if (Status == 1) { // Compute tax for married file jointly

// Left as exercise

}

else if (Status == 2) { // Compute tax for married separately

// Left as exercise

}

else if (Status == 3) { // Compute tax for head of household

// Left as exercise

}

else {

System.out.println("Error: invalid status");

//System.exit(1);

}

return Tax; //java ask me to add

}

public java.util.Date getFederalIncomeTaxDate(){

return federalIncomeTaxDate;

}

}
