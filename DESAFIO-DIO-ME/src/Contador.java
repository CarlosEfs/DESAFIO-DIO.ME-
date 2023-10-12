import java.util.Scanner;

public class Contador {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu primeiro número: ");
        int numero1 = leitor.nextInt();
        System.out.println("Digite o seu segundo número: ");
        int numero2 = leitor.nextInt();

        try{
           
            contar(numero1, numero2);
        
        }catch (ParametrosInvalidosExceptions e){
            
            System.out.println("O Segundo parametro deve ser maior que a primeira");
        }



    }
    static void contar(int numero1, int numero2) throws ParametrosInvalidosExceptions{
          if(numero1 > numero2){
            throw new ParametrosInvalidosExceptions();
          }
            int contagem =  numero2 -  numero1;
            for(int i = contagem; i >= 0; i--){
                System.out.println(i);
            }

    } 
}
    


