package gerenciabib;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class GerenciaBib{       //Gerenciador da Biblioteca (Atividade)
    public static void main (String [] args){
    }

    Scanner input = new Scanner(System.in);

        public abstract class Pessoa {      //Super classe Pessoa
            private String Nome;
            private int RG;
            private int Chapa;
            private int CPF;

            public String getNome() {       //GET e SET da classe
                return this.Nome;
            }

            public void setNome(String Nome) {
                this.Nome = Nome;
            }

            public int getRG() {
                return this.RG;
            }

            public void setRG(int RG) {
                this.RG = RG;
            }

            public int getChapa() {
                return this.Chapa;
            }

            public void setChapa(int Chapa) {
                this.Chapa = Chapa;
            }

            public int getCPF() {
                return this.CPF;
            }

            public void setCPF(int CPF) {
                this.CPF = CPF;
            }

            public Pessoa (String Nome, int RG, int Chapa, int CPF) {       //"Construct da classe"
                this.Nome = null;
                this.RG = 0;
                this.Chapa = 0;
                this.CPF = 0;
            }
        }
    
        public class Funcionario{       //Subclasse normal com GET e SET
            private String Nome;
            private int RG;
            private int Chapa;
            private int CPF;

            public String getNome (){
                return this.Nome;
            }

            public void setNome(String Nome){
                this.Nome = Nome;
            }

            public int getRG(){
                return this.RG;
            }

            public void setRG(int RG){
                this.RG = RG;
            }

            public int getChapa(){
                return this.Chapa;
            }

            public void setChapa(int Chapa){
                this.Chapa = Chapa;
            }

            public int getCPF(){
                return this.CPF;
            }

            public void setCPF(int CPF){
                this.CPF = CPF;
            }
        }

            public class Usuario{
            private String Nome;
            private int RG;
            private int Chapa;
            private int CPF;

            public String getNome (){
                return this.Nome;
            }

            public void setNome(String Nome){
                this.Nome = Nome;
            }

            public int getRG(){
                return this.RG;
            }

            public void setRG(int RG){
                this.RG = RG;
            }

            public int getChapa(){
                return this.Chapa;
            }

            public void setChapa(int Chapa){
                this.Chapa = Chapa;
            }

            public int getCPF(){
                return this.CPF;
            }

            public void setCPF(int CPF){
                this.CPF = CPF;
            }
       }

        public abstract class Midia {
           private String NomeLivro;
           private String NomeDVD;
           private String Autor;
           private String Genero;

           public String getNomeLivro(){
               return this.NomeLivro;
           }

           public void setNomeLivro(String NomeLivro){
               this.NomeLivro = NomeLivro;
           }

           public String getNomeDVD(){
               return this.NomeDVD;
           }

           public void setNomeDVD(String NomeDVD){
               this.NomeDVD = NomeDVD;
           }

           public String getAutor(){
               return this.Autor;
           }

           public void setAutor(String Autor){
               this.Autor = Autor;
           }

           public String getGenero(){
               return this.Genero;
           }

           public void setGenero(String Genero){
               this.Genero = Genero;
           }
       
           public Midia (String NomeLivro, String NomeDVD, String Autor, String Genero) {
               this.NomeDVD = null;
               this.NomeLivro = null;
               this.Autor = null;
               this.Genero = null;
           }
        }

    public class Livro{
            private String NomeLivro;
            private String Autor;
            private String Genero;

            public String getNomeLivro(){
                return this.NomeLivro;
            }

            public void setNomeLivro(String NomeLivro){
                this.NomeLivro = NomeLivro;
            }

            public String getAutor(){
                return this.Autor;
            }

            public void setAutor(String Autor){
                this.Autor = Autor;
            }

            public String getGenero(){
                return this.Genero;
            }

            public void setGenero(String Genero){
                this.Genero = Genero;
            }
        } 
    
        public class DVD{
            private String NomeDVD;
            private String Autor;
            private String Genero;

            public String getNomeDVD(){
                return this.NomeDVD;
            }

            public void setNomeDVD(String NomeDVD){
                this.NomeDVD = NomeDVD;
            }

            public String getAutor(){
                return this.Autor;
            }

            public void setAutor(String Autor){
                this.Autor = Autor;
            }

            public String getGenero(){
                return this.Genero;
            }

            public void setGenero(String Genero){
                this.Genero = Genero;
            }
        }
        public abstract class Emprestimo{
            private String Nome;
            private String NomeLivro;
            private String Autor;
            private int CPF;
            
            public String getNome(){
                return this.Nome;
            }

            public void setNome(final String Nome){
                this.Nome = Nome;
            }

            public String getNomeLivro(){
                return this.NomeLivro;
            }

            public void setNomeLivro(final String NomeLivro){
                this.NomeLivro = NomeLivro;
            }

            public String getAutor(){
                return this.Autor;
            }

            public void setAutor(final String Autor){
                this.Autor = Autor;
            }

            public int getCPF(){
                return this.CPF;
            }

            public void setCPF(final int CPF){
                this.CPF = CPF;
            }
        
        public Emprestimo(final String Nome, final String NomeLivro, final String Autor, final int CPF){
            this.Nome = null;
            this.NomeLivro = null;
            this.Autor = null;
            this.CPF = 0;
            }
        }

        public class Data{
        public String Date(){
            return new SimpleDateFormat("DD/MM/YYYY").format(new Data(0, 0));
            }

             private int DataEmp;
             private int DataDev;

             public int getDataEmp(){
             return this.DataEmp;
             }

             public void setDataEmp(final int DataEmp){
             this.DataEmp = DataEmp;
             }

             public int getDataDev(){
             return this.DataDev;
             }

             public void setDataDev(final int DataDev){
             this.DataDev = DataDev;
             }

             public Data(final int DataEmp, final int DataDev){
             this.DataEmp = 0;
             this.DataDev = 0;
             }
        }    
}
