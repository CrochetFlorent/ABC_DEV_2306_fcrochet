package Boucles_Imbriquées;

public class App {

	public static void main(String[] args) {

		int i = 0;
		int j = 0;

		externe: while (i < 2) // Boucle externe
		{
			interne: while (j >= 0) // Boucle interne
			{
				System.out.print (i);
				System.out.print (" , ");
				System.out.println (j);
				j++;

				if (j > 2)
				{
					break externe;
				}
			}
			i++;
			j = 0;
		}

		

	}

}
