package aula16;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class TestListing
{
    public static void main(String[] args)
    {
        File diretorio = new File("src\\lista2");
        File[] arquivos = diretorio.listFiles();
        List<File> fl = new ArrayList();
        fl.addAll(Arrays.asList(arquivos));

        ListingRedux linha = new ListingRedux();
        Date data;
        for (int i = 0; i < fl.size(); i++)
        {
            data = new Date(linha.sortByDate(fl).get(i).lastModified());
            System.out.println(" Nome: " + linha.sortByDate(fl).get(i).getName() + " || Data: " + data);
        }
        System.out.println("");
        for (int i = 0; i < fl.size(); i++)
        {
            System.out.println(" Nome: " + linha.sortBySize(fl).get(i).getName() + " || Tamanho: " + linha.sortBySize(fl).get(i).length() + " bytes. ");
        }
    }
}
