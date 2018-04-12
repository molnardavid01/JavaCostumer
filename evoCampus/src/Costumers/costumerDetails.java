package Costumers;

public class costumerDetails {
	
	public abstract class costumerDetails {
	

		public Costumers(string name) {
			this.name = name;
		}

		public string getName() {
			return this.name;
		}
		
		public Costumers(int tax) {
			this.tax = tax;
		}
		
		public int getTax() {
			return this.tax;
		}
		
		public Costumers(int postCode) {
			this.postCode = postCode;
		}
		
		public int getPostCode() {
			return this.postCode;
		}
		
		public Costumers(string email) {
			this.email = email;
		}
		
		public string getEmail() {
			return this.email;
		}

		public Costumers(int shopNumber) {
			this.shopNumber = shopNumber;
		}
		
		public int getShopNumber() {
			return this.shopNumber;
		}


		public boolean getRegularCostumer() {
			if (this.shopNumber() > 100)
				return true;

			return false;
		}
	}

}
