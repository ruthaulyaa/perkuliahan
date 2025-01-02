//if-else-if statement
//IfElse.java
class IfElse {
	public static void main(String[] args){
		int month = 4; //April
		String season;
		//
		switch (month){
			case 12:
			case 1:
			case 2:
				season = "Winter";
				break;
			case 3:
			case 4:
			case 5:
				season = "Spring";
				break;
			case 6:
			case 7:
			case 8:
				season = "Summer";
				break;
			case 9:
			case 10:
			case 11:
				season = "Autumn";
				break;
			default:
				season = "Bogus Month";
		}		
		System.out.println("April is the " + season + ".");		
	}	
}