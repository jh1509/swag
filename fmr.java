import java.util.*;
import java.util.regex.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class fmr{

	public static void main(String[] args){			
		
		for(int i = 0; i < args.length; i++){
			if(args[i].equals("-h")){
				System.out.println("This program takes in an input and a regex and outputs the file tokens if the regex");
				System.exit(0);
			}//if
		}//for i
		
		int fileInput = -1;
		for(int i = 0; i < args.length; i++){
			if(args[i].equals("-f")){
				fileInput = i;
			}//if
		}//for

		if(fileInput != -1){
			String filename = args[fileInput + 1];
			
			Pattern pattern = Pattern.compile(args[fileInput + 2]);
			
			try{
				FileReader freader = new FileReader(filename);

				BufferedReader br = new BufferedReader(freader);
			}catch(Exception ex){



			}
		}//if		
		else{
			String line = args[0];
			String regex = args[1];
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(line);
			boolean found = false;
			while(matcher.find()){
				found = true;
				System.out.println("I found text " + matcher.group() + " Starting at index " + matcher.start() + " and ending at index " + matcher.end());
			}
			if(!found)
				System.out.println("no match");
		}//else			

		}//if


	}//mai//fmr class
