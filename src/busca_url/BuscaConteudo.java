/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busca_url;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author WalterKerber
 */
public class BuscaConteudo
{

    static ArrayList<String> links = new ArrayList();
    static boolean procurandoLinks = true;
    static int paginasBuscadas = 30;
    static String urlInicial = "http://www.globo.com/";
    static String palavraBuscada = "lula";

    public static void obtemPagina(URL url, File file) throws IOException
    {
        BufferedWriter out;
        try (BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream())))
        {
            out = new BufferedWriter(new FileWriter(file));
            String inputLine;
            while ((inputLine = in.readLine()) != null)
            {
                if (inputLine.contains(palavraBuscada))
                {
//                    System.out.println("Arquivo com a palavra encontrada: " + url.getFile());
//                    System.out.println("Site: " + url.getAuthority());
//                    System.out.println("URL: " + url.toString());
//                    System.out.println(inputLine + "\n");

                    out.write("Palavra Buscada: " +palavraBuscada);
                    out.newLine();
                    out.write("Site: " + url.getAuthority());
                    out.newLine();
                    out.write("URL: " + url.toString());
                    out.newLine();
                    out.write("Arquivo com a palavra encontrada: " + url.getFile());
                    out.newLine();
                    out.write(inputLine + "\n");
                    out.newLine();
                    out.newLine();
                    out.newLine();

                    out.flush();
                }
                if (inputLine.contains("href=\"") && procurandoLinks == true)
                {
                    int inicio = inputLine.indexOf("href=\"");
                    int fim = inputLine.lastIndexOf("\"");
                    String temp = inputLine.substring(inicio, fim);
                    String link = "";

                    Pattern pattern = Pattern.compile("(http|https)://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?");
                    // Conteúdo da linha a ser carrida
                    Matcher matcher = pattern.matcher(temp);

                    if (matcher.find())
                    {
                        link = matcher.group();
                    }
                    if (!link.isEmpty() && !links.contains(link))
                    {
                        links.add(link);
                    }
                }
            }
        }
        out.close();
    }

    public static void configuraBusca()
    {
        URL url = null;
        File file = null;
        Random r = new Random();

        links.add(urlInicial);

        try
        {
            url = new URL(links.get(0));
            file = new File("C:\\Users\\WalterKerber\\Documents\\Teste.txt");
            obtemPagina(url, file);

            for (int i = 0; i < links.size(); i++)
            {
                url = new URL(links.get(i));
                obtemPagina(url, file);
            }
        } catch (MalformedURLException e)
        {
            System.out.println("Erro MalformedURLException: " + e);
        } catch (IOException e)
        {
            System.out.println("Erro IOException: " + e);
        }
    }

    public static void main(String[] args)
    {
        configuraBusca();
    }
}
