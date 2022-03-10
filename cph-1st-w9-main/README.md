# cph-1st-w9

Today's tasks will require you to copy the code and data in this repository. You can do this two ways (2 is probably the easiest): 
1. by downloading this repository, unzipping it and then open the directory in IntelliJ using the "Open Project" option. This might require you to set up SDK, which the red/yellow light bulb can help you with if you move your cursor to the main method declaration. 

2. Copy the content of the main.java and replace your own main.java in your already working project. Download/Copy the data.txt file and place it in the project root directory (next to the src folder). 

Test that the main runs, and prints the number 333 followed by the output of the two methods: 
        printWordsStartingWith("Ø");
        printWordsOfLength(3);
        
Now you must add more methods 


## Task 1:
Create a method called printLongestWord() that prints the longest of all the words in the text variable. 

Hints:
- Have it loop through each word in the ```text``` variable (see implementation of the two methods mentioned above for reference). 
- Have a counter that counts the length of each word and resets afterwards. 
- Have a String variable called "longestWord", that has its value overwritten in case of a longer word found. 
 

printWordsWithLessThanTwoVocals(); 

## Task 2: 
Create a method called printFirstHalfOfEachWord() that uses substring to print the first half of all words in the ```text``` variable. 

Hints: 
- Use the .substring() method along with the s.length


## Task 3: 
Create a method called printMostFrequentLetter() that prints the most frequent found letter in the ```text``` variable. 

The method must print both the actual letter as well as the times it occurred. 

Bonus for printing a top 10. 


## Task 4: 
Exactly the same as task 3 - but instead of _most_ frequent, then _less_ frequent. 
So create a method called printLessFrequentLetter(). 

again - bonus for printing top 10. 



## Task 5: [NOT TO BE HANDED IN] 

Get started on your "Cheat-sheet-project" (Exam preperation) as we talked about yesterday. 

- Start a new project in intelliJ called something along the line of "DAT1-Java-CheatSheet"
- Create a new package by right-clicking the "src" directory -> new -> Package. Call it "Loops"
- Add a class to this new package, by right-clicking -> new -> Java Class, and call it "ForLoopsExamples"
- In the LoopsExamples class, create a method that runs a for loop from 0 to 100, printing all numbers.
- Add another method, that using a for loop prints all even numbers between 0 and 100. 

This project is not mandatory, but I encourage you to work on it individually. 
Not only will it be great help for you at the exams, but it will also help you structuring all you have learned, along with refining your skills. 

You are solely responsiple for the further development of this project. 
You should not hand in this last task. 


