import java.util.Scanner;

public class SWOT {
    private String text;
    String[] swotElements = {"STRENGTHS","WEAKNESESS", "OPPORTUNITIES", "THREATS"};

    SWOT(int indexOfSwotArray){
        setText(swotElements[indexOfSwotArray]);
    }
    public void setText(String swotElement){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter " + swotElement + ": ");
        this.text = in.nextLine();
    }
    public String getText(){
        return text;
    }
}