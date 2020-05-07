package cdk;

public enum CustomerTypeDiscount {

	Regular {
		@Override
		public double getDiscountedPriceForCustomer(double amount) {
			double discount = 0;
			if (amount >= 10000) {
				discount = (20 * (amount - 10000) / 100) + (10 * 5000 / 100);
			} else if (amount > 5000 && amount <= 10000) {
				discount = (10 * amount / 100);
			}
			return amount-discount;
		}

	},

	Premium {
		@Override
		public double getDiscountedPriceForCustomer(double amount) {
			double discount = 0;
			if (amount >= 12000) {
				discount = (30 * (amount - 12000) / 100) + (20 * 4000 / 100) + (15 * 4000 / 100) + (10 * 4000 / 100);
			} else if (amount > 8000 && amount <= 12000) {
				discount = (20 * amount / 100) + (15 * 4000 / 100) + (10 * 4000 / 100);
			} else if (amount > 4000 && amount <= 8000) {
				discount = (15 * (amount - 4000) / 100) + (10 * 4000 / 100);
			} else if (amount > 0 && amount <= 4000) {
				discount = (10 * amount / 100);
			}
			return amount-discount;
		}
	};

	public static boolean isValidCustomer(String customerType) {
		boolean isValid = false;
		for (CustomerTypeDiscount cust : CustomerTypeDiscount.values()) {
			if (customerType.equals(cust.name())) {
				isValid = true;
			}
		}
		return isValid;
	}

	public abstract double getDiscountedPriceForCustomer(double amount);
}
