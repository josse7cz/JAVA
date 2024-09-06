import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mesiac
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		// Požiada používateľa o zadanie čísla mesiaca
		System.out.println("Zadajte číslo mesiaca (1-12): ");
		boolean validMonth = false;

		while (!validMonth)
		{
			try
			{
				int month = Integer.parseInt(scanner.nextLine().trim());

				String[] mesiace = { "Neplatné číslo měsíce.", // index 0, ale měsíce začínají od 1
					"Leden", "Únor", "Březen", "Duben", "Květen", "Červen", "Červenec", "Srpen", "Září", "Říjen",
					"Listopad", "Prosinec" };

				if (month < 1 || month > 12)
				{
					System.out.println(mesiace[0]);
				}
				else
				{
					validMonth=true;
					System.out.println(mesiace[month]);
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println("Prosím, zadejte platné číslo.");
			}
		}

		scanner.close();
	}
}
