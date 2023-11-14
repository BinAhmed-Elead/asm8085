import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String welcomingMessage = """
                             Author: Abdullah Ahmed Alzahrani
                             E-Mail: s442007249@st.uqu.edu.sa
                             
                             immediat values are decimal by default
                             immediat hex values ends with H or h
                             immediat decimal values starts with . or ends with d
                             """;
        System.out.println(welcomingMessage);
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("Instruction: ");
            String instruction;
            instruction = scan.nextLine();
            StringBuilder hex = new StringBuilder();
            try{
                Instructions.isValidInstruction(instruction.trim(),hex);
                for (int i = 0; i < hex.length(); i+=2) {
                    System.out.print(hex.substring(i,i+2)+' ');
                }
                System.out.println('\b');
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

    }
}