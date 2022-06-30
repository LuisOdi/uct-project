package pe.edu.upc.uct.business.crud.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.uct.business.crud.PaymentService;
import pe.edu.upc.uct.model.entity.Payment;
import pe.edu.upc.uct.model.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService{
	@Autowired
	private PaymentRepository paymentRepository;
	
	@Override
	public JpaRepository<Payment, Integer> getJpaRepository() {
		return this.paymentRepository;
	}
}
