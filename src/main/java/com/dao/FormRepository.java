package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.entities.Sms;
import com.entities.androidJson.AndroidForm;

//@RepositoryRestResource
public interface FormRepository extends JpaRepository<AndroidForm, Long>{
	@Query("SELECT f FROM AndroidForm f WHERE f.id = 1")
	public List<Sms> findNoActiveSms();
	
	/*@Query("update sms s set s.state =1")
	public void updateSmsState();*/
	
	/*@Query("update #{#Sms} s set s.state = :1 where u.id in :ids")
	void updateUserActiveState(@Param("ids") Integer... ids);*/
	/*@Query("SELECT s FROM Sms s WHERE s.Id = Id")
	public Sms firstSms(Long Id);
	
	@Modifying(clearAutomatically = true)
	@Query("UPDATE Sms SET state = 0 WHERE id = :id")
	public void updateSmsState( @Param("id") Long id);*/
	
}
