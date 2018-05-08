package intfq1;

public class Main {

	public static void main(String[] args) {
		HasColor hc = new HasColor() {
			
			@Override
			public int getColor() {
				return 0;
			}
		};
		HasSmell hs = new HasSmell() {
			
			@Override
			public int getSmell() {
				return 0;
			}
		};
		HasColorAndSmell hcs = new HasColorAndSmell() {
			
			@Override
			public int getSmell() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getColor() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}

}
