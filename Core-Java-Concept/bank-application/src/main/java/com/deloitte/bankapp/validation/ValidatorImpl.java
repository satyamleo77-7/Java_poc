package com.deloitte.bankapp.validation;

import java.time.LocalDate;
import java.time.Period;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.deloitte.bankapp.entity.BankAccount;

public class ValidatorImpl implements ConstraintValidator<BankValidator, BankAccount> {

	@Override
	public boolean isValid(BankAccount bankAccount, ConstraintValidatorContext context) {
		Period years = Period.between(bankAccount.getDateOfBirth(), LocalDate.now());
		if (years.getYears() > 50) {	//Max Age cap 50 years
			return false;
		} else
			return true;
	}

}
