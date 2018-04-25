
public class Payment 
{
	private double tax;
	private double gratuity;
	private double subtotal;
	private double total;
	private String paymentType;
	private final double TAX_PERCENT = 0.08;
	
	public Payment(Order finalOrder, double tip)
	{
		calculateSubtotal(finalOrder);
		calculateTax();
		calculateGratuity(tip);
		calculateTotal();
	}
	
	public void calculateSubtotal(Order finalOrder)
	{
		subtotal = 0;//finalOrder.getPrice();
	}
	
	public double getSubtotal() 
	{
		return subtotal;
	}
	
	public void calculateTax()
	{
		 tax = subtotal*TAX_PERCENT;
	}
	
	public double getTax()
	{
		return tax;
	}
	
	public void calculateGratuity(double tip)
	{
		gratuity = tip;
	}
	
	public double getGratuity()
	{
		return gratuity;
	}
	
	public void calculateTotal()
	{
		total += subtotal+tax+gratuity;
	}
	
	public double getTotal()
	{
		return total;
	}
	
	public void getPaymentType(String type)
	{
		paymentType = type;
	}
	
	public String toString()
	{
		return "Subtotal: "+subtotal+"\nTax: "+tax+"\nGratuity: "+gratuity+"\nTotal: "+total;
	}
}
