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
