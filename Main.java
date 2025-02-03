// PARTNER NAME: Tyler Oakes
// PARTNER NAME:
// CS111 SECTION #: 3003	
// DATE: 02/02/25

public class Main
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		//Complete fields
		String surname, givenName, category, cardNum, birthCountry, termAndConditions;
		char sex;
		
		//parts of fields
		String birthMonth;
		int uscisNum1, uscisNum2, uscisNum3, birthDay, birthYear, validDay, validMonth, validYear, expireMonth, 
			expireDay, expireYear;


		surname = "TYLER OAKES";
		givenName = "TYLER";
		category = "CAT14";
		cardNum = "EXE14082022";
		birthCountry = "United States";
		termAndConditions = "NA";
		sex = 'M';

		birthMonth = "JUL";
		uscisNum1 = 987;
		uscisNum2 = 654;
		uscisNum3 = 321;
		birthDay = 22;
		birthYear = 1995;
		validDay = 2;
		validMonth = 2;
		validYear = 2025;
		expireDay = 31;
		expireMonth = 12;
		expireYear = 2026;

		//INPUT SECTION
		//NA
		//CALCULATION SECTION
		// NA

		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════");
		System.out.println("║         UNITED STATES OF AMERICA");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD");
		System.out.println("║                       Surname");
		System.out.println("║                       " + surname + " ");
		System.out.println("║  .----.    .----.     Given Name");
		System.out.println("║ (   ^  \\  /  ^   )    " + givenName +" ");
		System.out.println("║        |  |           USCIS#         Category   Card#");
		System.out.println("║       _/  \\_          " + uscisNum1 + "-" + uscisNum2 + "-" + uscisNum3 + "    " + category + "      " + cardNum + " ");
		System.out.println("║      (_    _)         Country of Birth");
		System.out.println("║   ,    `--`    ,      " + birthCountry + " ");
		System.out.println("║   \\'-.______.-'/      Terms and Conditions");
		System.out.println("║    \\          /       " + termAndConditions + " ");
		System.out.println("║     '.--..--.'        Date of Birth   Sex");
		System.out.println("║       `\"\"\"\"\"`         " + birthDay + " " + birthMonth + " " + birthYear + "     " + sex + " ");
		System.out.println("║                       Valid From:     " + validMonth + "/" + validDay + "/" + validYear + " ");
		System.out.println("║                       Card Expires:   " + expireMonth + "/" + expireDay + "/" + expireYear + " ");
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.");
		System.out.println("╚══════════════════════════════════════════════════════════════════════");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}