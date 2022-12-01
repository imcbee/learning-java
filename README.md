# learning-java

## These are my notes on learning Java

## Variable Types:

![[Screenshot 2022-11-16 at 10.23.16 AM.png]] - longs are long integers and designate with an **'L'** - difference between a float and double is that a double can be larger decimal (64 bit) and floats can be used to save memory (32 bit). - need to use **"F"** to show that it is a float

```java
class Main {
  static int age; //static variable declaration

  public static void main(String[] args) {
    // System.out.println("Hello world!");
    int age = 27; //int for variable

    //age = 27; //define the variable

    //there are keywords reserved in Java
    //follow camelCasing

    //-------------------------Variable Types-----------------------------

    //integers
      byte aSingleByte = 100; //small numbers between -128 to 127
      short aSmallNumber = 20000; //-32,768 to 32,767
      int anInteger = 2147483647;
      long aLargeNumber = 9223372036854775807L; //-9223372036854775807 to 9223372036854775807 ;L for long
     //decimal types
      .... see above!!!



    System.out.println("I am " + age + " years old.");
  }
}
```

## Type Conversion - Implicit and Explicit

Implicit - Change from float to double for an example in changing variable types

```java
class Main {
  public static void main(String[] args) {
	int number1 = 5;
	double number2 = number1;

	System.out.println(number2); //**this will print 5.0**
  }
}
```

```java
class Main {
  public static void main(String[] args) {
	double number1 = 5.8;
	int number2 = number1;

	System.out.println(number2); //this will print an error
	// but you can print explicitly below
  }
}
```

Explicit Type Conversion

```java
class Main {
  public static void main(String[] args) {
	double number1 = 5.8;
	int number2 = (int)number1;

	System.out.println(number2); //this will print 5
  }
}
```

## Operators

```java
class Main {
  public static void main(String[] args) {
	int number1 = 12;
	int number2 = 6;

	//addition
	System.out.println(number1 + number2); // 18

	//subtration
	System.out.println(number1 - number2); // 6

	//multiplication
	System.out.println(number1 * number2); // 72

	//division
	System.out.println(number1 / number2); // 2

// 12/5 however will give 2 still because you need to change the variable types to doubles
	//12/5 = 2.4
//if you divide a double or float with an int, then you will get a double or float.

	//modulo/modulus
	System.out.println(number1 % number2); // 0

  }
}
```

### Assignment Operators

```java
class Main {
  public static void main(String[] args) {
	int number1 = 12;
	number += 5; //number = number + 5;
	number -= 6; // 2
	number %= 2; // 0

	System.out.println(number);

  }
}
```

### Relational Operators

```java
class Main {
  public static void main(String[] args) {
	int number1 = 12;
	int number2 = 15;

	System.out.println(number1 == number2; // false
	System.out.println(number1 != number2; // true
	System.out.println(number1 > number2); // false
	System.out.println(number1 < number2); // true
	System.out.println(number1 >= number2); // false
	System.out.println(number1 <= number2); // true

  }
}
```

### Conditional Operators

And &&

```java
class Main {
  public static void main(String[] args) {
	int age = 25;

	//age >= 18
	//age <= 40

	System.out.println(age >= 18 && age <= 40); //true
		//if age is 45, output is false

  }
}
```

Or ||

```java
class Main {
  public static void main(String[] args) {
	boolean isStudent = false;
	boolean isLibraryMember = true;

	System.out.println(isStudent || isLibraryMember); // true
		// if both are false, then it is false

  }
}
```

Not !

```java
class Main {
  public static void main(String[] args) {
	boolean isStudent = false;

	System.out.println(!isStudent); // true

  }
}
```

### Unary Operators (++ and --)

```java
class Main {
  public static void main(String[] args) {
	int score = 0;
	int turns = 10;

	score++; // score += 1;
	turns--; // score -= 1;
		//you can write as ++score

	System.out.println(score, turns); // 1 and 9
  }
}
```

## Strings

```java
class Main {
  public static void main(String[] args) {
	char percentSign = '%'; // cannot use for long strings, only single char
	String name = 'Ian McBee';
	String name = new String('Ian McBee');

	System.out.println(percentSign); // %
	System.out.println(name); // Ian McBee
  }
}
```

```java
class Main {
  public static void main(String[] args) {
	String string1 = 'abc';
	String string2 = 'abc';

	String objectString1 = new String('xyz');
	String objectString2 = new String('xyz');

	System.out.println(string1 == string2); // true
	System.out.println(objectString1 == objectString2); // false

	// the new keyword makes the 2 objectStrings two different entities
  }
}
```

**Use the literal string instead of "new String"** - better for the complier - you will strings the most in Java

