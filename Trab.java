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
    
