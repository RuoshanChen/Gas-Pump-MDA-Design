package Main;

import AbstractFactory.*;
import GasPump.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class GasPumpDriver {
    public static void main(String[] args) {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Select type of GasPump: ");
        System.out.println("1. GasPump1");
        System.out.println("2. GasPump2");
        System.out.print("> ");

        int pump_type;
        String input = "initial";
        try {
            pump_type = Integer.parseInt(scan.readLine());
            switch (pump_type) {
                case 1: {
                    ConcreteFactory1 cf1 = new ConcreteFactory1();
                    GasPump1 gp1 = new GasPump1(cf1);
                    System.out.println(
                            "GasPump-1 " +
                                    "\nMENU of Operations: " +
                                    "\n-------------------------" +
                                    "\n(0) Activate(float a, float b) " +
                                    "\n(s) Start " +
                                    "\n(1) PayCredit " +
                                    "\n(2) PayDebit" +
                                    "\n(3) Pin" +
                                    "\n(4) Continue" +
                                    "\n(5) Approve " +
                                    "\n(6) Reject" +
                                    "\n(7) Regular " +
                                    "\n(8) Diesel " +
                                    "\n(9) Cancel " +
                                    "\n(10) StartPump " +
                                    "\n(11) PumpGallon " +
                                    "\n(12) StopPump" +
                                    "\n(13) FullTank" +
                                    "\n{q} Quit the program" 
                                   
                    );
                    while (!input.equals("q")) {
                        gp1.printOperations();
                        input = scan.readLine();
                        switch (input) {
                            case "0": { // Activate
                                System.out.println(">Activate<");
                                float a, b;
                                System.out.println("Enter the price parameter a: ");
                                try {
                                    a = Float.parseFloat(scan.readLine());
                                    System.out.println("Enter the price parameter b: ");
                                    b = Float.parseFloat(scan.readLine());
                                    gp1.Activate(a, b);
                                } catch (NumberFormatException e) {
                                    System.out.println("Type mismatch. Price must be a float.");
                                }
                                break;
                            }
                            case "s": { // Start
                                System.out.println(">Start<");
                                gp1.Start();
                                break;
                            }
                            case "1": { // PayCredit
                                System.out.println(">PayCredit");
                                gp1.PayCredit();
                                break;
                            }
                            case "2": { // PayDebit 
                                System.out.println(">PayDebit<");
                                System.out.println("Enter your pin: ");
                                String pin;
                                pin = scan.readLine();
                                gp1.PayDebit(pin);
                                break;
                            }
                            case "3": { // Pin
                                System.out.println(">Pin<");
                                System.out.println("Enter your pin: ");
                                String pin;
                                pin = scan.readLine();
                                gp1.Pin(pin);
                                break;
                            }
                            case "4": { // Continue
                                System.out.println(">Continue<");
                                gp1.Continue();
                                break;
                            }
                            case "5": { // Approve
                                System.out.println(">Approve<");
                                gp1.Approve();
                                break;
                            }
                            case "6": { // Reject
                                System.out.println(">Reject<");
                                gp1.Reject();
                                break;
                            }
                            case "7": { // Regular
                                System.out.println(">Regular<");
                                gp1.Regular();
                                break;
                            }
                            case "8": { // Super
                                System.out.println(">Super<");
                                gp1.Diesel();
                                break;
                            }
                            case "9": { // Cancel
                                System.out.println(">Cancel<");
                                gp1.Cancel();
                                break;
                            }
                            case "10": { // StartPump
                                System.out.println(">StartPump<");
                                gp1.StartPump();
                                break;
                            }
                            case "11": { // PumpGallon
                                System.out.println(">PumpGallon<");
                                gp1.PumpGallon();
                                break;
                            }
                            case "12": { // StopPump
                                System.out.println(">StopPump<");
                                gp1.StopPump();
                                break;
                            }
                            case "13": { // FullTank
                                System.out.println(">FullTank<");
                                gp1.FullTank();
                                break;
                            }
                            case "q": { // Quit
                                break;
                            }
                            default: { // Anything else: unknown / unsupported operation
                                System.out.println("Unknown operation: '" + input + "'");
                                System.out.println("Please select a valid operation");
                                break;
                            }
                        }
                    } // End while loop
                    System.out.println("Quitting ...");
                    break;
                } // End pump_type = 1 case
                case 2: {
                    ConcreteFactory2 cf2 = new ConcreteFactory2();
                    GasPump2 gp2 = new GasPump2(cf2);
                    System.out.println(
                            "GasPump-2 " +
                                    "\n-------------------------" +
                                    "\nMENU of Operations: " +
                                    "\n(0) Activate (float a, float b,float c)" +
                                    "\n(s) Start" +
                                    "\n(1) PayCash" +
                                    "\n(2) PayCredit" +
                                    "\n(3) Approved" +
                                    "\n(4) Cancel" +
                                    "\n(5) Reject" +
                                    "\n(6) Regular " +
                                    "\n(7) Super " +
                                    "\n(8) Premium " +
                                    "\n(9) Continue" +
                                    "\n(10) StartPump" +
                                    "\n(11) PumpLiter" +
                                    "\n(12) Stop " +
                                    "\n(13) PrintReceipt" +
                                    "\n(14) NoReceipt" +
                                    "\n(q) Quit the program" 
                    );
                    while (!input.equals("q")) {
                        gp2.printOperations();
                        input = scan.readLine();
                        switch (input) {
                            case "0": { // Activate
                                System.out.println(">Activate<");
                                float a, b, c;
                                System.out.println("Enter the price parameter a: ");
                                try {
                                    a = Float.parseFloat(scan.readLine());
                                    System.out.println("Enter the price parameter b: ");
                                    b = Float.parseFloat(scan.readLine());
                                    System.out.println("Enter the price parameter c: ");
                                    c = Float.parseFloat(scan.readLine());
                                    gp2.Activate(a, b, c);
                                } catch (NumberFormatException e) {
                                    System.out.println("Type mismatch. Price must be a float.");
                                }
                                break;
                            }
                            case "s": { // Start
                                System.out.println(">Start<");
                                gp2.Start();
                                break;
                            }
                            case "1": { // PayCash
                                System.out.println(">PayCash<");
                                System.out.println("Insert cash (enter $ amount): ");
                                try {
                                    float cash = Float.parseFloat(scan.readLine());
                                    gp2.PayCash(cash);
                                } catch (NumberFormatException e) {
                                    System.out.println("Type mismatch.");
                                }
                                break;
                            }	
                            case "2": { // PayCredit
                                System.out.println(">PayCredit<");
                                gp2.PayCredit();
                                break;
                            }
                            case "3": { // Approved 
                                System.out.println(">Approved<");
                                gp2.Approve();
                                break;
                            }
                            case "4": { // Cancel
                                System.out.println(">Cancel<");
                                gp2.Cancel();
                                break;
                            }
                            case "5": { // Reject1
                                System.out.println(">Reject<");
                                gp2.Reject();
                                break;
                            }
                            case "6": { // Regular
                                System.out.println(">Regular<");
                                gp2.Regular();
                                break;
                            }
                            case "7": { // Super
                                System.out.println(">Super<");
                                gp2.Super();
                                break;
                            }
                            case "8": { // Premium
                                System.out.println(">Premium<");
                                gp2.Premium();
                                break;
                            }
                            case "9": { // Continue
                                System.out.println(">Continue<");
                                gp2.Continue();
                                break;
                            }
                            case "10": { // Start pump
                                System.out.println(">StartPump<");
                                gp2.StartPump();
                                break;
                            }
                            case "11": { // PumpLiter
                                System.out.println(">PumpLiter<");
                                gp2.PumpLiter();
                                break;
                            }
                            case "12": { // Stop
                                System.out.println(">Stop<");
                                gp2.Stop();
                                break;
                            }
                            case "13": { // PrintReceipt
                                System.out.println(">PrintReceipt<");
                                gp2.Receipt();
                                break;
                            }
                            case "14": { // NoReceipt
                                System.out.println(">NoReceipt<");
                                gp2.NoReceipt();
                                break;
                            }
                            case "q": { // Quit
                                break;
                            }
                            default: { // Anything else: unknown / unsupported operation
                                System.out.println("Unknown operation: '" + input + "'");
                                System.out.println("Please enter a valid operation");
                                break;
                            }
                        }
                    } // End while loop
                    System.out.println("Quitting ...");
                    break;
                } // end pump_type = 2 case
                default: {
                    System.out.println("Unknown GasPump selection. Exit program.");
                    System.exit(1);
                }

            }
        } catch (IOException ioe) {
            System.out.println("IO Error. Terminating ...");
            System.exit(1);
        }catch (NumberFormatException ion) {
            System.out.println("Wrong input. Exit program.");
            System.exit(1);
    }
}
}