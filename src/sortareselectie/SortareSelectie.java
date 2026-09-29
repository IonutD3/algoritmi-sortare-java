class SelectionSortProgram 

{ public static void main(String[] args) 

{ int maxSize = 100; 

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

vector.selectionSort(); 

System.out.println("Sirul ordonat are urmatoarea forma"); 

vector.afiseaza();} 

} 