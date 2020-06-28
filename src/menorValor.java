/* 
 * Exercício
 * Ask the user 10 numbers and insert them into an array of integer and show the lowest value inserted by user.
 * Fonte: https://www.guj.com.br/t/maior-e-menor-valor-resolvido/91031
 * https://js.do/
 * <script>

document.write("<b>Qual é o menor?</b><br><br>");
document.write("A segunte lista de valores aleatórios foi gerada automaticamente:<br>");

var lista = [];

for(i=0; i<10;i++){
	lista[i] = Math.round(Math.random()*10);
    document.write("- " + lista[i] + "<br>");
}

var menor = lista[0];

for (i=0; i<lista.length; i++){
	if(lista[i] < menor){
    	menor = lista[i];
    }
}

document.write("<br><b>O menor número da lista é o \"" + menor + "\" !!!</b><br><br>");

</script>
 * 
 * 	
 */

import java.util.Scanner;

public class menorValor {
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int valor[] = new int[10];
		
			System.out.print("Digite  "+valor.length+" valore(s): ");
			for(int i = 0; i < valor.length; i++){
			valor[i] = sc.nextInt();
			}
			int min=valor[0];
			for(int i = 0; i < valor.length; i++){
				if(min > valor[i] ) {
					min = valor[i]; 
				}
			}
			System.out.println("The minimum value is: "+ min);
		}
	}





