using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Sockets;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace PetitJeu
{
    internal class Serveur
    {
        public IPAddress IPServeur;

        public IPAddress trouverIp()
        {
            string host = Dns.GetHostName();
            string ip = Dns.GetHostByName(host).AddressList[0].ToString();
            IPAddress monIp = IPAddress.Parse(ip);
            return monIp;
        }

        public void listen(IPAddress monIp)
        {
            Socket ServerSocket = new Socket(AddressFamily.InterNetwork,
            SocketType.Stream,
            ProtocolType.Tcp);
            try
            {
                //On lie la socket au point de communication
                ServerSocket.Bind(new IPEndPoint(monIp, 8000));
                //On la positionne en mode "écoute"
                ServerSocket.Listen(10);
                //Démarrage du thread avant la première connexion client
                Thread getReadClients = new Thread(new ThreadStart(getRead));
                getReadClients.Start();
                //Démarrage du thread vérifiant l'état des connexions clientes
                Thread pingPongThread = new Thread(new ThreadStart(CheckIfStillConnected));
                pingPongThread.Start();
                //Boucle infinie
                while (true)
                {
                    Console.WriteLine("Attente d'une nouvelle connexion...");
                    //L'exécution du thread courant est bloquée jusqu'à ce qu'un
                    //nouveau client se connecte
                    CurrentClient = ServerSocket.Accept();
                    Console.WriteLine("Nouveau client:" + CurrentClient.GetHashCode());
                    //Stockage de la ressource dans l'arraylist acceptlist
                    acceptList.Add(CurrentClient);
                }
            }
            catch (SocketException E)
            {
                Console.WriteLine(E.Message);
            }
        }
    }
}
