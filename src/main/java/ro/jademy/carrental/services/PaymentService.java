package ro.jademy.carrental.services;

import ro.jademy.carrental.model.PaymentDetails;

public interface PaymentService {

    public boolean validatePayment (PaymentDetails paymentDetails);

}
