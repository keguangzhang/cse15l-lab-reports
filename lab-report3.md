# Lab Report 3: Searching Commands Options for grep

I chose to do web search on the options on command grep. 
The syntax for grep command is grep <pattern/string> <file>, and this command displays all the lines that contain the given pattern or string.
The command-line options I found were -c, 

**grep -c**\
grep -c command prints the count of lines that contains the string or pattern that match the given string or pattern.
https://www.geeksforgeeks.org/grep-command-in-unixlinux/\

Example 1:\
I want to find the number of text file in written_2 which is inside the repository dosearch that I have cloned during the lab. 
During the lab, I didn't not know how to use the -c option of grep, so I stored the result of grep command into a file and then did the wc command to display the number of lines containing ".txt". However, using grep -c command, I can bypass the steps mentioned above and directly get a single number representing the number of text files in the directory:
```
bash-3.2$ find written_2 > result.txt
bash-3.2$ grep -c ".txt" result.txt
224
```
I first used find command to find all the files and directories inside written_2 and stored it in a file called result.txt. I then use grep -c to find the count of lines that contain ".txt" in result.txt, and this gives me the number if text files.
  
Example 2:\

