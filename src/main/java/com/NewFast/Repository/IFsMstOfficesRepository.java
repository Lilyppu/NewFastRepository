package com.NewFast.Repository;
import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.NewFast.Models.FsMstCompany;
import com.NewFast.Models.FsMstOffices;

public interface IFsMstOfficesRepository extends JpaRepository<FsMstOffices,String>{
	
	public Optional<FsMstOffices> findByFmofCode(String off);

}
