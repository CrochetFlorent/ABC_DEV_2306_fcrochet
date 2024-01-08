using Moq;

namespace Barnabe
{
    public class testMock
    {
        exercice exo;
        public testMock(exercice _exo)
        {
            this.exo = _exo;
        }
    }

    public class exercice
    {
        public double Barnabe(double somme)
        {
            int nbMagasins = 0;
            if (somme > 1)
            {
                while (somme / 2 - 1 >= 2)
                {
                    somme = somme / 2 - 1;
                    nbMagasins += 1;
                }
            }
            else if (somme > 1 && somme < 2)
            {
                somme = 0;
                nbMagasins += 1;
            }

            return nbMagasins;
        }
    }
    internal class Program
    {   


        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");

            var barnabeMock = new Mock<exercice>();
            barnabeMock.Setup(b => b.Barnabe(100));

            testMock test = new testMock(barnabeMock.Object);
            test.Equals(100);

            barnabeMock.Verify(v => v.Barnabe(It.IsAny<int>()));

        }
    }
}