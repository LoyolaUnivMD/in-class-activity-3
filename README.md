# Lab 0 -- Getting Started with Java and Git

40 points			

## Purpose:  

This assignment aims to ease you into Java programming experience using IntelliJ,  an Interactive Development Environment (IDE).

This assignment will give you a chance to practice the following:

1. Collaborating with your classmate by using pair programming
2. Sharing code through Github.
3. Learning about ASCII art

## Problem: 

Write a simple Java program that prints out your initial in the form of ASCII art similar to the one shown here: https://www.asciiart.eu/

### Details: 

You will write your program in the “pair programming” mode -- one of you is the driver while the other is the navigator.  Once the first driver has written the println statements to print out their partner’s initial (i.e., HB) in ASCII art form, switch roles. Remember that the navigator (e.g., the person who is not currently the driver) is helping determine what code should be written. I recommend sketching it out on paper first.

It is assumed that you have both already clicked on the link on Moodle to get access to your Lab0 repository. The first person created the team name (last names of participants), and the second person joined that team.

Your team can decide who would be the driver and the navigator first. Then, you can switch the roles later.

### Steps:

#### Driver 1 Writes Code:

1. CLONE REPOSITORY: Open IntelliJ and follow the steps in the “Get a repository from Git to IntelliJ” guide under "Setting Up Your Computer to Use Java JDK, IntelliJ and Git” on Moodle. 

2. STARTER FILE: A single .java file exists in the repository (HelloWorld.java). Compile and run your program. It should print out Hello, World!. Refer to the guide from the last step if you have any problems.

3. CODE: You must modify the println statement and add other println statements to print out your partner’s initial. Again, I highly recommend sketching the letters out on paper first.

4. RUN and TEST: Run your program by clicking on the “Run” menu, then choosing “Run” from the drop down menu or use the Run button. Look at the output at the bottom of IntelliJ. Does it appear the way you want? If not, or if instead you see an error, try to fix your code so that it does what you want (you will need to run again afterward). One of the errors you may encounter is “java: illegal escape character.” If you have \ (backslash) in your println statement, you need to put another one in front of it: \\.

5. CONTINUE CODING: repeat step 4 until you are happy with the result.

6. COMMIT AND PUSH: Commit and push your code to github.com. Follow the directions in the “GitHub Quick Guide” document for “Saving Your Work.”

Now, you can switch roles.

#### Driver 2 Writes Code

7. CLONE or PULL: It is now driver 2's turn to write the code. They should first Clone the Repository if they haven't already. If you cloned the repository before Driver #1 committed and pushed the code, you will need to update your local repository by using the blue arrow on the top menu (Next to Git:)

8. CONTINUE CODING: You should see the changes your partner made in HelloWorld.java. It is now time to write code to print out your partner’s initial. Repeat steps 3,4 and 5 until you are happy with the result.

9. COMMENT: Comments are part of the programming in general. You should always put comments in your code code. They are used to explain how the code works to human readers.  Once your program runs properly, add introductory comments at the very top of your file that match the ones below but are edited to be personalized to you and your partner. Use // to add comments to your code.

```
  // Programmers:  your name here
  // Course:  CS 212, Dr. Cui  
  // Due Date: 1/19/24
  // Lab Assignment: 0
  // Problem Statement:  Output programmers’ initial
  // Input: None; there is no user input in this program
  // Output:  The initials of the programmers in ASCII art form
  // Credits: [Is your code based on an example in the book, in class, or something else?  
  //            Reminder: you should never take code from the Internet or another person
```
10.  COMMIT AND PUSH: Commit and push your code to github.com. Follow the directions in the “GitHub Quick Guide” document for “Saving Your Work.”


Quick note:
If you are done,  show your program running and on GitHub to the professor before leaving the classroom.

You can earn bonus points by showing your creativity.

### What to Submit:

1.	Commit & Push your repository to GitHub. It should include a HelloWorld.java with all the code you write and the introductory comments at the very top. You can go to GitHub.com to check that it worked.

