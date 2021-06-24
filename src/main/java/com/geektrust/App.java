package com.geektrust;

import com.geektrust.request.InputRequest;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        if(args.length > 0){

            String filePath = args[0];
            File file = new File(filePath);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            List<InputRequest> inputRequestList = new ArrayList<>();
            String readLine;

            while ((readLine = bufferedReader.readLine())!= null){

                String[] splitArray = readLine.split(" ");
                InputRequest inputRequest = new InputRequest();
                inputRequest.setWeatherCondition(splitArray[0]);
                inputRequest.setFirstOrbitSpeed(Integer.parseInt(splitArray[1]));
                inputRequest.setSecondOrbitSpeed(Integer.parseInt(splitArray[2]));
                inputRequestList.add(inputRequest);

            }

        }
    }
}
