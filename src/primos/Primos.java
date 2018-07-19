package primos;

public class Primos {

    public static void main(String[] args) {
        int contadorDefinitivo = 0;
        for(int i=1000000; i<i+1; i++){
            if(primo(i) == true){
                String numero = Integer.toString(i);
                int suma = 0;
                for(int j=0; j<numero.length(); j++){
                    suma = suma + Integer.parseInt(numero.substring(j,j+1));
                }
                if(primo(suma) == true){                    
                    contadorDefinitivo++;
                    System.out.print(i);
                    if(contadorDefinitivo == 2){
                        break;
                    }
                }                
            }
        }
    }
    public static boolean primo(int num){
        int valor = 0;
        for(int i=2; i<num; i++){
            if((num % i) == 0){
                valor = 1;
                break;
            }
        }
        if(valor == 1){
            return false;
        }
        else{
            return true;            
        }            
    }
}