```java
class Main {
  public static void main(String[] args) {
	String name = "Ian McBee";
	String country = 'USA';
	int age = 31;

	System.out.println("Hello world! I am " + name + " and I am from" + country + "and I am " + age + "years old.");

	//Better way is like string literal:

	String formattedString = String.format("My name is %s. I am from %s.  I am %d years old", name, country, age);
		// %s is for string data types
		// %d is for integers
		// %f is for floats
		// %c is for character
		// %b is for boolean values

	System.out.println(formattedString);
		// always have the formatted string as a variable

	//------------------------------Methods----------------------------------
	System.out.println(formattedString.length());
		// length is a method is measure how long the string is.

	System.out.println(formattedString.isEmpty());
		// return boolean is variable is empty ("" == true)

	System.out.println(formattedString.toUpperCase());
		// converts string to uppercase

	System.out.println(formattedString.toLowerCase());
		// converts string to lowercase
  }
}
```

Comparing two different string objects

```java
class Main {
  public static void main(String[] args) {
	String newString1 = new String('abc');
	String newString2 = new String('abc');

	System.out.println(newString1 == newString2); // false
		//these are not the same object

	System.out.println(newString1.equals(newString2)); // true
		//this checks if two different string objects are the same
		//but if string2 is 'ABC', then it will == false

	System.out.println(newString1.equalsIgnoreCase(newString2)); // true
		//this will ignore the casing in the string
  }
}
```

```java
class Main {
  public static void main(String[] args) {
	String string = "The sky is blue";

	System.out.println(string.replace('blue', 'red')); //replaces blue with red

	// Option to store new variable
	String updatedString = string.replace('blue', 'red');
	System.out.println(updatedString);

	//
	System.out.println(string.contains('sky')); // true (string contains sky)
	System.out.println(string.contains('bear')); // false

  }
}
```

## User Input

Scanner Object - It is able to able users to input information/data
Strings

```java
import java.util.scanner; // import dependencies to use scanner

class Main {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println("What's your name?"); // terminal asks for your name
	String name = scanner.nextline(); // User will input text

	System.out.println(name); // prints out name = 'Ian McBee'
		// false without scanner.close

	scanner.close();


	//------------------Different ways to print/new lines-----------------------
	System.out.print("What's your name?"); // this allows you to type next to the print statment
		// What's your name? ...

	System.out.println("What's your name? /n");// makes a new line

	System.out.printf("Hello %s. How are you?", name); // format print
  }
}
```

Integers, Doubles and Floats

```java
import java.util.scanner; // import dependencies to use scanner

class Main {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println("What's your name?"); // terminal asks for your name
	String name = scanner.nextline(); // User will input text

	System.out.printf("Hello %s. How old are you? ", name);
	int age = scanner.nextInt();
		// scanner.nextDouble();
		// scanner.nextFloat();

	System.out.printf("%d is an excellent age to learn programming.", age)

	scanner.close();
  }
}
```

Anomaly - `<enter>` input butter - this is for the case of using a **nextInt()** call and then a **nextLine()** call

```java
import java.util.scanner;

class Main {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println("What's your name?");
	String name = scanner.nextline();

	System.out.printf("Hello %s. How old are you? ", name);
	int age = scanner.nextInt();
	// int age = Interger.parseInt(scanner.nextLine());
		//this is another way to fix the problem
	// int gpa = Double.parseDouble(scanner.nextLine());

	scanner.nextLine();
		// <enter> is placed as an input buffer, rectify by using the line above.

	System.out.printf("%d is an excellent age to learn programming. What programming language do you prefer? ", age);

	String language = scanner.nextLine();

	System.out.printf("%s is a very popular programming language.", language);

	scanner.close();
  }
}
```

## Logical Operators (if, else if, else)

```java
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		double number1 = scanner.nextDouble();

		System.out.print("Enter the second number: ");
		double number2 = scanner.nextDouble();

		System.out.println("What operation do you want to perform? ");

		String operation = scanner.nextLine();

		if (operation.equals("sum")) {
			System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
		}else if (operation.equals("sub")){
			System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
		}else if (operation.equals("sub")){
			System.out.printf("%f - %f = %f", number1, number2, number1 + number2);
		}else if (operation.equals("mul")){
			System.out.printf("%f x %f = %f", number1, number2, number1 * number2);
		}else if (operation.equals("div")){
		if(number2 == 0 || number1 == 0){
			System.out.println("Can not divide by zero.");
		}
			System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
		}else {
			System.out.printf("%s is not a supported operation%", operation);
		}

		scanner.close();
	}
}
```

## Switch Cases

- switch cases are faster than a if, else if and else statements.

```java
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		double number1 = scanner.nextDouble();

		System.out.print("Enter the second number: ");
		double number2 = scanner.nextDouble();

		System.out.println("What operation do you want to perform? ");

		String operation = scanner.nextLine();

		switch(operation){
			case "sum":
				System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
				break;
			case "sub":
				System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
				break;
			case "mul":
				System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
				break;
			case "div":
				if(number2 == 0 || number1 == 0){
					System.out.println("Can not divide by zero.");
				}
				System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
				break;
			default:
				System.out.println("What operation do you want to perform? ");
		}

		scanner.close();
	}
}
```

