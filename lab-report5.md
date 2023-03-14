# Lab Report 5: Command Options 
For lab report 3, I did research on options of `grep` command. I am contiuing exploration for more options for the `find` command.\
The find command searches through a file hierarchy and can take in name of files to do operations on files and directories. \
The syntax for find command is `find <directory to start the search from> <-options> <target file or directory>`.

**`find -empty`**
Syntax: `find <directory to start the search from> -empty`\
This option takes in a directory and searches and returns all the empty folders and files under the given dierectory. Here is am example:
```
Keguangs-MacBook-Pro:docsearch amy$ find ./written_2 -empty
Keguangs-MacBook-Pro:docsearch amy$ cd written_2
Keguangs-MacBook-Pro:written_2 amy$ mkdir emptyFolder
Keguangs-MacBook-Pro:written_2 amy$ find ./ -empty
.//emptyFolder
```
Originally, there isn't empty file or folder inside `written_2` directory, so the first time I enter `find ./written_2 -empty`, which tells the terminal to search for files or folders that are empty inside `written_2`, it doesn't give back anything. I then changed my directory into `written_2` and made a empty folder called `emptyFolder`. I then typed in the `find ./ -empty` command, which tells the terminal to look for empty folder in the current direcory, and it displays the emptyFolder thta I just made.

Here is another example:
```
Keguangs-MacBook-Pro:written_2 amy$ cd non-fiction/OUP/Abernathy
Keguangs-MacBook-Pro:Abernathy amy$ touch emptyFile.txt
Keguangs-MacBook-Pro:docsearch amy$ find ./written_2 -empty
./written_2/non-fiction/OUP/Abernathy/emptyFile.txt
./written_2/emptyFolder
```
I created an empty text file inside `written_2/non-fiction/OUP/Abernathy` called `emptyFile.txt`. When I do `find ./written_2 -empty` again, this time, it displays both `emptyFolder` and `emptyFile.txt` and their pathways in written_2.

**`find -delete`**
Syntax: `find <directory> -name <file name>`\
This command option can find and delete the given files in the directory. Here is an example:
```
Keguangs-MacBook-Pro:docsearch amy$ find ./written_2 -name emptyFile.txt -delete 
Keguangs-MacBook-Pro:docsearch amy$ find ./written_2 -empty
./written_2/emptyFolder
```
I first typed `find ./written_2 -name emptyFile.txt -delete` to delete the empty file called `emptyFile.txt` that I just added in the last example. `-name`looks for the file of the given name. To check if the file has been deleted successfully, I typed `find ./written_2 -empty`. This only shown the `emptyFolder`, which means that `emptyFile.txt` has been deleted, otherwise both `emptyFolder` and `emptyFile.txt` would show up because they are empty.

Here is another example where this command delete the whole subdirectory:
```
Keguangs-MacBook-Pro:docsearch amy$ find ./written_2 Berk -delete
Keguangs-MacBook-Pro:docsearch amy$ find ./written_2-name Berk
find: ./written_2-name: No such file or directory
find: Berk: No such file or directory
```
I first typed `find ./written_2 Berk -delete` to delete the subdirectory called `Berk` inside `written_2`. To check if the subdirectory have been deleted, I then typed `find ./written_2-name Berk`, and it shows that there is no directory call `Berk` in `written_2` anymore.



