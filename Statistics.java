import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Statistics {
    
    public static void getStat() {
        String fileName = "log.csv";
        File f = new File(fileName);
        if (f.exists()) {
            try {
                File x = new File(fileName);
                Scanner sc = new Scanner(x);
                int logLineCounter = 0;
                
                int logGreenCounter = 0;
                int logRedCounter = 0;
                int logBlackCounter = 0;
                int logOddCounter = 0;
                int logEvenCounter = 0;
                int logDozen1Counter = 0;
                int logDozen2Counter = 0;
                int logDozen3Counter = 0;
                int logHalf1Counter = 0;
                int logHalf2Counter = 0;
                int logRow1Counter = 0;
                int logRow2Counter = 0;
                int logRow3Counter = 0;

                String winnerColor = null;
                int winnerColorNum = 0;
                String winnerEvenOrOdd = null;
                int winnerEvenOrOddNum = 0;
                String winnerDozen = null;
                int winnerDozenNum = 0;
                String winnerHalf = null;
                int winnerHalfNum = 0;
                String winnerRow = null;
                int winnerRowNum = 0;

                String[][] logArray = new String[10][6];

                while (sc.hasNext()) {
                    String logLine = sc.next();

                    logArray[logLineCounter][0] = logLine.split(",")[0];
                    logArray[logLineCounter][1] = logLine.split(",")[1];
                    logArray[logLineCounter][2] = logLine.split(",")[2];
                    logArray[logLineCounter][3] = logLine.split(",")[3];
                    logArray[logLineCounter][4] = logLine.split(",")[4];
                    logArray[logLineCounter][5] = logLine.split(",")[5];

//              logNumber, logColor, logEvenOrOdd, logDozen, logHalf, logRow
                    if (logLine.split(",")[1].equals("red")) logRedCounter++;
                    else if (logLine.split(",")[1].equals("black")) logBlackCounter++;
                    else logGreenCounter++;
                    if (logLine.split(",")[2].equals("odd")) logOddCounter++;
                    else logEvenCounter++;
                    if (logLine.split(",")[3].equals("dozen1")) logDozen1Counter++;
                    else if (logLine.split(",")[3].equals("dozen2")) logDozen2Counter++;
                    else logDozen3Counter++;
                    if (logLine.split(",")[4].equals("half1")) logHalf1Counter++;
                    else logHalf2Counter++;
                    if (logLine.split(",")[5].equals("row1")) logRow1Counter++;
                    else if (logLine.split(",")[5].equals("row2")) logRow2Counter++;
                    else logRow3Counter++;

                    logLineCounter++;
                }
                sc.close();

                if ((Math.max(logGreenCounter, Math.max(logBlackCounter, logRedCounter))) == logBlackCounter) {winnerColor = "Black"; winnerColorNum = logBlackCounter;}
                else if ((Math.max(logGreenCounter, Math.max(logBlackCounter, logRedCounter))) == logRedCounter) {winnerColor = "Red"; winnerColorNum = logRedCounter;}
                else if ((Math.max(logGreenCounter, Math.max(logBlackCounter, logRedCounter))) == logGreenCounter) {winnerColor = "Green"; winnerColorNum = logGreenCounter;}

                if (Math.max(logOddCounter, logEvenCounter) == logOddCounter) {winnerEvenOrOdd = "Odd"; winnerEvenOrOddNum = logOddCounter;}
                else if (Math.max(logOddCounter, logEvenCounter) == logEvenCounter) {winnerEvenOrOdd = "Even"; winnerEvenOrOddNum = logEvenCounter;}

                if ((Math.max(logDozen1Counter, Math.max(logDozen2Counter, logDozen3Counter))) == logDozen1Counter) {winnerDozen = "1st 12"; winnerDozenNum = logDozen1Counter;}
                else if ((Math.max(logDozen1Counter, Math.max(logDozen2Counter, logDozen3Counter))) == logDozen2Counter) {winnerDozen = "1nd 12"; winnerDozenNum = logDozen2Counter;}
                else if ((Math.max(logDozen1Counter, Math.max(logDozen2Counter, logDozen3Counter))) == logDozen3Counter) {winnerDozen = "1rd 12"; winnerDozenNum = logDozen3Counter;}

                if (Math.max(logHalf1Counter, logHalf2Counter) == logHalf1Counter) {winnerHalf = "1st Half"; winnerHalfNum = logHalf1Counter;}
                else if (Math.max(logHalf1Counter, logHalf2Counter) == logHalf2Counter) {winnerHalf = "2st Half"; winnerHalfNum = logHalf2Counter;}

                if ((Math.max(logRow1Counter, Math.max(logRow2Counter, logRow3Counter))) == logRow1Counter) {winnerRow = "1nd Row"; winnerRowNum = logRow1Counter;}
                else if ((Math.max(logRow1Counter, Math.max(logRow2Counter, logRow3Counter))) == logRow2Counter) {winnerRow = "2nd Row"; winnerRowNum = logRow1Counter;}
                else if ((Math.max(logRow1Counter, Math.max(logRow2Counter, logRow3Counter))) == logRow3Counter) {winnerRow = "3nd Row"; winnerRowNum = logRow1Counter;}

                int winnerColorPerCent = winnerColorNum * 100 / (logBlackCounter + logRedCounter + logGreenCounter);
                System.out.println(winnerColor + " (" + winnerColorPerCent + "%)");
                int winnerEvenOrOddPerCent = winnerEvenOrOddNum * 100 / (logOddCounter + logEvenCounter);
                System.out.println(winnerEvenOrOdd + " (" + winnerEvenOrOddPerCent + "%)");
                int winnerDozenPerCent = winnerDozenNum * 100 / (logDozen1Counter + logDozen2Counter + logDozen3Counter);
                System.out.println(winnerDozen + " (" + winnerDozenPerCent + "%)");
                int winnerHalfPerCent = winnerHalfNum * 100 / (logHalf1Counter + logHalf2Counter);
                System.out.println(winnerHalf + " (" + winnerHalfPerCent + "%)");
                int winnerRowPerCent = winnerRowNum * 100 / (logRow1Counter + logRow2Counter + logRow3Counter);
                System.out.println(winnerRow + " (" + winnerRowPerCent + "%)");

            }
            catch(FileNotFoundException e) {
                System.out.println("ERROR");
            }
        }
        else System.out.println("ERROR: Log file is missing!");
    }

}