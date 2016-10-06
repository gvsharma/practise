package core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by GV Sharma on 8/8/2016.
 */
public class Test {
    public static void main(String[] args) {


//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String numberOfTestCasesStr = null;
//        try {
//            numberOfTestCasesStr = br.readLine();
//
//        int numberOfTestCases = Integer.parseInt(numberOfTestCasesStr);
//        for(int z=0;z<numberOfTestCases;z++){
//            String arraySizeStr = br.readLine();
//            int arraySize = Integer.parseInt(arraySizeStr);
//            int[] array=new int[arraySize];
//            String arrayElementstr = br.readLine();
//            String[] arrayElementstrSplitStr = arrayElementstr.split("\\s+");
//            for(int i=0;i<arraySize;i++){
//                array[i]=Integer.parseInt(arrayElementstrSplitStr[i]);
//            }
//            int i=0;
//            int count=0;
//            int j=0;
//            while(i<arraySize){
//                int temp=array[i];
//                int tempCount=1;
//                for(j=i+1;j<arraySize;j++){
//                    if(temp==array[j])
//                        tempCount=tempCount+1;
//                    else{
//                        // if(j!=arraySize-1 && array[j]==array[j+1])
//                        //     ++count;
//                        break;
//                    }
//                }
//                if(tempCount>2)
//                    count= count+tempCount;
//                else
//                    count= count+tempCount-1;
//                i=j;
//            }
//
//            int numberOfSubarray=count+arraySize;
//            System.out.println(numberOfSubarray);
//
//        }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

        String[] arrayw = new String[4];
        arrayw[0] = "Sharma";
        System.out.println(arrayw[0]);
        PrintA(arrayw);
        System.out.print(arrayw[0]);
    }

    private static void PrintA(String[] a) {
        //do whatever with array here
        a[0] = "GVSharma";
    }
}
