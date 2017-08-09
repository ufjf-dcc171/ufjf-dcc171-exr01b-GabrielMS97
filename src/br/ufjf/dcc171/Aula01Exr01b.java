package br.ufjf.dcc171;

import javax.swing.JOptionPane;

public class Aula01Exr01b {

    public static void main(String[] args) {
        try {
            double x1, x2, y1, y2;
            String s1, s2, s3, s4;
            s1 = JOptionPane.showInputDialog("Informe o valor X do ponto 1: ");
            s2 = JOptionPane.showInputDialog("Informe o valor Y do ponto 1: ");

            x1 = Float.parseFloat(s1);
            y1 = Float.parseFloat(s2);

            s3 = JOptionPane.showInputDialog("Informe o valor X do ponto 2: ");
            s4 = JOptionPane.showInputDialog("Informe o valor Y do ponto 2: ");

            x2 = Float.parseFloat(s3);
            y2 = Float.parseFloat(s4);

            double d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

            JOptionPane.showMessageDialog(null, "A distância entre os pontos (" + x1 + "," + y1 + ") e (" + x2 + "," + y2 + ") é de " + d + " cm.",
                    "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(null, "Informe apenas valores numéricos! ", "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
    }

}
