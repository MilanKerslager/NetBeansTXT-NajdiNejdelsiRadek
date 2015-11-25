// naděte v souboru nejdelší řádek

package nejdelsiradek;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NejdelsiRadek {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("d:/pokus.txt"));
            String radek;
            int číslořádku = 0;
            // aby i první řádek délky nula byl zaznamenán, použijeme MIN_VALUE
            int početpísmennejdelšího = Integer.MIN_VALUE;
            int číslonejdelšíhořádku = 0;   // ve smyčce je v ní číslo načteného řádku
            String obsahnejdelšíhořádku = "";
            // smyčka postupně načte všechny řádky souboru
            while ((radek = br.readLine()) != null) {
                číslořádku++;
                if (početpísmennejdelšího<radek.length()) {
                    početpísmennejdelšího = radek.length();
                    číslonejdelšíhořádku = číslořádku;
                    obsahnejdelšíhořádku = radek;
                }
            }
            br.close();
            System.out.println("Nejdelší byl řádek číslo "+číslonejdelšíhořádku);
            System.out.println("Nejdelší řádek obsahoval tento text:");
            System.out.println(obsahnejdelšíhořádku);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NejdelsiRadek.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NejdelsiRadek.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
