class CreareSir 

{private double[] a; 

private int NrElmts; 

public CreareSir(int max) 

{ a = new double[max]; 

NrElmts = 0;} 

public void introduelement(double value) 

{ a[NrElmts] = value; 

NrElmts++;} 

public void afiseaza() 

{ for(int j=0; j<NrElmts; j++) 

System.out.print(a[j] + " "); 

System.out.println("");}

public void bubbleSort() 

{ int out, in; 

for(out=NrElmts-1; out>0; out--) 

for(in=0; in<out; in++) 

if( a[in] < a[in+1] ) 

inverseazaPozitii(in, in+1); } 

public void selectionSort(){ 

int out, in, max; 

for(out=0; out< NrElmts; out++){ 

max = out; 

for(in=out+1; in< NrElmts; in++) 

    if(a[in] > a[max] ) 

       max = in; 

inverseazaPozitii(out, max); } 

}

public void insertionSort(){ 

int in, out; 

for(out=1; out<NrElmts; out++){ 

double temp = a[out]; 

in = out; 

while(in>0 && a[in-1] <= temp){ 

a[in] = a[in-1]; 

--in;} 

a[in] = temp;} 

} 

private void inverseazaPozitii(int one, int two) 

{ double temp = a[one]; 

a[one] = a[two]; 

a[two] = temp;}  

} 