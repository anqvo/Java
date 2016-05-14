Dr. Summa,

	The JAVA files I have included in my Homework2 submission are:
		Recursion.java
		RecursionTest.java
		JunitRunner.java
		
		RecursionRunner.java
		
	RecursionRunner has a main method which you may compile and run if you like. I felt
	it would help make your testing go easier since it allows you to type your own Strings
	and integers freely, rather than editing the values in the Junit test.
	However, please! Test both.
	
	

to compile:
javac -cp ./junit-4.12.jar Recursion.java RecursionTest.java JunitRunner.java RecursionRunner.java

to run:
java -cp .:./junit-4.12.jar:./hamcrest-all-1.3.jar JunitRunner

OR

java RecursionRunner
