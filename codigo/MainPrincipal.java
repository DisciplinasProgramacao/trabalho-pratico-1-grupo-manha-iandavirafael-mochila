public class MainPrincipal {

    public static void main(String args[]) {

   long tempoExecucao =0;
   int capacidade=200;
  
     int quantItems=5; 
   ItemMochila[] item = new ItemMochila[quantItems];
   mochila m = new mochila(capacidade);  
   int tam;

   
            //instanciando
            for (int i = 0; i < item.length; i++) {
                item[i] = new ItemMochila();
            }


    

    //Letra A
   while(tempoExecucao<4000){
      
    System.out.println(" mochila com capacidade :" + capacidade + " e :" + quantItems + " itens");
    tempoExecucao = System.currentTimeMillis(); 
   

    item=UtilLs.geraVetor(quantItems, false, capacidade);
    tam = item.length;
  
    System.out.println(ForcaBruta.forcaBruta(capacidade, item, tam));
    


    tempoExecucao = (System.currentTimeMillis() - tempoExecucao);
    System.out.println("tempo em milisegundos =" + tempoExecucao);
    quantItems++;
   } 
    
     System.out.println("LETRA B");
     for (int i = 0; i < 500; i++) {
         
      // System.out.println("Forca Bruta");
         item=UtilLs.geraVetor((quantItems-1), false, capacidade);//com essa qtd 34
         //fazendo o forca Bruta
         tam=item.length;
         System.out.println(ForcaBruta.forcaBruta(capacidade, item, tam));
        
         //fazendo o guloso
         //System.out.println("guloso");
      //UtilLs.bolhaInvertido(item);
       UtilLs.quicksort(item, 0, tam-1); 
      for (int index = 0; index < item.length; index++) {
      m.adicionar(item[index]);
      }
      System.out.println(m.getValorAtual());
      

     }
   }   
}
