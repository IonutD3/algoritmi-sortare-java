# Algoritmi de sortare în Java

---

# 🇷🇴 Română

## Despre proiect

Proiect Java axat pe implementarea de la zero a unor algoritmi clasici de sortare și aplicarea acestora atât asupra datelor numerice, cât și asupra obiectelor.

Proiectul include implementări pentru:

- **Bubble Sort**
- **Selection Sort**
- **Insertion Sort**

Algoritmii sunt implementați manual, fără utilizarea metodelor de sortare din biblioteca standard Java, pentru a evidenția logica internă a operațiilor de comparare, deplasare și interschimbare a elementelor.

Pe lângă sortarea vectorilor numerici, proiectul include și sortarea unor obiecte `Persoana` pe baza unei proprietăți de tip `String`.

---

## Funcționalități

### Sortare date numerice

Clasa `CreareSir` gestionează un tablou intern de tip `double[]` și numărul curent de elemente.

Funcționalitățile implementate includ:

- inserarea elementelor în vector;
- afișarea elementelor;
- calcularea mediei aritmetice;
- calcularea mediei aritmetice pentru două jumătăți ale vectorului;
- Bubble Sort;
- Selection Sort;
- Insertion Sort;
- sortare crescătoare;
- variante pentru sortare descrescătoare;
- interschimbarea elementelor printr-o metodă dedicată.

Capacitatea vectorului este stabilită prin constructor:

```java
public CreareSir(int max)
```

iar numărul efectiv de elemente este urmărit separat prin:

```java
private int NrElmts;
```

---

## Algoritmi implementați

### Bubble Sort

Implementarea parcurge vectorul succesiv și compară elementele aflate pe poziții consecutive. Atunci când acestea nu respectă ordinea dorită, sunt interschimbate.

Operația de interschimbare este izolată în metoda:

```java
private void inverseazaPozitii(int one, int two)
```

Complexitate temporală:

- Best case: `O(n)` pentru o implementare optimizată cu detectarea absenței schimbărilor;
- Average case: `O(n²)`;
- Worst case: `O(n²)`.

Implementarea din proiect urmărește în principal demonstrarea mecanismului algoritmului.

---

### Selection Sort

Selection Sort identifică elementul minim din partea nesortată a vectorului și îl poziționează la începutul acesteia.

Structura implementării folosește trei indici:

```java
int out, in, min;
```

unde:

- `out` reprezintă poziția curentă;
- `in` parcurge partea nesortată;
- `min` păstrează poziția celui mai mic element identificat.

Complexitate temporală:

```text
O(n²)
```

---

### Insertion Sort

Insertion Sort construiește progresiv partea sortată a vectorului.

Elementul curent este memorat temporar:

```java
double temp = a[out];
```

iar elementele mai mari sau mai mici, în funcție de direcția sortării, sunt deplasate pentru a crea poziția corespunzătoare.

Complexitate:

- Best case: `O(n)`;
- Average case: `O(n²)`;
- Worst case: `O(n²)`.

---

# Sortarea obiectelor

Proiectul extinde conceptul de sortare de la valori numerice la obiecte.

Clasa:

```java
Persoana
```

conține următoarele informații:

```text
Prenume
Nume
Varsta
```

Obiectele sunt gestionate prin:

```java
CreareLista
```

care utilizează un tablou de obiecte:

```java
private Persoana[] a;
```

și păstrează numărul de elemente prin:

```java
private int nElems;
```

---

## Compararea obiectelor

Sortarea persoanelor este realizată pe baza prenumelui.

Clasa `Persoana` expune metoda:

```java
public String preiaPrenume()
```

iar algoritmii folosesc:

```java
compareTo()
```

pentru compararea valorilor `String`.

Astfel, aceeași logică de sortare poate fi aplicată asupra obiectelor, nu doar asupra valorilor primitive.

---

# Alegerea algoritmului la runtime

Programul `InsertionSortProgram` permite utilizatorului să aleagă algoritmul de sortare de la consolă.

Opțiunile implementate sunt:

```text
B / b → Bubble Sort
S / s → Selection Sort
I / i → Insertion Sort
```

Exemplu:

```text
Metoda de sortare(Bubble Selection Insertion(b,s,i)): i
```

În funcție de opțiunea introdusă, este apelată metoda corespunzătoare:

```java
vector.bubbleSort();
vector.selectionSort();
vector.insertionSort();
```

