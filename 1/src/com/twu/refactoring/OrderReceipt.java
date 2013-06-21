package com.twu.refactoring;

/**
 * OrderReceipt prints the details of order including customer name, address, description, quantity,
 * price and amount. It also calculates the sales tax @ 10% and prints as part
 * of order. It computes the total order amount (amount of individual lineItems +
 * total sales tax) and prints it.
 * 
 */
public class OrderReceipt {
    private Order order;

    public OrderReceipt(Order order) {
        this.order = order;
	}

	public String printReceipt() {
		StringBuilder output = new StringBuilder();

		output.append("======Printing Orders======\n");

        output.append(order.toString());

		double totalSalesTax = 0d;
		double total = 0d;
		for (LineItem lineItem : o.getLineItems()) {
			output.append(lineItem.toString());
			// calculate sales tax @ rate of 10%
            double salesTax = lineItem.totalAmount() * .10;
            totalSalesTax += salesTax;

            // calculate total amount of lineItem = price * quantity + 10 % sales tax
            total += lineItem.totalAmount() + salesTax;
		}

		// prints the state tax
		output.append("Sales Tax").append('\t').append(totalSalesTax);

        // print total amount
		output.append("Total Amount").append('\t').append(total);
		return output.toString();
	}
}