## Arrays

- Arrays are reference types, can be strings, numbers and other types.
- Sort will order the array as a method\*

```java
import java.util.Arrays;

class Main {
	public static void main(String[] args) {
		char vowels[] = new char[5];
		// [a, e, i, o, u]
		vowels[0] = 'a';
		vowels[1] = 'e';
		vowels[2] = "i";
		vowels[3] = "o";
		vowels[4] = "u";

		System.out.println(vowels[2]); // i
		System.out.println(Arrays.toString(vowels)); // [a, e, i , o, u]

		// --------------------------Easier Way-----------------------
		char vowels[] = {a, e, i, o, u}; // [a, e, i , o, u]

		// ---------------------replace item in array------------------
		vowels[2] = "x"; // [a, e, x, o, u]

		System.out.println(Arrays.toString(vowels));

		//-----------------------Length of array------------------------
		System.out.println(vowels.length); // 5

		// -----------------------Sort method---------------------------
		char vowels[] = {i, o, u, e, a};
		Arrays.sort(vowels);
		System.out.println(Array.toString(vowels); // [a, e, i, o, u]

		// -----------------------Sort method Continued------------------
		char vowels[] = {i, o, u, e, a};
		int start = 1;
		int end = 4;
		Arrays.sort(vowels, start, end);
		System.out.println(Array.toString(vowels); // [i, e, o, u, a]
			// only sorts in the specified range, remember the ending point is the point where you want it to sort

		// ----------------------Binary Search Method----------------------
		char vowels[] = {i, o, u, e, a};
		Arrays.sort(vowels);

		char key = "o";
		int foundItemIndex = Arrays.binarySearch(vowels, key);
		System.out.println(Array.toString(vowels); // [a, e, i, o, u]
		System.out.println(foundItemIndex); // 3

		// ----------------------Binary Search Method continued-------------
		char vowels[] = {i, o, u, e, a};
		Arrays.sort(vowels);

		int start = 1;
		int end = 4;
		char key = "o";
		int foundItemIndex = Arrays.binarySearch(vowels, start, end, key);
		System.out.println(Array.toString(vowels); // [a, e, i, o, u]
		System.out.println(foundItemIndex); // 3
			// you can search in a specific range

		// ----------------------Binary Search Method continued-------------
		char vowels[] = {i, o, u, e, a};
		Arrays.sort(vowels);

		char key = "x";
		int foundItemIndex = Arrays.binarySearch(vowels, key);
		System.out.println(Array.toString(vowels); // [a, e, i, o, u]
		System.out.println(foundItemIndex); // -6
			// if you change "x" to "b", you will get -2
			// you will always get a negative output
			// there is logic to why, see below

		// -----------------------Arrays Fill Method-------------------------
		char vowels[] = {i, o, u, e, a};
		Arrays.sort(vowels);

		Arrays.fill(vowels, "x")
		System.out.println(Array.toString(vowels); // [x, x, x, x, x]

		// -----------------------Arrays Fill Method continued-----------------
		char vowels[] = {i, o, u, e, a};
		Arrays.sort(vowels);

		int start = 1;
		int end = 4;
		Arrays.fill(vowels, start, end, "x")
		System.out.println(Array.toString(vowels); // [i, x, x, x, a]

	}
}
```

