# Lab Report 3: Searching Commands Options for grep

I chose to do web search on the options on command grep. 
The syntax for grep command is `grep <pattern/string> <file>`, and this command displays all the lines that contain the given pattern or string.
The command-line options I found were `-c`, `-l`, `-w`, and `-R`.


**`grep -c`**\
grep -c command prints the count of lines that contains the string or pattern that match the given string or pattern.

Example 1:\
I want to find the number of text file in written_2 which is inside the repository dosearch that I have cloned during the lab. 
During the lab, I didn't not know how to use the -c option of grep, so I stored the result of grep command into a file and then did the wc command to display the number of lines containing ".txt". However, using `grep -c` command, I can bypass the steps mentioned above and directly get a single number representing the number of text files in the directory:
```
bash-3.2$ find written_2 > result.txt
bash-3.2$ grep -c ".txt" result.txt
224
```
I first used find command to find all the files and directories inside written_2 and stored it in a file called result.txt. I then use `grep -c` to find the count of lines that contain ".txt" in result.txt, and this gives me 224 which is the number if text files.
  
Example 2:\
I want to find in how many lines the string "is" occurs in file ch14.txt:
```
bash-3.2$ grep -c "is" */*/*/*/ch14.txt
58
```
I used grep -c command and the "\*/\*/\*/\*/ch14.txt" is the pattern of the path of the file inside written_2. It returns 58, which means that "is" appears in 58 lines of the file.
  

**`grep -l`**\
Compared to `grep`, which only displays the lines that contains the given string in files, `grep -l` displays the name of the files that contains the given string when multiple files is provided.

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
I used `grep -l` and entered "Beijing" as the string to look for. \*/\*/berlitz2/\* tells it to look for all the file inside berlitz2. This command displays the name of 7 files that contain the string "Beijing".
  
Example 2:
I want to find the files in written_2 that contains the string "Bahamas":
```
bash-3.2$ grep -l "Bahamas" */*/*/* */*/*/*/*
grep: written_2/non-fiction/OUP/Abernathy: Is a directory
grep: written_2/non-fiction/OUP/Berk: Is a directory
grep: written_2/non-fiction/OUP/Castro: Is a directory
grep: written_2/non-fiction/OUP/Fletcher: Is a directory
grep: written_2/non-fiction/OUP/Kauffman: Is a directory
grep: written_2/non-fiction/OUP/Rybczynski: Is a directory
written_2/travel_guides/berlitz1/WhatToFWI.txt
written_2/travel_guides/berlitz2/Bahamas-History.txt
written_2/travel_guides/berlitz2/Bahamas-Intro.txt
written_2/travel_guides/berlitz2/Bahamas-WhatToDo.txt
written_2/travel_guides/berlitz2/Bahamas-WhereToGo.txt
written_2/travel_guides/berlitz2/Canada-WhereToGo.txt
```
I used `grep -l` and enter "Bahamas" as the string to look for, and \*/\*/\*/\* and \*/\*/\*/\*/\* are the pattern for all files in written_2. It displays the directories that contains the string first, and then it displays all the names of files that contain the string.
  
  
**`grep -w`**\
The `grep` command takes in the string and looks for all words that are either the string itself or contain the given string as a substring. This can be a problem when we want to find a certain word. For example, if I want to look for the word "an", the grep command will not only look for "an" but also words like "Canadian", "Indian", and "antibody", etc because these words contain the substring "an". The command-line option `-w` can solve this problem because it only matches the string as a whole word.

Example 1:
I want to know how many lines in ch14.txt contain the word "an":
```
bash-3.2$ grep -w -c "an" */*/*/*/ch14.txt
15
bash-3.2$ grep -c "an" */*/*/*/ch14.txt
63
```
I first used grep -w -c. -w searches "an" as a whole word, and -c counts the number of lines. This command gives the number 15, which means that in this file, there are 15 lines that contain "an" as a word. I then tried grep with only -c, and this displays 63, which is a number larger than 15. This means that the grep command without -w had counted every word that consists of "an" but not only "an" as a single word.
  
