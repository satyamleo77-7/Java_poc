package com.deloitte.bankapp.mapstruct;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.deloitte.bankapp.entity.BankAccount;
import com.deloitte.bankapp.model.PersonDetails;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PersonMapper {
	PersonMapper INSTANCE = Mappers.getMapper( PersonMapper.class ); 
	 
    @Mapping(source = "personName", target = "accountHolder")
    BankAccount personToBankAccount(PersonDetails personDetails);
}
