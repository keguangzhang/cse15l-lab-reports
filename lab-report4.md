# Lab Report 4

**Step 4: log into ieng6**\
![Image](step 4.png)
For this step, since the command to log into the account was already in my history, I typed `Ctrl-R` and then typed `ssh` to get the whole command with my ieng6 account from the history. I then entered `<enter>`. It directly logged into the ieng6 account without asking for my password because I had generated SSH keys before this.

**Step 5: clone the fork of the repository from Gitnub account**\
![Image](step 5.png)
I copied the SSH link from the my fork of the repository on Github. On the terminal, I typed `git clone <link>`. To paste the link, I did `Ctrl-V`. The repository was successfullly cloned to the ieng6 remote server. 

**Step 6: run the tests, demonstrating that they fail**\
![Image](step 66.png)
I first typed `cd lab7` to change my directory into lib7 directory.\ 
To compile ListExample.java and ListExampleTests.java files, I typed `Ctrl-R` to get access to my commmand history. I then typed `javac`, and I found the command for compiling, which was `javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java`. I then pressed `<enter>`, and the files was successfully compiled.\
To run the files, I typed `Ctrl-R` to get access to my commmand history. I then typed `lib`, and I found the command for compiling, which was `java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore ListExamplesTests`. I then pressed `<enter>`, and the files was successfully runned. It showed that one it failed on one test.
  
**Step 7: Edit the code file to fix the failing test**\
I typed `nano Li<tab>`, and it autocompleted `nano ListExamples`. I added `.java` to complete the command. This command took me into ListExmaples.java file where I changed the code for merge() method into:
![Image](step 7.png)
I used `<up>` and `<down>` to move my cursor up and down when editing the code. 
  
**Step 8: Run the tests, demonstrating that they now succeed**\
After finishing editing the code, in nano, I pressed `Ctrl-O <enter>` to save the edit and then `Ctrl-X` to exit nano. 
I typed `<up><up><up><enter>` to compile the files again because the compile command was three up in the history, and I then typed `<up><up><up><enter>` again to run the files. It shown that the code successfully passed the tests:
![Image](step 8.png)

**Step 9: commit and push the resulting change to the Github account**\
To commit the change, I typed `git commit Li<tab>.java -m "Edited"`. The <tab> autocompleted ListExamplesTests, and the `-m "Edited"` added "Edited" as the commit message. The full command was `git commit ListExamples.java -m "Edited"`.
To push the change, I typed `git push origin`, and it shown this:
![Image](step 9.png)
