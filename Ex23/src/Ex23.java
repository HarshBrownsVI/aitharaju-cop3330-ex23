/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sriharsha Aitharaju
 */
import java.util.*;
public class Ex23
{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String silent, corroded, noise, engine, fuel, crank;
        System.out.print("Is the car silent when you turn the key?");
        silent = kb.next();
        if(silent.equals("y"))
        {
            System.out.print("Are the battery terminals corroded?");
            corroded = kb.next();
            if(corroded.equals("n"))
                System.out.print("Replace cables and try again.");


        }
        else
        {
            System.out.print("Does the car make a slicking noise?");
            noise = kb.next();
            if(noise.equals("yes"))
                System.out.print("Replace the battery");
            else
            {
                System.out.print("Does the car crank up but fail to start?");
                crank = kb.next();
                if(crank.equals("y"))
                    System.out.print("Check spark plug connections");
                else
                {
                    System.out.print("Does the engine start and then die?");
                    engine = kb.next();
                    if(engine.equals("y"))
                    {
                        System.out.print("Does you car have fuel injection?");
                        fuel = kb.next();
                        if(fuel.equals("y"))
                            System.out.print("Get it in for service.");
                        else
                            System.out.print("Check to ensure the choke is opening and closing.");
                    }
                    else
                    {
                        System.out.print("This should not be possible.");
                    }

                }
            }
        }
    }
}