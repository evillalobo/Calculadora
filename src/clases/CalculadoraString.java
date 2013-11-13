package clases;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edu
 */
public class CalculadoraString {
    
    public int add(String entradaSuma)
    {
        int resultado=0;
        String numeros[];
        String textoSinSalto = entradaSuma.replaceAll("[\n]",",");  
        
        if(textoSinSalto.contains(","))
        {
            //System.out.println(textoSinSalto);
            if(textoSinSalto.contains("-"));
            {
                System.out.println(Negativos(textoSinSalto));
            }
            if(textoSinSalto.contains("//;"))
            {
                //Delimitadores
            }
            numeros=textoSinSalto.split(",");
            
            for(int i=0;i<numeros.length;i++)
            {
                if(Integer.parseInt(numeros[i])<1000)
                {
                resultado=Integer.parseInt(numeros[i])+resultado;
                }
            }
            return resultado;
        }
        else
        {
            if(entradaSuma.equals(""))
            {
                return 1;
            }
            else
            {
                resultado=Integer.parseInt(entradaSuma);
                return resultado;
            }
        }

    }
    public String Negativos(String entradaNegativo)
    {
        System.out.println("Negativos no soportados");
        return entradaNegativo;
    }
    
}
