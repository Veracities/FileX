package File;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class filetrans {

  public static void main(String[] args) {
    System.out.println("Welcome to FileTransfer!");
    filetrans ft = new filetrans();
    String path = ft.getPath(0);
    int port = ft.getPort();
    
    fileserver fileServer = new fileserver(port, path);
    fileclient fileClient = new fileclient(port, path);
    
    
  }
  
  private String getPath(int option) {
    String path = "";
    Scanner read = new Scanner(System.in);
    if (option == 0) {
      System.out.print("Please Enter the path of the file: ");
    }
    else if (option == 1){
      System.out.print("Please enter the path of the destination: ");
    }
    path = read.nextLine();
    
    
    read.close();
    return path;
  }
  
  private int getPort() {
     int port = 0;
     Scanner read = new Scanner(System.in);
     
     //System.out.println("Please Enter the port number: ");
     port = 5555;//Integer.parseInt(read.nextLine());
     
     read.close();
     return port;
  }
  
}