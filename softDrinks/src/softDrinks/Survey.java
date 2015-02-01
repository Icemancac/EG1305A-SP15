package softDrinks;
//OK. Ozgur Aktunc
public class Survey {
	public static void main(String[] args) 
	{
		int surveyed = 12467;
		double oneOrMore = .14*surveyed;
		double preferCitrus = oneOrMore*.64;
		
		System.out.printf("About %.0f out of %d people purchase one or more energy drinks a week.", oneOrMore,surveyed);
		System.out.printf("\nAbout %.0f of those people prefer citrus flavored drinks.", preferCitrus);
	}
}
