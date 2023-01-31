# How to Log into a Course-specific Account on ieng6?

**Part 1: Installing VScode**\
I went to the Visual Studio Code website([Link](https://code.visualstudio.com)) and downloaded it to my computer.
I saw the picture below when I opened the downloaded Visual Studio Code.

![Image](lab1 vscode.png)


**Part 2: Remotely Connecting**\
I opened a terminal on VScode and typed in the command line:$ ssh UserNameofCourseSpecificAccount@ieng6.ucsd.edu
It asked for the password of my account. After I put in my password, big blocks of notice popped out and that means that I had successfully connected to the remote server. The whole process looked like this:

![Image](lab1 connecting.png)
Notice that to log out of the remote server, I typed in the command $ exit


**Part 3: Trying Some Commands**\
I tried some commands while logged in the remote server:
- "cd" changed directory.
- "cd ~" the "~" symbol represented home directory, so the whole command line changed the current directory to home diretory.
- "ls -lat" listed all the contents of the directory I was at, which showed that I have 128 in total.
- "cp /home/Linux/ieng6/cs15lwi23/public/hello.txt ~/" changed the directory to the file called hello.txt.
- "cat /home/Linux/ieng6/cs15lwi23/public/hello.txt ~/" printed out the content in the file hello.txt.

![Image](lab 1 command1.png)

I also tried some commands after logging out of the remote server:
- "cd" changed directory.
- "cd ~" changed the directory to home directory.
- "ls -lat" listed all the contents of directory I was at, which showed that I have 120 in total.
- "ls -a" listed all contents in the current directory.

![Image](lab 1 command2.png)