Example 2:
I want to find the lines in ch1.txt that contains the word "man":
```
bash-3.2$ grep -w "man" */*/*/*/ch1.txt
written_2/non-fiction/OUP/Fletcher/ch1.txt:Having barely won reelection midway in this slaughter, Abraham Lincoln could only say of the reign of terror, “Woe unto the world because of offences!” We had descended into the bloodiest war of our history without clear purposes or any understanding of how it might end. “For it must needs be that offences come; but woe to that man by whom the offence cometh!” The self-inflicted pogrom is seen as a “woe” and a “scourge” inflicted for the terrible “offence” of slavery. Lincoln’s second inaugural address prayed for redemption. The nation had bled its sins onto its own soil and craved a rebirth of American civilization.
written_2/non-fiction/OUP/Rybczynski/ch1.txt:Architecture is hard to define. Goethe called it music frozen in space, which, while it captures a sense of rhythm, is too one-dimensional. And it relegates the mother of the arts to an inferior position; just as well to describe music as melted architecture. Nietzsche believed that architecture reflected his pride, man’s triumph over gravity, and his will to power. This notion applies to many buildings, from Gothic cathedrals to skyscrapers, but it is too, well, Nietzschean. The British master Edwin Lutyens referred to architecture as a sort of play: “In architecture, Palladio is the game!” Le Corbusier described his art as “the masterly, correct and magnificent play of masses brought together in light,” which is a good description of one of his own buildings. I am partial to Sir Henry Wotton’s definition. Wotton, who lived a long time in Venice and was a lover of architecture though not an architect, published a treatise on the subject in 1642. “In Architecture, as in all other Operative Arts, the end must direct the Operation,” he wrote. “The end is to build well. Well-building hath three conditions: Commoditie, Firmeness, and Delight.”
```
I used grep -w command, and it shows that the word "man" only appears in two sentences in the file. It displays the text that contains the word.
  
  
**grep -R**\
This command search for a string recursively in a directory.
 
Example 1:
I want to find out which file contains the word "Lucayans" in written_2 directory:
```
bash-3.2$ grep -R "Lucayans" written_2
written_2/travel_guides/berlitz2/Bahamas-History.txt:Centuries before the arrival of Columbus, a peaceful Amerindian people who called themselves the Luccucairi had settled in the Bahamas. Originally from South America, they had traveled up through the Caribbean islands, surviving by cultivating modest crops and from what they caught from sea and shore. Nothing in the experience of these gentle people could have prepared them for the arrival of the Pinta, the Niña, and the Santa Maria at San Salvador on 12 October 1492. Columbus believed that he had reached the East Indies and mistakenly called these people Indians. We know them today as the Lucayans. Columbus claimed the island and others in the Bahamas for his royal Spanish patrons, but not finding the gold and other riches he was seeking, he stayed for only two weeks before sailing towards Cuba.
written_2/travel_guides/berlitz2/Bahamas-History.txt:The Spaniards never bothered to settle in the Bahamas, but the number of shipwrecks attest that their galleons frequently passed through the archipelago en route to and from the Caribbean, Florida, Bermuda, and their home ports. On Eleuthera the explorers dug a fresh-water well — at a spot now known as “Spanish Wells” — which was used to replenish the supplies of water on their ships before they began the long journey back to Europe with their cargoes of South American gold. As for the Lucayans, within 25 years all of them, perhaps some 30,000 people, were removed from the Bahamas to work — and die — in Spanish gold mines and on farms and pearl fisheries on Hispaniola (Haiti), Cuba, and elsewhere in the Caribbean.
```
I used grep -R and I directly type written_2 and it look for the string in every file in this directory so that I don't have to try out with every single file name.
  
Example 2:
I want to find out which file in written_2 contains the string "Kitano Temmangu shrine":
```
bash-3.2$ grep -R "Kitano Temmangu shrine" written_2
written_2/travel_guides/berlitz1/WhatToJapan.txt:        each month) and at Kitano Temmangu shrine (25th), but there are many
```
The command takes in the given string and compares it to all the text of the files in written_2. It returns the name of the file and a part of the text that includes the string.
  
**Citation:** All the information was found on this website (https://www.geeksforgeeks.org/grep-command-in-unixlinux/).
