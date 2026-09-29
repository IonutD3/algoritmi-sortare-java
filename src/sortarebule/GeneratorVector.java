class CreareSir 

{ private double[] a; 

private int NrElmts; 

public CreareSir(int max) 

{ a = new double[max]; 

NrElmts = 0; 

} 

    public void introduelement(double value) {

        a[NrElmts] = value;

        NrElmts++;} 

public void afiseaza() {

    double sum = 0;

    for(int j = 0; j < NrElmts; j++) {

        System.out.print(a[j] + " ");

        sum += a[j];}

    System.out.println("");

    System.out.println("Media aritmetica: " + (sum / NrElmts));} 

public void bubbleSort() 

{ int out, in; 

for(out=NrElmts-1; out>0; out--) 

for(in=0; in<out; in++) 

if( a[in] > a[in+1] ) 

inverseazaPozitii(in, in+1); } 

private void inverseazaPozitii(int one, int two) 

{ double temp = a[one]; 

a[one] = a[two]; 

a[two] = temp; } 

} 