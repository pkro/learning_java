# Learning Java notes

## Data types in java

### Primitive types
	- Boolean
	- int
	- double
	- char (enclosed with ')
	
### Reference Types
	- String: sequence of ordered characters (enclosed with ")

Variables are block ({}) scoped

Java's array and foreach notation

		int[] choices = { 1, 2, 3 };
		for (int i : choices) {
			prtNum.accept(i);
		}

## Function references

		import java.util.function.Consumer;
    		[...]
			String question = "What is 2+5?";

			final Consumer<String> prtStr = str -> System.out.println(str);
			prtStr.accept(question);
