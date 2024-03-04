using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label6_Click(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            String name1 = textBox1.Text;
            String email1 = textBox2.Text;
            String mobile1 = textBox3.Text;
            String password1 = textBox4.Text;

            label12.Text = name1;
            label13.Text = email1;
            label14.Text = mobile1;
            label15.Text = password1;
        }
    }
}
