>>>>>>>>>>>>>>

passing array to methods

public static void printArray(int[] array) {
for (int i = 0; i < array.length; i++) {
System.out.print(array[i] + " ");




int x = 11;
int [] y = new int [10];

m(x, y);

System.out.print("x is " + x); \\ print 11
                ("y[] is " + y);\\ print 6783

public static void int(int number, int [] number){

number = 9494;
number [] = 6783;


?>>>>>>>

for initialization

java.util.Scanner input = new java.util.Scanner(System.in);
System.out.print("Enter " + myList.length + " values: ");
for (int i = 0; i < myList.length; i++)
myList[i] = input.nextDouble();

>>>>>>>>>>>>

for random

for (int i = 0; i < myList.length; i++) {
myList[i] = Math.random() * 100;
}


>>>>>>>>>>

for displaying array

for (int i = 0; i < myList.length; i++) {
System.out.print(myList[i] + " ");
}
Tip
For an array of the char[] type, it can be printed using one print statement. For exam-
ple, the following code displays Dallas:
char[] city = {'D', 'a', 'l', 'l', 'a', 's'};
System.out.println(city);


>>>>>>>>>>>>>>


for summing all element


double total = 0;
for (int i = 0; i < myList.length; i++) {
total += myList[i];
}

>>>>>>>>>>>

for finding largest

double max = myList[0];
for (int i = 1; i < myList.length; i++) {
if (myList[i] > max) max = myList[i];
}


>>>>>>>>>>>>

for finding smallext index of the largest element



double max = myList[0];
int indexOfMax = 0;
for (int i = 1; i < myList.length; i++) {
if (myList[i] > max) {
max = myList[i];
indexOfMax = i;
}
}




>>>>>>>>>>>>.

for random shuffling



for (int i = myList.length – 1; i > 0; i––) {
// Generate an index j randomly with 0 <= j <= i
int j = (int)(Math.random()
* (i + 1));
// Swap myList[i] with myList[j]
double temp = myList[i];
myList[i] = myList[j];
myList[j] = temp;
}




>>>>>>>>>>>

for shifting element


double temp = myList[0]; // Retain the first element
// Shift elements left
for (int i = 1; i < myList.length; i++) {
myList[i - 1] = myList[i];
}
// Move the first element to fill in the last position
myList[myList.length - 1] = temp


>>>>>>>>>>>>


for simplifying coding


accessed simply via the index. The following code prompts the user to enter a month
number and displays its month name:
String[] months = {"January", "February", ..., "December"};
System.out.print("Enter a month number (1 to 12): ");
int monthNumber = input.nextInt();
System.out.println("The month is " + months[monthNumber - 1]);
If you didn’t use the months array, you would have to determine the month name using
a lengthy multi-way if-else statement as follows:
if (monthNumber == 1)
System.out.println("The month is January");
else if (monthNumber == 2)
System.out.println("The month is February");
...
else
System.out.println("The month is December");


>>>>>>>>>>>>>>


for coping every element from the source array to another array variable 


int[] sourceArray = {2, 3, 1, 5, 10};
int[] targetArray = new int[sourceArray.length];
for (int i = 0; i < sourceArray.length; i++) {
targetArray[i] = sourceArray[i];
}


OR

arraycopy(sourceArray, srcPos, targetArray, tarPos, length);
(  System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);  )

>>>>>>>>>>>>>>>>>




>>>>>>>>>>>>>>

for finding the number of items above the average of all items


public class AnalyzeNumbers {
2 public static void main(String[] args) { numbers[0]
3 java.util.Scanner input = new java.util.Scanner(System.in); numbers[1]:
4 System.out.print("Enter the number of items: "); numbers[2]:
5 int n = input.nextInt();
6 double [] numbers = new double[n]; .
7 double sum = 0; .
8 numbers[i]: .
9 System.out.print("Enter the numbers: ");
10 for (int i = 0; i < n; i++) { numbers[n - 3]:
11 numbers[i] = input.nextDouble(); numbers[n - 2]:
12 sum += numbers[i]; numbers[n - 1]:
13 }
14
15 double average = sum / n;
16
17 int count = 0; // The number of elements above average
18 for (int i = 0; i < n; i++)
19 if (numbers[i] > average)
20 count++;
21
22 System.out.println("Average is " + average);
23 System.out.println("Number of elements above the average is "
24 + count);
25 }
26 }
