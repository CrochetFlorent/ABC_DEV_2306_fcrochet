namespace Demarrage
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");

            for (int i = 0; i < 10; i++)
            {
                if (i == 0)
                {
                    Console.WriteLine("J'affiche i pour la première fois.Entrez quelquechose!");
                    string str = Console.ReadLine();
                    Console.WriteLine(str);
                }
                else
                {
                    Console.WriteLine("J'affiche i pour la " +(i + 1)+ "ieme fois.");
                }           
            }
        }
    }
}