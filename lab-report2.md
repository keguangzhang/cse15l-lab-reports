# Lab Report 2: Web Server and Debugging

**Part 1: Web Server\

I created a web server that can take in a request of string and show the string along with the previous strings on the web pages.
The requests look like this: /add-message?s=<string>, and the <string> will be displayed on the web pages.

Here is my code:
  
  import java.io.IOException;
  import java.net.URI;
  
  class Handler implements URLHandler{
      String previousMessage = "";
  
      public String handleRequest(URI url) {
    
          if (url.getPath().contains("/add-message")) {
              String []strings = url.getQuery().split("=");
              if (strings[0].equals("s")) {
                  String message = strings[1] + "\n";
                  this.previousMessage = previousMessage.concat(message);
                  return previousMessage;
              }
            
          }
          return "404 Not Found!";
      }
  }
  
  class StringServer {
      
      public static void main(String[] args) throws IOException {
          
          if(args.length == 0){
              System.out.println("Missing port number! Try any number between 1024 to 49151");
              return;
          }

          int port = Integer.parseInt(args[0]);

          Server.start(port, new Handler());
      }
  }
  
  
Note: The interface URLHandler is already impemented in the wavelet repository that we were asked to forked in lab 2. The code of the class StringServer is copied from the class NumberServer in the wavelet repository.
  
  
I started the server, and I first tried to let the string "Hello" be displayed on the page:
![Image] ()
  
I then changed the string into "how are you", and both "Hello" and "how are you" were displayed on the page:
![Image] ()
