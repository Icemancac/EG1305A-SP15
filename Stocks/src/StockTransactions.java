//OK. Ozgur Aktunc

public class StockTransactions
{
	public static void main(String[] args) 
	{
		int shares = 1000;
		double brokerFees = 0;
		double totalCosts = 0;
		double stockPrice = 32.87;
		final double COMMISSION_RATE = 0.02;
		double buyPrice = shares*stockPrice;
		double sellPrice ;
		double commission = buyPrice*COMMISSION_RATE;
		System.out.printf("Joe bought %d shares of stock at $%.2f a stock. This cost him $%.2f" ,shares,stockPrice,buyPrice);
		System.out.printf("\nJoe paid his broker $%.2f to buy %d shares of the stock",commission,shares );
		brokerFees = brokerFees + commission;
		totalCosts = buyPrice;
		stockPrice = 33.92;
		sellPrice = shares*stockPrice;
		System.out.printf("\nJoe sold %d shares of stock at $%.2f a stock. This made him $%.2f",shares,stockPrice,sellPrice);
		commission = sellPrice * COMMISSION_RATE;
		brokerFees = brokerFees + commission;
		totalCosts = totalCosts + brokerFees;
		System.out.printf("\nJoe paid his broker $%.2f to sell %d shares of the stock",commission,shares);
		System.out.printf("\nIn total, Joe paid his broker $%.2f",brokerFees);
		System.out.printf("\nJoe made $%.2f selling the stock.",(sellPrice-buyPrice));
		System.out.printf("\nAfter Brokerage fees, Joe actually profited $%.2f" ,((sellPrice-buyPrice)-brokerFees));
	}
}
