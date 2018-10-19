package Interacao;

import java.util.Calendar;
import java.util.Scanner;

import BubbleSort.Bubble;
import InsertionSort.Insertion;
import QuickSort.Quick;

public class Menu {
	
	@SuppressWarnings("static-access")
	public static void main(String [] args){
		DadosInternos dadosInternos = new DadosInternos();
		LendoExcel dadosExternos = new LendoExcel();
		Bubble bubble = new Bubble();
		Quick quick = new Quick();
		Insertion insertion = new Insertion();
		Scanner leTeclado = new Scanner(System.in);
		int sair = 1;		
		
		do{ 
			
			System.out.println("Escolha qual algoritmo deseja analisar:");
			System.out.println("1 - BubbleSort");
			System.out.println("2 - QuickSort");
			System.out.println("3 - InsertionSort");
			System.out.println("Digite 'Sair' para encerrar o programa!");
			String escolha = leTeclado.nextLine();

			switch(escolha){
				case "1":
					long tempoInicialb = System.currentTimeMillis();
					
					String horaI = hora();
					System.out.println(horaI);
					
					int[] veBubble = dadosExternos.capturaExcel();
					int[] viBubble = dadosInternos.random();

					bubble.bubbleSort(veBubble);
					bubble.bubbleSort(viBubble);
					
					long tempoFinalb = System.currentTimeMillis();
					System.out.println("----------------------------------------------------------------");
					System.out.println("Tempo de execucao do BubbleSort: " + (tempoFinalb - tempoInicialb) + "ms.");
					System.out.println("----------------------------------------------------------------");
					
					String horaF = hora();
					System.out.println(horaF);
					System.out.println();
					
					for(int i = 0; i < viBubble.length; i++){
						if(i%10 == 0){
							System.out.println("");	
						}else{
							if(i < 10){
								System.out.print("000" + i + " - " + viBubble[i] + " | ");
							}else if(i < 100){
								System.out.print("00" + i + " - " + viBubble[i] + " | ");
							}else if(i < 1000){
								System.out.print("0" + i + " - " + viBubble[i] + " | ");
							}else if(i < 10000){
								System.out.print(+ i + " - " + viBubble[i] + " | ");
							}
						}
					}
					System.out.println("\n");
					break;
				
				case "2":
					long tempoInicialq = System.currentTimeMillis();

					horaI = hora();
					System.out.println(horaI);
					
					int[] veQuick = dadosExternos.capturaExcel();
					int[] viQuick = dadosInternos.random();
	
					
					quick.quickSort(veQuick, 0, veQuick.length-1);
					quick.quickSort(viQuick, 0, viQuick.length-1);
					
					long tempoFinalq = System.currentTimeMillis();
					System.out.println("----------------------------------------------------------------");
					System.out.println("Tempo de execucao do QuickSort: " + (tempoFinalq - tempoInicialq) + "ms.");
					System.out.println("----------------------------------------------------------------");
					
					horaF = hora();
					System.out.println(horaF);
					
					System.out.println();
					
					for(int i = 0; i < viQuick.length; i++){
						if(i%10 == 0){
							System.out.println("");	
						}else{
							if(i < 10){
								System.out.print("000" + i + " - " + viQuick[i] + " | ");
							}else if(i < 100){
								System.out.print("00" + i + " - " + viQuick[i] + " | ");
							}else if(i < 1000){
								System.out.print("0" + i + " - " + viQuick[i] + " | ");
							}else if(i < 10000){
								System.out.print(+ i + " - " + viQuick[i] + " | ");
							}
						}
					}
					System.out.println("\n");
					break;
					
				case "3":
					long tempoIniciali = System.currentTimeMillis();
					
					horaI = hora();
					System.out.println(horaI);
					int[] veInsertion = dadosExternos.capturaExcel();
					int[] viInsertion = dadosInternos.random();
					
					insertion.interstionSort(veInsertion);
					insertion.interstionSort(viInsertion);
					
					long tempoFinali = System.currentTimeMillis();
					System.out.println("----------------------------------------------------------------");
					System.out.println("Tempo de execucao do InsertionSort: " + (tempoFinali - tempoIniciali) + "ms.");
					System.out.println("----------------------------------------------------------------");
					
					horaF = hora();
					System.out.println(horaF);
					
					System.out.println();
					
					for(int i = 0; i < viInsertion.length; i++){
						if(i%10 == 0){
							System.out.println("");	
						}else{
							if(i < 10){
								System.out.print("000" + i + " - " + viInsertion[i] + " | ");
							}else if(i < 100){
								System.out.print("00" + i + " - " + viInsertion[i] + " | ");
							}else if(i < 1000){
								System.out.print("0" + i + " - " + viInsertion[i] + " | ");
							}else if(i < 10000){
								System.out.print(+ i + " - " + viInsertion[i] + " | ");
							}
						}
					}
					System.out.println("\n");
					break;
					
				case "Sair":
					case "sair":
						sair = 0;
						System.exit(0);
						
				default: System.out.println("Por favor selecione uma das opcoes acima!");
					
			}
		}while(sair == 1);
		
		leTeclado.close(); 
	}
	
	public static String hora(){
		Calendar data = Calendar.getInstance();
		
		int hora = data.get(Calendar.HOUR_OF_DAY); 
		int min = data.get(Calendar.MINUTE);
		int seg = data.get(Calendar.SECOND);
		int miliseg = data.get(Calendar.MILLISECOND);
		
		return (hora + "h " +min+ "min " +seg+ "seg " +miliseg+ "ms");
	}
}
