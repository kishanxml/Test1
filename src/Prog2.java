
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Owner
 */
public class Prog2 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        args = new String[]{"Café@Chaud.tôt"};
        String tempstr = "";
        String utfstr = "";
        String splchar = "";
        String finalstr = "";
//caf+3?C3A9@chaud.tt+1?C3B4~éô
        for (String s : args) {
            int i = 0;
            //System.out.print(s.toLowerCase().toCharArray());
            for (char x : s.toLowerCase().toCharArray()) {

                if (x == '@') {
                    finalstr += tempstr + utfstr + '@';
                    utfstr = "";
                    tempstr = "";
                } else if ((int) x >= 33 && x <= 126) {
                    tempstr += x;
                } else {
                    String temps = "";
                    for (Byte b : (x + "").getBytes("UTF-8")) {
                        temps += String.format("%02X", b);
                    }
                    utfstr += "+" + i + "?" + temps;
                    splchar += x;
                }
                i++;
            }
            finalstr += tempstr + utfstr + "~" + splchar + System.lineSeparator();
            utfstr = "";
            tempstr = "";
            splchar= "";
        }
        System.out.print(finalstr);

    }
}
