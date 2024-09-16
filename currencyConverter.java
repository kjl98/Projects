import java.util.Scanner;

public class currencyConverter {
	private static final double USD_TO_EUR_RATE = 0.85;
    private static final double EUR_TO_USD_RATE = 1.18;
	private static final double IND_TO_PAK_RATE = 3.32;
	private static final double PAK_TO_IND_RATE = 0.30;
	private static final double IND_TO_AUD_RATE = 0.018;
	private static final double AUD_TO_IND_RATE = 56.34;
	private static final double IND_TO_CanadianDOLLAR_RATE = 0.016;
	private static final double CanadianDOLLAR_TO_IND_RATE = 61.85;
	private static final double IND_TO_EURO_RATE = 0.016;
	private static final double EURO_TO_IND_RATE = 92.98;
	private static final double IND_TO_BrazilianREAL_RATE = 0.067;
	private static final double BrazilianREAL_TO_IND_RATE = 14.90;
	private static final double IND_TO_JapaneseYEN_RATE = 1.68;
	private static final double JapaneseYEN_TO_IND_RATE = 0.60;
	private static final double IND_TO_SaudiRIYAL_RATE = 0.045;
	private static final double SaudiRIYAL_TO_IND_RATE = 22.35;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Currency Converter!");

        while (true) {
            // System.out.println("\nMenu:");
			System.out.println("Select one of these and convert.....");
            System.out.println("\n1. Convert USD to EUR");
            System.out.println("2. Convert EUR to USD");
			System.out.println("3. Convert IND rupee to PAK rupee");
			System.out.println("4. Convert PAK rupee to IND rupee");
			System.out.println("5. Convert IND rupee to AUD");
			System.out.println("6. Convert AUD to IND rupee");
			System.out.println("7. Convert IND rupee to CanadianDollar");
			System.out.println("8. Convert CanadianDollar to IND rupee");
			System.out.println("9. Convert IND rupee to EURO");
			System.out.println("10. Convert EURO to IND rupee");
			System.out.println("11. Convert IND rupee to BrazilianREAL");
			System.out.println("12. Convert BrazilianREAL to IND rupee");
			System.out.println("13. Convert IND rupee to JapaneseYEN");
            System.out.println("14. Convert JapaneseYEN to IND rupee");
			System.out.println("15. Convert IND rupee to SaudiRIYAL");
			System.out.println("16. Convert SaudiRIYAL to IND rupee");
            System.out.println("17. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:             convertUSDToEUR(scanner);
				break;
			    case 2:             convertEURToUSD(scanner);
				break;
				case 3:             convertINDToPAK(scanner);
				break;
				case 4:             convertPAKtoIND(scanner);
				break;
				case 5:             convertINDtoAUD(scanner);
				break;
				case 6:             convertAUDtoIND(scanner);
				break;
				case 7:             convertINDtoCanadianDollar(scanner);
				break;
				case 8:             convertCanadianDollartoIND(scanner);
				break;
				case 9:             convertINDtoEURO(scanner);
				break;
				case 10:            convertEUROtoIND(scanner);
				break;
				case 11:            convertINDtoBrazilianREAL(scanner);
				break;
				case 12:            convertBrazilianREALtoIND(scanner);
				break;
				case 13:            convertINDtoJapaneseYEN(scanner);
				break;
				case 14:            convertJapaneseYENtoIND(scanner);
				break;
				case 15:            convertINDtoSaudiRIYAL(scanner);
				break; 
			    case 16:            convertSaudiRIYAltoIND(scanner);
				break;
				case 17:
				System.out.println("Thank you for using the Currency Converter!");
				scanner.close();
				return;
			    default:
				System.out.println("Invalid choice. Please try again.");
				System.out.println();
		    }
	    }
    }
	private static void convertUSDToEUR(Scanner scanner) {
        System.out.print("Enter the amount in USD: ");
        double usdAmount = scanner.nextDouble();
        double eurAmount = usdAmount * USD_TO_EUR_RATE;
        System.out.println("Result : " + usdAmount + " USD is equivalent to " + eurAmount + " EUR");
		System.out.println();
	}

    private static void convertEURToUSD(Scanner scanner) {
        System.out.print("Enter the amount in EUR: ");
        double eurAmount = scanner.nextDouble();
        double usdAmount = eurAmount * EUR_TO_USD_RATE;
        System.out.println("Result : " + eurAmount + " EUR is equivalent to " + usdAmount + " USD");
		System.out.println();
    }

	private static void convertINDToPAK(Scanner scanner) {
        System.out.print("Enter the amount in IND rupee: ");
        double indAmount = scanner.nextDouble();
        double pakAmount = indAmount * IND_TO_PAK_RATE;
        System.out.println("Result : " + indAmount + " IND rupee is equivalent to " + pakAmount + " Rupee");
		System.out.println();
    }
    
	private static void convertPAKtoIND(Scanner scanner) {
        System.out.print("Enter the amount in PAK: ");
        double pakAmount = scanner.nextDouble();
        double indAmount = pakAmount * PAK_TO_IND_RATE;
        System.out.println("Result : " + pakAmount + " PAK rupee is equivalent to " + indAmount + " Rupee");
		System.out.println();
    }

	private static void convertINDtoAUD(Scanner scanner) {
        System.out.print("Enter the amount in IND rupee: ");
        double indAmount = scanner.nextDouble();
        double audAmount = indAmount * IND_TO_AUD_RATE;
        System.out.println("Result : " + indAmount + " IND rupee is equivalent to " + audAmount + " AUD");
		System.out.println();
    }

	private static void convertAUDtoIND(Scanner scanner) {
        System.out.print("Enter the amount in AUD: ");
        double audAmount = scanner.nextDouble();
        double indAmount = audAmount * AUD_TO_IND_RATE;
        System.out.println("Result : " + audAmount + " AUD is equivalent to " + indAmount + " Rupee");
		System.out.println();
    }

	private static void convertINDtoCanadianDollar(Scanner scanner) {
        System.out.print("Enter the amount in IND rupee: ");
        double indAmount = scanner.nextDouble();
        double canDollarAmount = indAmount * IND_TO_CanadianDOLLAR_RATE;
        System.out.println("Result : " + indAmount + " IND rupee is equivalent to " + canDollarAmount + " CanadianDollar");
		System.out.println();
    }
 
    private static void convertCanadianDollartoIND(Scanner scanner) {
        System.out.print("Enter the amount in Canadian Dollar: ");
        double canDollarAmount = scanner.nextDouble();
        double indAmount = canDollarAmount * CanadianDOLLAR_TO_IND_RATE;
        System.out.println("Result : " + canDollarAmount + " CanadianDollar is equivalent to " + indAmount + " Rupee");
		System.out.println();
    }

	private static void convertINDtoEURO(Scanner scanner) {
        System.out.print("Enter the amount in IND rupee: ");
        double indAmount = scanner.nextDouble();
        double euroAmount = indAmount * IND_TO_EURO_RATE;
        System.out.println("Result : " + indAmount + " IND rupee is equivalent to " + euroAmount + " EURO");
		System.out.println();
    }

	private static void convertEUROtoIND(Scanner scanner) {
        System.out.print("Enter the amount in EURO: ");
        double euroAmount = scanner.nextDouble();
        double indAmount = euroAmount * EURO_TO_IND_RATE;
        System.out.println("Result : " + euroAmount + " EURO is equivalent to " + indAmount + " Rupee");
		System.out.println();
    }

	private static void convertINDtoBrazilianREAL(Scanner scanner) {
        System.out.print("Enter the amount in IND rupee: ");
        double indAmount = scanner.nextDouble();
        double brazilianAmount = indAmount * IND_TO_BrazilianREAL_RATE;
        System.out.println("Result : " + indAmount + " IND rupee is equivalent to " + brazilianAmount + " BrazilianREAL");
		System.out.println();
    }

	private static void convertBrazilianREALtoIND(Scanner scanner) {
        System.out.print("Enter the amount in Brazilian REAL: ");
        double brazilianAmount = scanner.nextDouble();
        double indAmount = brazilianAmount * BrazilianREAL_TO_IND_RATE;
        System.out.println("Result : " + brazilianAmount + " BrazilianREAL is equivalent to " + indAmount + " Rupee");
		System.out.println();
    }

	private static void convertINDtoJapaneseYEN(Scanner scanner) {
        System.out.print("Enter the amount in IND rupee: ");
        double indAmount = scanner.nextDouble();
        double japaneseAmount = indAmount * IND_TO_JapaneseYEN_RATE;
        System.out.println("Result : " + indAmount + " IND rupee is equivalent to " + japaneseAmount + " Japanese YEN");
		System.out.println();
    }

	private static void convertJapaneseYENtoIND(Scanner scanner) {
        System.out.print("Enter the amount in Japanese YEN: ");
        double japaneseAmount = scanner.nextDouble();
        double indAmount = japaneseAmount * JapaneseYEN_TO_IND_RATE;
        System.out.println("Result : " + japaneseAmount + " Japanese YEN is equivalent to " + indAmount + " Rupee");
		System.out.println();
    }

	private static void convertINDtoSaudiRIYAL(Scanner scanner) {
        System.out.print("Enter the amount in IND: ");
        double indAmount = scanner.nextDouble();
        double saudiAmount = indAmount * IND_TO_SaudiRIYAL_RATE;
        System.out.println("Result : " + indAmount + " IND rupee is equivalent to " + saudiAmount + " Saudi RIYAL");
		System.out.println();
    }

	private static void convertSaudiRIYAltoIND(Scanner scanner) {
        System.out.print("Enter the amount in Saudi RIYAL: ");
        double saudiAmount = scanner.nextDouble();
        double indAmount = saudiAmount * SaudiRIYAL_TO_IND_RATE;
        System.out.println("Result : " + saudiAmount + " Saudi RIYAL is equivalent to " + indAmount + " Rupee");
		System.out.println();
    }
}

