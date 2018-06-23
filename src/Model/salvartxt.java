package Model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class salvartxt {

    private String user;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String Salvar() {

        try {
            FileWriter fw = new FileWriter("dadosVetor.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.printf(this.user);
            pw.flush();
            pw.close();
            fw.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        return null;
    }

    public String SalvarUser(String sArquivo) {

        try {
            FileWriter fw = new FileWriter(sArquivo + ".txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.printf(this.user);
            pw.flush();
            pw.close();
            fw.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        return null;
    }
    public String SalvarJogos(String sArquivo) {

        try {
            FileWriter fw = new FileWriter(sArquivo + "Jogos.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.printf(this.user);
            pw.flush();
            pw.close();
            fw.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        return null;
    }
    public String SalvarErros(String sArquivo) {

        try {
            FileWriter fw = new FileWriter(sArquivo + "Erros.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.printf(this.user);
            pw.flush();
            pw.close();
            fw.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        return null;
    }
    public String SalvarAcertos(String sArquivo) {

        try {
            FileWriter fw = new FileWriter(sArquivo + "Acertos.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.printf(this.user);
            pw.flush();
            pw.close();
            fw.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        return null;
    }

}
