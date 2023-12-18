using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;

namespace PetitJeu
{
    internal class Client
    {
        public IPAddress trouverIp()
        {
            string host = Dns.GetHostName();
            string ip = Dns.GetHostByName(host).AddressList[0].ToString();
            IPAddress monIp = IPAddress.Parse(ip);
            return monIp;
        }
    }
}
