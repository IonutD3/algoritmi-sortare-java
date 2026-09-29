class CreareSir 

{private double[] a; 

private int NrElmts; 

public CreareSir(int max) 

{ a = new double[max]; 

NrElmts = 0;} 

public void introduelement(double value) 

{ a[NrElmts] = value; 

NrElmts++;} 

public void afiseaza(){  

    double s1 = 0; 

    double s2 = 0; 

    int a1; 

    for(int j=0; j<NrElmts; j++){ 

      System.out.print(a[j] + " "); 

      a1=NrElmts/2; 

      if(j<a1) 

          s1 += a[j]; 

      else s2 += a[j];} 

System.out.println(""); 

System.out.println("Media aritmetica a primei jumatati: "+ s1/(NrElmts/2)); 

System.out.println("Media aritmetica a celei de-a doua jumatati: "+ s2/(NrElmts/2));} 

public void selectionSort() 

{int out, in, min; 

for(out=0; out< NrElmts -1; out++) 

{ min = out; 

for(in=out+1; in< NrElmts; in++) 

if(a[in] < a[min] ) 

min = in; 

inverseazaPozitii(out, min); } 

} 

private void inverseazaPozitii(int one, int two) 

{ double temp = a[one]; 

a[one] = a[two]; 

a[two] = temp;} 

} 