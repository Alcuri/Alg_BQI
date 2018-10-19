package Interacao;

public class Criacao_Dados {
	public static void main (String [] args){
		int[] vetor = new int[50];
		int i = 0;
		
		for(i = 0; i < vetor.length; i++){
			vetor[i] = (int) (Math.random()*1000);
		}
		
		for(i = 0; i < vetor.length; i++){
			if(i%10 == 0){
				System.out.println();
			}else System.out.print(vetor[i] + ", ");
		}
	}
}
