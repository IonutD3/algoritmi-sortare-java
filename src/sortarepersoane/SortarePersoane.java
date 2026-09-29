import java.util.Scanner;
 

class SortarePersoane{  

public static void main(String[] args){ 

String m; 

Scanner met =new Scanner(System.in ); 

System.out.println("Metoda de sortare(Bubble Selection Insertion(b,s,i)): "); 

m = met.next(); 

int maxSize = 100; 

CreareLista arr = new 

CreareLista(maxSize); 

arr.inserarePersoana("Ionescu", "Alin", 24); 

arr.inserarePersoana("Ionescu", "Aladin", 59); 

arr.inserarePersoana("Silvestru", "Vasile", 37); 

arr.inserarePersoana("Anrdeescu", "Ivan", 37); 

arr.inserarePersoana("Stamate", "Dan", 43); 

arr.inserarePersoana("Popescu", "Ion", 21); 

arr.inserarePersoana("Popescu", "Ionut", 29); 

arr.inserarePersoana("Popescu", "Liviu", 72); 

arr.inserarePersoana("Anghelescu", "Lucia", 22); 

arr.inserarePersoana("Constantin", "Lavinia", 18); 

System.out.println("Inainte de sortare:"); 

arr.afisare(); 

if(m.equals("b")||m.equals("B")){ 

    arr.bubbleSort(); 

    System.out.println("Sirul ordonat prin Bubble sort are urmatoarea forma");} 

else if(m.equals("s")||m.equals("S")){ 

    arr.selectionSort(); 

    System.out.println("Sirul ordonat prin Selection sort are urmatoarea forma");} 

else if(m.equals("i")||m.equals("I")){ 

    arr.Sortare(); 

    System.out.println("Sirul ordonat prin Insertion sort are urmatoarea forma");} 

    arr.afisare();} 

} 
