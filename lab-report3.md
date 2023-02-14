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
I first used find command to find all the files and directories inside written_2 and stored it in a file called result.txt. I then use grep -c to find the count of lines that contain ".txt" in result.txt, and this gives me 224 which is the number if text files.
  
Example 2:\
I want to find in how many lines the string "is" occurs in fiel ch14.txt:
```
bash-3.2$ grep -c "is" */*/*/*/ch14.txt
58
```
I used grep -c command and the "*/*/*/*/ch14.txt" is the pattern of the path of the file inside written_2. It returns 58, which means that "is" appears in 58 lines of the file.
  

**grep -l**\
This command-line option displays the name of the files that contains the given string when multiple files is provided while using grep command.

Example 1:
I want to find which files in berlitz2 contains the string "Beijing":
```
bash-3.2$ grep -l "Beijing" */*/berlitz2/*
written_2/travel_guides/berlitz2/Beijing-History.txt
written_2/travel_guides/berlitz2/Beijing-WhatToDo.txt
written_2/travel_guides/berlitz2/Beijing-WhereToGo.txt
written_2/travel_guides/berlitz2/China-History.txt
written_2/travel_guides/berlitz2/China-WhatToDo.txt
written_2/travel_guides/berlitz2/China-WhereToGo.txt
written_2/travel_guides/berlitz2/Cuba-WhereToGo.txt
```
I used grep -l and entered "Beijing" as the string to look for. */*/berlitz2/* tells it to look for all the file inside berlitz2. This command displays the name of 7 files that contain the string "Beijing".
  
Example 2:



