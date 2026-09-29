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

public void insertionSort() 

{int in, out; 

for(out=1; out<NrElmts; out++) 

{double temp = a[out]; 

in = out; 

while(in>0 && a[in-1] >= temp) 

{a[in] = a[in-1]; 

--in;} 

a[in] = temp;} 

} 

public void selectionSort(){ 

int out, in, min; 

for(out=0; out< NrElmts -1; out++){ 

min = out; 

for(in=out+1; in< NrElmts; in++) 

    if(a[in] < a[min] ) 

       min = in; 

inverseazaPozitii(out, min); } 

} 

public void bubbleSort(){  

int out, in; 

for(out=NrElmts-1; out>0; out--) 

for(in=0; in<out; in++) 

if( a[in] > a[in+1] ) 

inverseazaPozitii(in, in+1); } 

private void inverseazaPozitii(int one, int two) 

{ double temp = a[one]; 

a[one] = a[two]; 

a[two] = temp;} 

} 
