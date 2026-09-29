
class CreareLista 

{private Persoana[] a; 

private int nElems; 

public CreareLista(int max) 

{a = new Persoana[max]; 

nElems = 0;} 

public void inserarePersoana(String last, String first, int varsta) 

{ a[nElems] = new Persoana(last, first, varsta); 

nElems++;} 

public void afisare() 

{for(int j=0; j<nElems; j++) 

a[j].afisarePersoana(); 

System.out.println("");} 

public void Sortare() 

{ int in, out; 

for(out=1; out<nElems; out++) 

{Persoana temp = a[out]; 

in = out; 

while(in>0 && a[in-1].preiaPrenume().compareTo(temp.preiaPrenume())<0) 

{ a[in] = a[in-1]; 

--in;} 

a[in] = temp;} 

} 

public void selectionSort(){ 

int out, in, max; 

for(out=0; out< nElems -1; out++) 

{ max = out; 

for(in=out+1; in< nElems; in++) 

    if(a[in].preiaPrenume().compareTo(a[max].preiaPrenume())>0) 

       max = in; 

inverseazaPozitii(out, max); } 

} 

public void bubbleSort(){  

int out, in; 

for(out=nElems-1; out>0; out--) 

for(in=0; in<out; in++) 

if( a[in].preiaPrenume().compareTo(a[in+1].preiaPrenume())<0) 

inverseazaPozitii(in, in+1); } 

private void inverseazaPozitii(int one, int two){  

    Persoana temp = a[one]; 

a[one] = a[two]; 

a[two] = temp;} 

} 