import java.io.*; 

public class ordonareDescrescatoare

{ public static void main(String[] args) throws IOException 

{ int maxSize = 100; 

String input; 

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

System.out.print("Introduceti B pentru metoda bulelor , I pentru inserare si S pentru selectie"); 

System.out.println(""); 

input = getString(); 

if(input.equals("b")||input.equals("B"))

{System.out.println("Sirul ordonat prin metoda bulelor are urmatoarea forma"); 

vector.bubbleSort(); 

vector.afiseaza();}
 
else if(input.equals("s")||input.equals("S")) 

{System.out.println("Sirul ordonat prin selectie are urmatoarea forma"); 

vector.selectionSort(); 

vector.afiseaza();} 

else if(input.equals("i")||input.equals("I"))  

{System.out.println("Sirul ordonat prin inserare are urmatoarea forma"); 

vector.insertionSort(); 

vector.afiseaza();} 

} 

public static String getString() throws IOException 

{InputStreamReader isr=new 

InputStreamReader(System.in); 

BufferedReader br = new BufferedReader(isr); 

String s = br.readLine(); 

return s;} 

} 

 