Acest mecanism demonstrează selectarea dinamică a comportamentului programului pe baza inputului utilizatorului.

---

# Procesarea datelor

Proiectul utilizează exemple de vectori numerici precum:

```text
77 99 44 55 22 88 11 0 66 33
```

Pentru sortare crescătoare, rezultatul așteptat este:

```text
0 11 22 33 44 55 66 77 88 99
```

Pentru obiecte sunt utilizate date precum:

```text
Ionescu, Alin, 24
Ionescu, Aladin, 59
Silvestru, Vasile, 37
Stamate, Dan, 43
Popescu, Ion, 21
Popescu, Ionut, 29
Popescu, Liviu, 72
Anghelescu, Lucia, 22
Constantin, Lavinia, 18
```

Acestea sunt stocate ca obiecte `Persoana` și pot fi sortate pe baza prenumelui.

---

# Calcularea mediilor

Unele variante ale clasei `CreareSir` includ operații matematice asupra datelor.

Este calculată media aritmetică:

```text
media = suma elementelor / numărul de elemente
```

O altă variantă împarte vectorul în două părți și calculează separat:

- media aritmetică a primei jumătăți;
- media aritmetică a celei de-a doua jumătăți.

Această funcționalitate demonstrează parcurgerea condiționată a unui tablou și agregarea valorilor.

---

# Structura proiectului

```text
algoritmi-sortare-java/
│
├── README.md
│
└── src/
    ├── sortaredescrescatoare/
    │   ├── GeneratorVector.java
    │   └── SortareDescrescatoare.java
    │
    ├── sortarebule/
    │   ├── GeneratorVector.java
    │   └── SortareBule.java
    │
    ├── sortareinserare/
    │   ├── GeneratorVector.java
    │   └── SortareInserare.java
    │
    ├── sortareselectie/
    │   ├── GeneratorVector.java
    │   └── SortareSelectie.java
    │
    └── sortarepersoane/
        ├── Persoana.java
        ├── ListaPersoane.java
        └── SortarePersoane.java
```

---

## Concepte Java demonstrate

- **Clase și obiecte** – `Persoana`, `GeneratorVector`, `ListaPersoane`;
- **încapsulare** – starea internă a structurilor este păstrată în câmpuri `private`;
- **constructori și metode** – inițializarea și manipularea structurilor de date;
- **tablouri** – `double[]` și `Persoana[]`;
- **bucle și control al fluxului** – `for`, `while`, `switch`;
- **input din consolă** – `Scanner`, `BufferedReader` și `InputStreamReader`;
- **compararea șirurilor** – `String.compareTo()`;
- **interschimbarea elementelor** – metode auxiliare pentru swap;
- **organizarea codului pe package-uri** – fiecare familie de exemple are propriul package.

---

# Complexitate algoritmică

| Algoritm | Direcție numerică | Cheie obiecte | Timp – caz favorabil | Timp – mediu | Timp – nefavorabil | Spațiu auxiliar |
|---|---|---|---:|---:|---:|---:|
| Bubble Sort | crescător / descrescător | prenume | O(n²) | O(n²) | O(n²) | O(1) |
| Selection Sort | crescător / descrescător | prenume | O(n²) | O(n²) | O(n²) | O(1) |
| Insertion Sort | crescător / descrescător | prenume | O(n) | O(n²) | O(n²) | O(1) |

---

# Considerații tehnice

Implementarea utilizează tablouri cu capacitate fixă și păstrează separat numărul de elemente efectiv introduse.

De exemplu:

```java
private double[] a;
private int NrElmts;
```

Această abordare permite utilizarea unui singur tablou pentru stocare, în timp ce `NrElmts` indică limita logică până la care sunt procesate elementele.

Pentru obiectele `Persoana` este utilizat același principiu:

```java
private Persoana[] a;
private int nElems;
```

Sortarea este implementată prin operații directe asupra tabloului, fără framework-uri sau biblioteci externe.

---

# Obiectiv tehnic

Proiectul demonstrează implementarea manuală a unor algoritmi fundamentali de sortare și aplicarea acelorași principii atât asupra datelor primitive, cât și asupra obiectelor.

Accentul este pus pe:

