package cdk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CustomerTypeDiscountTest {
	CustomerTypeDiscount regularCust = CustomerTypeDiscount.Regular;
	CustomerTypeDiscount premiumCust = CustomerTypeDiscount.Premium;

	@Test
	public void testRegularCustomerDiscounts() {
		assertEquals(regularCust.getDiscountedPriceForCustomer(5000),5000,0);
		assertEquals(regularCust.getDiscountedPriceForCustomer(10000),9500,0);
		assertEquals(regularCust.getDiscountedPriceForCustomer(15000),13500,0);
	}
	
	@Test
	public void testPremiumCustomerDiscounts() {
		assertEquals(premiumCust.getDiscountedPriceForCustomer(4000),3600,0);
		assertEquals(premiumCust.getDiscountedPriceForCustomer(8000),7000,0);
		assertEquals(premiumCust.getDiscountedPriceForCustomer(12000),10200,0);
		assertEquals(premiumCust.getDiscountedPriceForCustomer(20000),15800,0);
	}
	
}
