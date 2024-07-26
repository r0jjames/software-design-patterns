package behavioral_patterns.command;

import behavioral_patterns.command.fx.Command;

public class AddCustomerCommand implements Command {

    private final CustomerService customerService;

    public AddCustomerCommand(CustomerService customerService) {

        this.customerService = customerService;
    }
    @Override
    public void execute() {
        this.customerService.addCustomer();
    }
}