- implementarea de la zero a **Bubble Sort**, **Selection Sort** și **Insertion Sort**;
- sortare atât **crescătoare**, cât și **descrescătoare**;
- lucrul direct cu tablouri de primitive și obiecte;
- separarea datelor de logica algoritmilor prin clase dedicate;
- utilizarea **încapsulării** (`private`, metode publice pentru operații controlate);
- modelarea datelor printr-o clasă Java (`Persoana`);
- utilizarea `String.compareTo()` pentru sortarea obiectelor după o cheie textuală;
- interacțiune cu utilizatorul prin consolă și alegerea algoritmului în timpul execuției;
- calcularea mediilor aritmetice pentru seturi de date numerice.

---

## Cerințe

- **JDK 17** sau o versiune mai nouă;
- terminal / Command Prompt / PowerShell.

## Compilare

Din directorul rădăcină al proiectului:

### Linux / macOS

```bash
mkdir -p out
javac -d out $(find src/main/java -name "*.java")
```

### Windows PowerShell

```powershell
New-Item -ItemType Directory -Force out
javac -d out (Get-ChildItem -Recurse src/main/java -Filter *.java).FullName
```

## Rulare

Exemple:

```bash
java -cp out sortarebule.SortareBule
java -cp out sortareinserare.SortareInserare
java -cp out sortareselectie.SortareSelectie
java -cp out sortaredescrescatoare.SortareDescrescatoare
java -cp out sortarepersoane.SortarePersoane
```

Programele interactive solicită alegerea algoritmului direct în consolă.

---

# Java Sorting Algorithms

# 🇬🇧 English

## About the project

Java project focused on implementing classic sorting algorithms from scratch and applying them to both numerical data and custom objects.

The project includes implementations of:

- **Bubble Sort**
- **Selection Sort**
- **Insertion Sort**

The sorting logic is implemented manually rather than relying on Java's built-in sorting utilities, providing direct control over comparisons, element movement, and swapping operations.

The project also demonstrates how the same sorting concepts can be applied to custom objects.

---

## Features

### Numerical data processing

The `CreareSir` class manages an internal `double[]` array together with the number of elements currently stored.

Implemented functionality includes:

- inserting elements;
- displaying array contents;
- calculating arithmetic averages;
- calculating averages for two array halves;
- Bubble Sort;
- Selection Sort;
- Insertion Sort;
- ascending sorting;
- descending sorting variants;
- element swapping through a dedicated helper method.

The array capacity is defined through:

```java
public CreareSir(int max)
```

while the logical number of stored elements is maintained separately:

```java
private int NrElmts;
```

---

# Implemented Algorithms

### Bubble Sort

The implementation repeatedly compares adjacent elements and swaps them when they are in the wrong order.

The swapping logic is isolated in:

```java
private void inverseazaPozitii(int one, int two)
```

Time complexity:

- Best case: `O(n)` for an optimized implementation with early termination;
- Average case: `O(n²)`;
- Worst case: `O(n²)`.

The implementation in this project primarily focuses on demonstrating the algorithmic mechanism.

---

### Selection Sort

Selection Sort searches for the minimum element in the unsorted portion of the array and places it at the current position.

The implementation uses three indexes:

```java
int out, in, min;
```

where:

- `out` represents the current position;
- `in` traverses the unsorted section;
- `min` stores the position of the smallest element found.

Time complexity:

```text
O(n²)
```

---

### Insertion Sort

Insertion Sort progressively builds the sorted portion of the array.

The current value is temporarily stored:

```java
double temp = a[out];
```

Elements are then shifted until the correct position for the current value is found.

Time complexity:

- Best case: `O(n)`;
- Average case: `O(n²)`;
- Worst case: `O(n²)`.

---

# Object Sorting

The project extends the sorting logic from primitive numerical values to custom objects.

The:

```java
Persoana
```

class contains:

```text
First name
Last name
Age
```

Objects are managed through:

```java
CreareLista
```

which internally uses:

```java
private Persoana[] a;
```

and tracks the number of stored objects through:

```java
private int nElems;
```

---

## Object comparison

`Persoana` objects are sorted according to their first name.

The class exposes:

```java
public String preiaPrenume()
```

and the sorting algorithms compare first names using:

```java
compareTo()
```

This demonstrates how sorting algorithms can operate on object properties rather than only primitive values.

---

# Runtime Algorithm Selection

`InsertionSortProgram` allows the user to select the sorting algorithm through console input.

Available options:

```text
B / b → Bubble Sort
S / s → Selection Sort
I / i → Insertion Sort
```

Example:

```text
Metoda de sortare(Bubble Selection Insertion(b,s,i)): i
```

The selected algorithm is then invoked through the corresponding method:

```java
vector.bubbleSort();
vector.selectionSort();
vector.insertionSort();
```

