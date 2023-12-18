using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Net.Sockets;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace PetitJeu
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        private TcpClient server = new TcpClient();
        Serveur leServeur = new Serveur();
        Joueur moi = new Joueur();

        public Form1()
        {
            InitializeComponent();
        }

        private void TrouverMonIp_Click(object sender, EventArgs e)
        {
            string ipAddress = leServeur.IPServeur.ToString();
            textBoxMonIp.Text = ipAddress;

        }

        private void Jouer_Click(object sender, EventArgs e)
        {
            moi.nom = textBoxPseudo.Text;

        }

        private void checkBoxServeur_CheckedChanged(object sender, EventArgs e)
        {
            moi.statut = 1;
            checkBoxClient.Checked = false;
            if (textBoxSonIp.Visible == false && labelSonIp.Visible == false)
            {
                textBoxSonIp.Visible = true;
                labelSonIp.Visible = true;
            }
            else
            {
                labelSonIp.Visible = false;
                textBoxSonIp.Visible = false;
            }
        }

        private void checkClient_CheckedChanged(object sender, EventArgs e)
        {
            moi.statut = 2;
            checkBoxServeur.Checked = false;
        }
    }
}
