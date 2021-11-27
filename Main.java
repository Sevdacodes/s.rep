package com.company;

import Management.Admin;
import Management.Customer;
import Management.SalesCounter;
import Management.User;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) throws IOException {
    //LogHandler logHandler=new LogHandler();
   Logger logger=LogHandler.LogHandler();
   logger.info("***start....");
        Scanner input= new Scanner(System.in);

        try{
       SalesCounter salesCounter=new SalesCounter();
        System.out.println("admin log in to Manage:");
        User mainUser = salesCounter.callUser((Path.of("Admin.csv")));
        salesCounter.show(Path.of("ticket.csv"));
            logger.info("hi"+mainUser.getName()+"!  do you want set eny new event ?(y/n)");
            String answer=input.nextLine();
            if(answer.equalsIgnoreCase("y")){
        mainUser.setNewevent();}
        System.out.println("log in and then take ticket");
        mainUser=salesCounter.callUser(Path.of("User.csv"));

        mainUser.buyTicket();}
        catch (Exception e){
            logger.warning("main erorr!!");
        }
    }
}