- Resources: [How to Use Arrays binary Search](https://www.freecodecamp.org/news/how-to-use-arrays-binarysearch-in-java/)

```java
import java.util.Arrays;

class Main {
	public static void main(String[] args) {
		int numbers[] = {1, 2, 3, 4, 5};
		int copyOfNumbers[] = numbers;

		System.out.println(Arrays.toString(numbers)); // [1, 2, 3, 4, 5]
		System.out.println(Arrays.toString(copyOfNumbers)); // [1, 2, 3, 4, 5]
			// this shows that both arrays are the same, but test this...

		Arrays.fill(numbers, 0);
		System.out.println(Arrays.toString(numbers)); // [0, 0, 0, 0, 0]
		System.out.println(Arrays.toString(copyOfNumbers)); // [0, 0, 0, 0, 0]
			// both arrays are filled with zeros because of the assignment.
			// this means numbers and copyOfNumbers are not true copies.

		// ---------------------copyOf Method----------------------------
		int numbers[] = {1, 2, 3, 4, 5};
		int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);
			// the method needs the array and length of array in args

		Arrays.fill(numbers, 0);
		System.out.println(Arrays.toString(numbers)); // [0, 0, 0, 0, 0]
		System.out.println(Arrays.toString(copyOfNumbers)); // [1, 2, 3, 4, 5]

		// ---------------------copyOf Method continued--------------------
		int numbers[] = {1, 2, 3, 4, 5};
		int copyOfNumbers[] = Arrays.copyOf(numbers, 10);
			// if you use 2, then it will print only [1, 2]

		Arrays.fill(numbers, 0);
		System.out.println(Arrays.toString(numbers)); // [0, 0, 0, 0, 0]
		System.out.println(Arrays.toString(copyOfNumbers)); // [1, 2, 3, 4, 5, 0, 0, 0, 0, 0]
			// copyOf adds 0 by default in the extra spots

		// ---------------------copyOfRange Method----------------------------
		int numbers[] = {1, 2, 3, 4, 5};
		int copyOfNumbers[] = Arrays.copyOfRange(numbers, start, end);
			// specifies the range that the array is at

		int start = 1;
		int end = 4;

		Arrays.fill(numbers, 0);
		System.out.println(Arrays.toString(numbers)); // [0, 0, 0, 0, 0]
		System.out.println(Arrays.toString(copyOfNumbers)); // [2, 3, 4]
			// how to increase the range if wanted?

		// ---------------------copyOfRange Method continued------------------
		int numbers[] = {1, 2, 3, 4, 5};
		int copyOfNumbers[] = Arrays.copyOfRange(numbers, start, end);
			// specifies the range that the array is at

		int start = 1;
		int end = 10;

		Arrays.fill(numbers, 0);
		System.out.println(Arrays.toString(numbers)); // [0, 0, 0, 0, 0]
		System.out.println(Arrays.toString(copyOfNumbers)); // [2, 3, 4, 5, 0, 0, 0, 0, 0]

		// ---------------------copyOf Method continued--------------------
		int numbers[] = {1, 2, 3, 4, 5};
		int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);

		System.out.println(Arrays.toString(numbers == copyOfNumbers)); // false
			// these are not equal because need to use equals method

		System.out.println(Arrays.equals(numbers, copyOfNumbers)); // true
	}
}
```

## Loops (For, While, Do While...)

```java

class Main {
	public static void main(String[] args) {
		for(int i = 1; i<= 10; i++) {
			System.print.out(i); // prints 1 through 10
		}

		// -------------------Looping Arrays------------------------------
		int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]); // prints 1 through 10
		}

		// -------------------Looping Arrays continued-----------------------
		int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int total = 0;
		for(int i=0; i<numbers.length; i++) {
			total += numbers[i];

		}

		System.out.println(total); // 55

		// -------------------For Loops with Print-----------------------------
		int numbers[] = 5;

		for(int i=1; i<10; i++){
			System.out.printf("%d x %d = %d /n", number, i, number * i);
		}
			// this prints 5 X 1 = 5 and continued....

		// -------------------Nested For Loops-------------------------------
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.println("%d X %d = %d /n", i, j, i * j);
			}
		}
			// this prints out multiplicatiion table from 1 to 10
			// 1x1 =1.....10x10 = 100
	}
}
```

If and Else Statements in a For Loop

```java
class Main {
	public static void main(String[] args) {
		for(int i=1; i<=50; i++) {
			if(i % 2 == 1) {
				System.out.println(i); // print odd numbers 1-50
			}
		}
	}
}
```

```java
class Main {
	public static void main(String[] args) {
		int numbers[] = {1, 2, 3, 4, 5};

		for(int i: numbers) {
			System.out.println(numbers); // prints out array numbers

			sum += i;
		}
			// this is a short cut by extracting each value from the array


		System.out.println(sum); // 15
	}
}
```

While Loops

```java
class Main {
	public static void main(String[] args) {
		int number = 5;
		int multipliier = 1;

		while(multiplier <= 10) {
			System.out.println("%d X %d = %d /n", number, multiplier, number * multiplier);
			multipler++;
		}
			//while loops are like if statements.  If it true, it will continue
			//the incrementation happens as a step inside while loop body
	}
}
```

Do While Loops

```java
class Main {
	public static void main(String[] args) {
		int number = 5;
		int multipliier = 1;

		do{
			System.out.println("%d X %d = %d /n", number, multiplier, number * multiplier);
			multipler++;
		}while(multiplier <= 10);
			//same output, but the code is first ran and assested at the end.
			//backwards while loops
	}
}
```

## Array Lists (dynamic arrays)

- adding to and array list

```java
import java.util.ArrayList;
import java.util.Comparator;

class Main {
	public static void maini(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();

//int, double, float, booleans are primitive data types
//Integer is the reference type form for regular int type
	//also Boolean, Float, Double...

		// -----------------Add elements to ArrayList----------------------
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);

		System.out.println(numbers.toString()); // [1, 2, 3, 4, 5]
		System.out.println(numbers.get(2)); // 3

		// -----------------Remove elements to ArrayList (index)--------------
		numbers.remove(2); // [1, 2, 4, 5]

		// -----------------Remove elements to ArrayList (specific)---------
		numbers.remove(Integer.valueOf(4)); // [1, 2, 3, 5]

		// -----------------Clear elements in ArrayList -------------------
		numbers.clear();

		System.out.println(numbers.toString()); // [1, 2, 3, 4, 5]

		// -----------------Change elements in ArrayList -------------------
		numbers.set(2, Integer.valueOf(30)); // [1, 2, 30, 4, 5]
			// replaces number in the specified index spot

		// -----------------Sort ArrayList -------------------------------
		numbers.add(5);
		numbers.add(3);
		numbers.add(1);
		numbers.add(4);
		numbers.add(2);

		numbers.sort(Comparator.naturalOrder()); //sort by natural order
		System.out.println(numbers.toString()); // [1, 2, 3, 4, 5]

		numbers.sort(Comparator.reverseOrder()); //sort by natural order
		System.out.println(numbers.toString()); // [5, 4, 3, 2, 1]

		// ---------------------Size Method-------------------------------
		System.out.println(numbers.size()); // 5

		// ---------------------Contains Method---------------------------
		System.out.println(numbers.contains(Integer.valueOf(1))); // true
		System.out.println(numbers.contains(Integer.valueOf(10))); // false

		System.out.println(numbers.isEmpty()); // false

		// ---------------------Intimator Method--------------------------
		System.out.println(numbers.contains(Integer.valueOf(1))); // true
	}
}
```

### For Each Loop

```java
class Main {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);

		numbers.forEach(number -> {
			System.out.println(number * 2);
		});
			//

		System.out.println(numbers.toString()); // [2, 4, 6, 8, 10]

	}
}
```

```java
class Main {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);

		System.out.println(numbers.toString()); // [1, 2, 3, 4, 5]

		numbers.forEach(number -> {
			numbers.set(numbers.indexOf(number), number * 2);
		});
			// forEach method is able to change each element in array

		System.out.println(numbers.toString()); // [2, 4, 6, 8, 10]

	}
}
```

## Hash Maps

```java
import java.util.HashMap;

class Main {
	public static void main(String[] args) {
		HashMap<String, Integer> examScores = new HashMap<String, Integer>();
			// Objects need key value pairs so "String" is the key, "Integer" is value

		examScores.put("Math", 75);
		examScores.put("Sociology", 85);
		examScores.put("English", 95);
		examScores.put("Computer Programming", 100);
		examScores.put("Bengali", 100);

		System.out.println(examScores.toString());
			//{English=95, Sociology=85, Math=75...}
			// this is not sorted

		System.out.println(examScores.get("English")); // 95

		// ----------------putIfAbsent Method--------------------------
		examScores.putIfAbsent("Math", 70);
			//{English=95, Sociology=85, Math=75, Bengali=100, Computer Programming=100}
			// Math is still 75, but it will add if it doesn't exist

		// --------------------Replace Method--------------------------
		examScores.replace("Math", 70);
			//{English=95, Sociology=85, Math=70, Bengali=100, Computer Programming=100}

		// --------------get & getOrDefault Method----------------------------
		System.out.println(examScores.get("Religion")); // null

		System.out.println(examScores.getOrDefault("Religion", -1)); // -1
			// defaults a value

		// -----------------------clear method------------------------------
		examScores.clear();

		System.out.println(examScores.toString()); // {}

		// ----------------------------size Method------------------------
		System.out.println(examScores.size()); // 5 if not cleared

		// ----------------------------size Method------------------------
		examScores.remove("Sociology");

		System.out.println(examScores.toString());
			//{English=95, Math=70, Bengali=100, Computer Programming=100}

		// ----------------------------contains Method------------------------
		System.out.println(examScores.containsKey("Math")); // true

		System.out.println(examScores.containsValue(100)); // true
		System.out.println(examScores.containsValue(Integer.valueOf(100)));
			// true

		// -------------------------isEmpty Method--------------------------
		System.out.println(examScores.isEmpty()); // false
}
```

forEach in HashMaps

```java
import java.util.HashMap;

class Main {
	public static void main(String[] args) {
		HashMap<String, Integer> examScores = new HashMap<String, Integer>();
			// Objects need key value pairs so "String" is the key, "Integer" is value

		examScores.put("Math", 75);
		examScores.put("Sociology", 85);
		examScores.put("English", 95);
		examScores.put("Computer Programming", 100);
		examScores.put("Bengali", 100);

		exam.Scores.forEach((subject, score) -> {  //(key, value)
			System.out.println(subject + "-" + score);
		});
			// multiple args in anonymous functions need ()
			// prints out each key, value


		// --------------How to update hashmap?-------------------------
		examScores.forEach((subject, score) -> {
			examScores.replace(subject, score - 10);
			//remove 10 from each item in hashmap
		});

		System.out.println(examScores.toString());

	}
}
```

## Object Oriented Programming (OOP)

You need to practice this, you can't learn from a book easily.

Building a book borrowing system with OOP - user and book information - user: name, birthday - book: title, name or author ...

Create file called **User.java**

```java
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User { //need to make this user available in whole program
	public String name;
	public LocalDate birthDay;
	public ArrayList<Book> books= new ArrayList<Book>();

	// ------------for more dynamic calculation in age-------------------
	public int age() {
		int age = Period.between(this.birthDay, LocalDate.now().getYears());

		return age;
	}

	// -------------to track books that users have----------------
	public void borrow(Book book) { //void to show it doesn't return anything
		this.books.add(book);
	}
}
```

Create file called **Book.java**

```java
public class Book { //need to make this user available in whole program
	public String title;
	public String author;

	public String toString() {
		return String.format('%s by %s', this.title, this.author);
	}
}
```

In the **main.java** ....

```java
import java.time.LocalDate;

class Main {
	public static void main(String[] args) {
		User youngerUser = new User();

		youngerUser.name = "Ian McBee";
		youngerUser.birthDay = LocalDate.parse("1991-01-14");

		System.out.printf("%s was born back in %s", youngerUser.name, youngerUser.birthday.toString());
			//Ian McBee was born back in 1991-01-14


		// -----------to calcualte the age of the youndUser--------------
		System.out.printf("%s was born back in %s and he is %d years old.", youngerUser.name, youngerUser.birthday.toString(), youngUser.age);
			//Ian McBee was born back in 1991-01-14 and he is 31 years old.



		// ----------------making a new User-----------------------------
		User olderUser = new User();

		olderUser.name = "Terry McBee";
		olderUser.birthDay = LocalDate.parse("1957-08-08");

		System.out.printf("%s was born back in %s and he is %d years old.", olderUser.name, olderUser.birthday.toString(), olderUser.age);
			//Terry McBee was born back in 1957-08-08 and he is 65 years old.


		// -------------new class generation of "book"-------------------
		Book book = new Book();

		book.title = "Carmilla";
		book.author = "Book Author";

		youngUser.borrow(book);

		System.out.printf("%s was born back in %s and he is %d years old.", youngerUser.name, youngerUser.birthday.toString(), youngerUser.age);
			//Ian McBee was born back in 1991-01-14 and he is 31 years old.

		System.out.printf("%s has borrowed these books: %s", youngerUser.name, youngerUser.books.toString());
			//Ian McBee has borrowed these books: [Book@5b480cf9]
			// this is because we need a toString() method in the Book class
			// once we added the function toString() it will print...
				// Ian McBee has borrowed these books: [Carmilla by Book Author]
	}
}
```

### **!!!You should not declare your functions as public!!! Use Constructor**

    - Constructors allow for the data and info to be hidden when using "private" instead of "public"
    - This makes for cleaner code!

**User.java**

```java
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
	private String name; // use private to hide this information
	private LocalDate birthDay;
	private ArrayList<Book> books= new ArrayList<Book>();

	// -------------------------Constructor--------------------------------
	User(String name, String birthDay) {
		this.name = name;
		this.birthDay = LocalDate.parse(birthDay);
	}


	// -------------------to get private variables-------------------------
	public String getName() {
		return this.name;
	}

	public String getBirthDay() {
		return this.birthDay.toString(); // leverage the function to convert toString()
	}

	public String getBorrowedBooks() {
		return this.books.toString();
	}


//------------------------------------------------------------------------
	public int age() {
		int age = Period.between(this.birthDay, LocalDate.now().getYears());

		return age;
	}

	public void borrow(Book book) { //void to show it doesn't return anything
		this.books.add(book);
	}
}
```

**Book.java**

```java
public class Book { //need to make this user available in whole program
	private String title;
	private String author;

	// -----------------------Constructor----------------------------------------
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	// --------------------getTitle() & getAuthor()-----------------------------
	public String getTitle() {
		return this.title;
	}

	public String getAuthor() {
		return this.author;
	}

	public String toString() {
		return String.format('%s by %s', this.title, this.author);
	}
}
```

**Main.java**

```java
class Main {
	public static void main(String[] args) {
		User youngerUser = new User("Ian McBee", "1991-01-14");

		Book book = new Book("Carmilla", "Book Author");

		youngUser.borrow(book);

		System.out.printf("%s was born back in %s and he is %d years old.", youngerUser.getName, youngerUser.getBirthDay(), youngerUser.age);
			//Ian McBee was born back in 1991-01-14 and he is 31 years old.

		System.out.printf("%s has borrowed these books: %s", youngerUser.getName(), youngerUser.getBorrowedBooks();
			// Ian McBee has borrowed these books: [Carmilla by Book Author]
	}
}
```

### What if we had different types of books? E-books, pdf, audiobooks....

    - Inheritance:

the mechanism of basing an object or class upon another object or class, retaining similar implementation. Also defined as deriving new classes from existing ones such as super class or base class and then forming them into a hierarchy of classes.

    - Basically make a default book class and child book types that will inherit the default book types

**Book.java**

```java
public class Book { //need to make this user available in whole program
	private String title;
	private String author;
	private int pageCount;

	Book(String title, String author, int pageCount) {
		this.title = title;
		this.author = author;
		this.pageCount = pageCount;
	}

	public String getTitle() {
		return this.title;
	}

	public String getAuthor() {
		return this.author;
	}

	public String toString() {
		return String.format('%s by %s', this.title, this.author);
	}
}
```

**AudioBook.java**

```java
public class AudioBook extends Book { // add to extend from the book class
	private int runTime;

	AudioBook(String title, String author, int runTime) {
		super(title, author, 0);

		this.runTime = runTime;
	}

}
```

**EBook.java**

```java
public class EBook extends Book {
	private String format;

	EBook(String title, String author, int pageCount, String format) {
		super(title, author, pageCount);

		this.format = format;
	}

}
```

**Main.java**

```java
class Main {
	public static void main(String[] args) {
		Book book = new Book("Carmilla", "Book Author",  270);
		AudioBook dracula = new AudioBook("Dracula", "Bram Stoker", 30000);
		EBook jeeves = new EBook("Carry on Jeeves", "Someone", 280, "PDF");

		System.out.println(dracula.toString()); //Dracula by Bram Stoker
		System.out.println(jeeves.toString()); //Carry on Jeeves by Someone


	}
}
```

## Things you will still need to learn

- Method Overloading
- Method Overriding
- Abstract Method

Try to understand everything above and make programs

## Intro to Objects

Methods = anything you call an object or an instance of an object.

```java
String h = "hello";
h.length(); // returns the length of the string
	// length is a method
```

```java
public class Main {
	public static voif main(String[] args) {
		Scanner scanner = Scanner(System.in);
		//scanner.next();
		String h = "hello";
		h.length();

		ian("Ian", 4); //prints Ian 4 times

		System.out.println(add2(6)); // 8

		System.out.println(str("hi")); // hi!
	}

// this is also called as a function or ** method **
	public static void ian(String str, int x) { // void means that it won't return anything
		// we need to pass some information for this method which is a string = argument

		for(int i=0; i<x; i++) {
			System.out.println(str); // print out 4 times
		}


	}

// method to add2
	public static int add2(int x) {
		return x + 2;
	}

// method that adds an "!"
	public static String str(String x) {
		return x + "!";
	}
}
```

# Creating Classes

You need to create a new file to make a new class. A Class is a data type that is a blue-print for an object.

Method and Attributes dwell in a class - Attributes are variables within a class - Constructor build the model of a dog

**Dog.java**

```java
public class Dog {
	private String name; // private is only accessible to this class
	private int age;

	public Dog(String name, int age) {
		this.name = name; // this is referencing the attributes of the class
		this.age = age;
		add2();
		speak();
	}

// method for dog speaking
	public void speak() {
		System.out.println("I am " + this.name + " and I am " + this.age + " years old.");
	}

// getAge of Dog
	public int getAge() {
		return this.age;
	}

// setAge of Dog
	public void setAge(int age) {
		this.age = age;
	}

// add2 of Dog
	private int add2() { // this is not available in the Main class
		return this.age + 2;
	}
}
```

**Main.java**

```java
public class Main {
	public static void main(String[] args){
		Dog ian = new Dog("Ian", 4); // this is an ** instance ** of the object Dog
		ian.speak(); // I am Ian and I am 4 years old.
	}
}
```

# What does Static mean?

Protected:  
 Protected modifier specifies that the member can only be accessed within its own package (as with package-private) and, in addition, by a subclass of its class in another package.

**Dog.java**

```java
public class Dog {
	protected static int count = 0; // static variable allows to statically change the varible.

	protected String name;
	protected int age;

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		Dog.count += 1; // keeps track of how many dogs are on count
		Dog.display(); // prints out "I am a dog."
		this.display2(); // this will give an error asking to be changed to static
	}

// static methods
	public static void display() {
		// we use static if we don't care about the instance or attributes.
		System.out.println("I am a dog.");
	}

// making a method that isn't static
	public void display2() {
		System.out.println("I am a dog.");
	}
}
```

**Main.java**

```java
public class Main {
	public static void main(String[] args){
		Dog ian = new Dog("Ian", 4);
		Dog bill = new Dog("Bill", 4);

		System.out.println(Dog.count); // 2
	}
}
```

# Overloading Methods and Object Comparisons

**Student.java**

```java
public class Student implements Comparable<Student> {
	// set of methods to make the class	comparable
	private String name;

	public Student(String name) {
		this.name = name;
	}

// method to compare objects
	public boolean equals(Student other) {
		if(this.name == other.name) {
			return true;
		}else {
			return false;
		}
	}

// method to compare the names
	public int compareTo(Student other) {
		return this.name.compareTo(other.name);
			// going to compare names
	}

// print out name of student
	public String otString() P{
		return "Student(" + this.name + ")";
		// Java knows to print this without using toString()
	}
}
```

**Main.java**

```java
public class Main {
	public static void main(String[] args){
		Student joe = new Student("Joe");
		Student ian = new Student("Ian");
		Student bill = new Student("Bill");

		System.out.println(joe == bill); // false
			// joe and bill are separate objects in memory

		System.out.println(joe.equals(bill)); // true if bill = "joe"

		System.out.println(joe.compareTo(bill)); // 8
		System.out.println(joe.compareTo(bill) > 0); // true b/c j is further in the alphabet
		System.out.println(joe.compareTo(tim) > 0); // false b/c t is further in the alphabet
		System.out.println(joe.compareTo(tim)); // -10
		System.out.println(joe.compareTo(tim) < 0); // true

		// what if we want to print out tim?
		System.out.println(tim); // tutorial1.student@!5db9742 <- memory location of tim object
		System.out.println(tim); // Student(Tim)
	}
}
```

# Inner Classes

A class within a class
**OuterClass.java**

```java
public class OuterClass{
	%%private%% public class InnerClass { //change to public
		public void display() { // method within innerclass
			System.out.println("This is an inner class");
		}
	}

	public void inner() {
		InnerClass inner = new InnerClass();
		inner.display();
	}
}
```

**Main.java**

```java
public class Main {
	public static void main(String[] args){
		OuterClass out = new OuterClass();
		//out.inner(); // "This is an inner class"
		OuterCLass.InnerClass in = out.new InnerClass();

		in.display(); // "This is an inner class"

	}
}
```

## Create InnerClass within a method

**OuterClass.java**

```java
public class OuterClass{
	public void inner() {
		class InnerClass {
			public void display() {
				System.out.println("Inner Class");
			}
		}

		InnerClass inner = new InnerClass();
		inner.display();
	}
}
```

**Main.java**

```java
public class Main {
	public static void main(String[] args){
		OuterClass out = new OuterClass();
		out.inner(); // "Inner Class"

	}
}
```

# Interfaces

Unique to java and they are similar to class, but a different way to abstract [[Background - Abstract Classes]]

**Final**
Final is used to apply restrictions on class, method, and variable. The final class can't be inherited, final method can't be overridden, and final variable value can't be changed. Final is a keyword

**Vehicle.java**

```java
public interface Vehicle { // interface are abstract, they will be inherited from

	final int gears = 5; // makes them non-changeable (impossible to inherit or override)

	void speedUp(int a); // this defines the method to exist, but no use yet
	void slowDown(int a);
	void changeGear(int a);

// we can make a method that can work for the Car class
	default void out() {
		System.out.println("Default Method");

	}

// static method in interface
	static int math(int b){
		return b + 9;
	}

}
```

**Car.java**

```java
public class Car implements Vehicle{
	private int gear = 1;
	private int speed = 0;

	public void changeGear(int gear) {
		this.gear = gear;
	}

	public void speedUp(int change) {
		this.speed += change;
	}

	public void slowDown(int change) {
		this.speed -= change;
	}

	public void display() {
		System.out.println("I am a car, " + this.speed + "km/h and I am in gear " + this.gear);
		out();
	}
}
```

**Main.java**

```java
public class Main {
	public static void main(String[] args) {
		Car ford = new Car();
		ford.speeadUp(10);
		ford.changeGear(2);
		ford.display(); // I am a car, going 10km/h and I am in gear 2
			// with out(), it will print Default Method

// ----------------------------------------------------

		int x = Vehical.math(5);
		System.out.println(x); // 14
	}
}
```

You can have a separate class called "Math" to house all of your methods for math equations - Math.squareRoot()...

# Enums

A collection of **constants** to help with code being readable...
An `enum` is a special "class" that represents a group of **constants** (unchangeable variables, like `final` variables).

To create an `enum`, use the `enum` keyword (instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters:

### Example

```java
enum Level {
  LOW,
  MEDIUM,
  HIGH
}
```

You can access `enum` constants with the **dot** syntax:
Level myVar = Level.MEDIUM;

**Level.java**

```java
public enum Level {
	HIGH(3), // defining  enum with a value
	MEDIUM(2),
	LOW(1);

	private int lvlNum; // private variable for the enum

// method to assign enum
	private Level(int num) {
		this.lvlnum = num;
	}

// method for returning variable
	public int getLvl() {
		return this.lvlNum;
	}

// public method to set num to lvlNum
	public void setLvl(int num) {
		return this.lvlNum = num;
	}
}
```

**Main.java**

```java
public class Main {
	public static void main(String[] args) {
		Level lvl = Level.LOW;
		String en = lvl.toString(); // converts into a string
		Level[] arr = Level.values();

// print enum in a for loop
		for(Level e : arr) {
			System.out.println(e); // print out LOW, MEDIUM, HIGH
		}
		System.out.println(Level.values()); // prints out the memory

// enum is if statements
		if(lvl == Level.LOW) {
			System.out.println(lvl); // LOW
		}else if (lvl == Level.MEDIUM){
			System.out.println(lvl);
		}else {
			System.out.println(lvl);
		}

//--------------------------------------------------------------------------------

		Level lvl = Level.LOW;
		System.out.println(lvl.getLvl()); // 1
		System.out.println(Level.valueOf("LOW")); // LOW

		lvl.setLvl(5);
		System.out.println(lvl.getLvl()); // 5

	}
}
```
