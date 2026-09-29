class Persoana 

{ private String Prenume; 

private String Nume; 

private int varsta; 

public Persoana(String last, String first, int a) 

{ Nume = last;

Prenume = first; 

varsta = a;} 

public void afisarePersoana() 

{System.out.print(" Pren. persoanei: " + Prenume); 

System.out.print(" ,Numele persoanei: " + Nume); 

System.out.println(", Varsta: " + varsta);} 

public String preiaPrenume() 

{ return Prenume; } 

} 