This demonstrates runtime selection of program behavior based on user input.

---

# Data Processing

The project uses numerical datasets such as:

```text
77 99 44 55 22 88 11 0 66 33
```

Ascending order produces:

```text
0 11 22 33 44 55 66 77 88 99
```

The project also creates and processes `Persoana` objects, for example:

```text
Ionescu, Alin, 24
Ionescu, Aladin, 59
Silvestru, Vasile, 37
Stamate, Dan, 43
Popescu, Ion, 21
Popescu, Ionut, 29
Popescu, Liviu, 72
Anghelescu, Lucia, 22
Constantin, Lavinia, 18
```

These objects can be sorted according to their first name.

---

# Average Calculations

Several versions of `CreareSir` include numerical aggregation functionality.

The arithmetic mean is calculated as:

```text
average = sum of elements / number of elements
```

Another implementation divides the array into two sections and calculates:

- the arithmetic mean of the first half;
- the arithmetic mean of the second half.

This demonstrates conditional array traversal and numerical aggregation.

---

# Project Structure

```text
algoritmi-sortare-java/
│
├── README.md
│
└── src/
    ├── sortaredescrescatoare/
    │   ├── GeneratorVector.java
    │   └── SortareDescrescatoare.java
    │
    ├── sortarebule/
    │   ├── GeneratorVector.java
    │   └── SortareBule.java
    │
    ├── sortareinserare/
    │   ├── GeneratorVector.java
    │   └── SortareInserare.java
    │
    ├── sortareselectie/
    │   ├── GeneratorVector.java
    │   └── SortareSelectie.java
    │
    └── sortarepersoane/
        ├── Persoana.java
        ├── ListaPersoane.java
        └── SortarePersoane.java
```

---

## Java concepts demonstrated

- classes and objects;
- encapsulation and access modifiers;
- constructors and instance methods;
- primitive and object arrays;
- loops and conditional control flow;
- console input with `Scanner` and `BufferedReader`;
- string comparison using `String.compareTo()`;
- in-place swapping and element shifting;
- package-based source organization;
- basic object-oriented data modeling.

---

# Algorithm Complexity

| Algorithm | Numeric order | Object key | Best case | Average case | Worst case | Auxiliary space |
|---|---|---|---:|---:|---:|---:|
| Bubble Sort | ascending / descending | first name | O(n²) | O(n²) | O(n²) | O(1) |
| Selection Sort | ascending / descending | first name | O(n²) | O(n²) | O(n²) | O(1) |
| Insertion Sort | ascending / descending | first name | O(n) | O(n²) | O(n²) | O(1) |

---

# Technical Notes

The implementation uses fixed-capacity arrays and maintains the logical number of stored elements separately.

For numerical data:

```java
private double[] a;
private int NrElmts;
```

For objects:

```java
private Persoana[] a;
private int nElems;
```

This approach separates the physical array capacity from the number of elements currently being processed.

Sorting is performed directly on the underlying arrays without external libraries or built-in sorting methods.

---

# Technical Objective

The project demonstrates the manual implementation of fundamental sorting algorithms and their application to both primitive data and custom objects.

The main technical concepts demonstrated are:

- implement **Bubble Sort, Selection Sort, and Insertion Sort** from scratch;
- support both **ascending and descending** ordering;
- work with arrays of primitive values and custom objects;
- separate data representation from algorithmic operations;
- demonstrate **encapsulation** through private state and controlled public methods;
- model domain data using a dedicated `Persoana` class;
- use `String.compareTo()` for object-based ordering;
- provide console-based algorithm selection;
- calculate arithmetic means for numeric datasets.

---

## Requirements

- **JDK 17** or newer;
- a terminal, Command Prompt, or PowerShell.

## Build

### Linux / macOS

```bash
mkdir -p out
javac -d out $(find src/main/java -name "*.java")
```

### Windows PowerShell

```powershell
New-Item -ItemType Directory -Force out
javac -d out (Get-ChildItem -Recurse src/main/java -Filter *.java).FullName
```

## Run

```bash
java -cp out sortarebule.SortareBule
java -cp out sortareinserare.SortareInserare
java -cp out sortareselectie.SortareSelectie
java -cp out sortaredescrescatoare.SortareDescrescatoare
java -cp out sortarepersoane.SortarePersoane
```

Interactive examples ask the user to select the sorting algorithm from the console.

---

## 👤 Autor / Author

**IonutD**