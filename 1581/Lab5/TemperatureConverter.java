import java.util.Scanner;

	public class TemperatureConverter {

		public static void main (String[] args) {

			Scanner scan = new Scanner (System.in);

			int choice;
			float temp = 0;

			do {
				System.out.println ("Select from the menu:");
				System.out.println ("1. Convert from Fahrenheit to Celsius.");
				System.out.println ("2. Convert from Celsius to Fahrenheit.");
				System.out.println ("3. Quit.");
				System.out.print ("Your choice: ");
				choice = scan.nextInt ();

				switch (choice) {

					case 1:
						System.out.print ("Enter a Fahrenheit temperature: ");
						temp = scan.nextFloat ();
						float newTemp = TemperatureConverter.convertToCelsius (temp);
						System.out.println ("The temperature in Celsius is " + newTemp + ".");
						break;

					case 2:
						System.out.print ("Enter a Celsius temperature: ");
						temp = scan.nextFloat ();
						float neuTemp = TemperatureConverter.convertToFahrenheit (temp);
						System.out.println ("The temperature in Fahrenheit is " + neuTemp + ".");
						break;
				}

			} while (choice != 3);

			if (choice == 3)
				System.out.println ("Thank you and goodbye.");

		}

		public static float convertToCelsius (float temp) {

			float cTemp = (temp - 32) * 5/9;
			return cTemp;

		}

		public static float convertToFahrenheit (float temp) {

			float fTemp = (temp * 9/5) + 32;
			return fTemp;

		}

}

		
