package Interacao;

import java.util.Calendar;

import BubbleSort.Bubble;
import InsertionSort.Insertion;
import QuickSort.Quick;

public class Menu_SemInteracao {
	@SuppressWarnings("static-access")
	public static void main(String [] args){
		
		//Instanciando objetos
		DadosInternos dadosInternos = new DadosInternos();
		LendoExcel dadosExternos = new LendoExcel();
		Bubble bubble = new Bubble();
		Quick quick = new Quick();
		Insertion insertion = new Insertion();
		String horaI = hora();
		String horaF = hora();
		

		horaI = hora(); //Guardando a hora inicial do sistema
		
		
		//Calculando tempo para BubbleSort
		
		//Vetor excel
		long tiBve = System.currentTimeMillis();
			int[] veBubble = dadosExternos.capturaExcel();
			bubble.bubbleSort(veBubble);
		long tfBve = System.currentTimeMillis();
		
		//Vetor interno
		long tiBvi = System.currentTimeMillis();
			int[] viBubble = dadosInternos.random();
			bubble.bubbleSort(viBubble);
		long tfBvi = System.currentTimeMillis();

		
		
		
		//Calculando tempo para QuickSort
		
		//Vetor Excel
		long tiQve = System.currentTimeMillis();
			int[] veQuick = dadosExternos.capturaExcel();
			quick.quickSort(veQuick, 0, veQuick.length-1);
		long tfQve = System.currentTimeMillis();
		
		//Vetor interno
		long tiQvi = System.currentTimeMillis();
			int[] viQuick = dadosInternos.random();
			quick.quickSort(viQuick, 0, viQuick.length-1);
		long tfQvi = System.currentTimeMillis();
		
		

		
		//Calculando tempo para InsertionSort
		
		//Vetor Excel
		long tiIve = System.currentTimeMillis();
			int[] veInsertion = dadosExternos.capturaExcel();
			insertion.interstionSort(veInsertion);
		long tfIve = System.currentTimeMillis();
		
		//Vetor interno
		long tiIvi = System.currentTimeMillis();
			int[] viInsertion = dadosInternos.random();
			insertion.interstionSort(viInsertion);
		long tfIvi = System.currentTimeMillis();
	
		horaF = hora();
		
		
		//Mostrando os resultados
		System.out.println("Hora inicial do sistema: " + horaI);
		System.out.println("Hora final do sistema: " + horaF);
		
		System.out.println();System.out.println();
		
		System.out.println("Tempo de algoritmos com elementos do Excel (" + veInsertion.length + " elementos):");
		System.out.println("BubbleSort: " + (tfBve - tiBve) + "ms.");
		System.out.println("QuickInsertion: " + (tfQve - tiQve) + "ms.");
		System.out.println("InsertionSort: " + (tfIve - tiIve) + "ms.");
		
		System.out.println();System.out.println();
		
		System.out.println("Tempo de algoritmos com elementos gerados internamente (" + viInsertion.length + " elementos):");
		System.out.println("BubbleSort: " + (tfBvi - tiBvi) + "ms.");
		System.out.println("QuickInsertion: " + (tfQvi - tiQvi) + "ms.");
		System.out.println("InsertionSort: " + (tfIvi - tiIvi) + "ms.");	
	}

	private static String hora() {
		Calendar data = Calendar.getInstance();
		
		int hora = data.get(Calendar.HOUR_OF_DAY); 
		int min = data.get(Calendar.MINUTE);
		int seg = data.get(Calendar.SECOND);
		int miliseg = data.get(Calendar.MILLISECOND);
		
		return (hora + "h " +min+ "min " +seg+ "seg " +miliseg+ "ms");
	}
}
