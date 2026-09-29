import java.util.Scanner;

class InsertionSortProgram 

{ public static void main(String[] args) 

{ int maxSize = 100; 

String m; 

Scanner met =new Scanner(System.in ); 

System.out.println("Metoda de sortare(Bubble Selection Insertion(b,s,i)): "); 

m = met.next(); 

CreareSir vector = new CreareSir(maxSize); 

vector.introduelement(77); 

vector.introduelement(99); 

vector.introduelement(44); 

vector.introduelement(55); 

vector.introduelement(22); 

vector.introduelement(88); 

vector.introduelement(11); 

vector.introduelement(00); 

vector.introduelement(66); 

vector.introduelement(33); 

System.out.println("Sirul initial neordonat are urmatoarea forma"); 

vector.afiseaza(); 

if(m.equals("b")||m.equals("B")){ 

    vector.bubbleSort(); 

    System.out.println("Sirul ordonat prin Bubble sort are urmatoarea forma");} 

else if(m.equals("s")||m.equals("S")){ 

    vector.selectionSort(); 

    System.out.println("Sirul ordonat prin Selection sort are urmatoarea forma");} 

else if(m.equals("i")||m.equals("I")){ 

    vector.insertionSort(); 

    System.out.println("Sirul ordonat prin Insertion sort are urmatoarea forma");} 

vector.afiseaza();} 

} 