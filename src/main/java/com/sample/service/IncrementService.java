package com.sample.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dao.Num;
import com.sample.dao.NumRepository;
import com.sample.exception.NoValueException;

/**
 * Represents service which is used for processing controller's requests 
 * 
 */
@Service
public class IncrementService {

	/**
	 * Represents repository of number objects
	 * 
	 */
	@Autowired
	private NumRepository numbers;

	/**
	 * method to increment the only record-value of number table by 1 
	 * @throws NoValueException
	 *  
	 */
	public synchronized String updateValue(int id) throws NoValueException{
		Optional<Num> foundNum=numbers.findById(id);
		if(!foundNum.isPresent()){
			throw new NoValueException();
		}else{
				Num currentNumber =foundNum.get();
				System.out.println("curValue="+currentNumber.getValue());
				currentNumber.setValue(currentNumber.getValue()+1);
				return "Record Updated\n"+numbers.save(currentNumber).toString();
			
		}
	}




}
