using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;

namespace NombreAleatoire
{
    internal class joueur
    {
        string nom;
        Boolean aTrouve;

        public string GetIPAddress()
        {
            IPHostEntry Host = default(IPHostEntry);
            string Hostname = null;
            Hostname = System.Environment.MachineName;
            Host = Dns.GetHostEntry(Hostname);
            string monIp = "";
            foreach (IPAddress IP in Host.AddressList)
            {
                if (IP.AddressFamily == System.Net.Sockets.AddressFamily.InterNetwork)
                {
                    monIp = Convert.ToString(IP);
                }
            }
            return monIp;
        }

        public int partie()
        {
            int nbEssais = 0;
            Random r = new Random();
            int nbAlea = r.Next(1, 20);
            string nb1;
            int nb2;
            do
            {
                Console.WriteLine("Entrer un nombre aléatoire entre 1 et 20.");
                nb1 = Console.ReadLine();
                nb2 = Int32.Parse(nb1);
                if (nb2 == nbAlea)
                {
                    aTrouve = true;
                    Console.WriteLine("Vous avez trouvé.");
                    nbEssais++;
                }
                else
                {
                    nbEssais++;
                    Console.WriteLine("Réessayez, vous vous êtes trompés");
                }

            } while (aTrouve == false);

            return nbEssais;
        }
    }
}