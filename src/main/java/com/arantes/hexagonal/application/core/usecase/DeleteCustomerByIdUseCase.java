package com.arantes.hexagonal.application.core.usecase;

import com.arantes.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.arantes.hexagonal.application.ports.out.DeleteCustomerByIdInputPort;

public class DeleteCustomerByIdUseCase {
    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    private final DeleteCustomerByIdInputPort deleteCustomerByIdInputPort;
    public DeleteCustomerByIdUseCase(FindCustomerByIdInputPort findCustomerByIdInputPort, DeleteCustomerByIdInputPort deleteCustomerByIdInputPort) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.deleteCustomerByIdInputPort = deleteCustomerByIdInputPort;
    }
    public void delete(String id){
        findCustomerByIdInputPort.find(id);
        deleteCustomerByIdInputPort.delete(id);
    }
}
