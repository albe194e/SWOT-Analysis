public class Run {

    public void runProgram(){
        SWOT[] swot = new SWOT[4];

        for (int i = 0; i < swot.length; i++) {
            swot[i] = new SWOT(i);
        }
        System.out.println("Your SWOT-Analysis:");
        for (int i = 0; i < swot.length; i++) {
            System.out.printf("\n%s%s:\n%s\n",Color.colors[i],swot[i].swotElements[i],swot[i].getText());
        }
    }
    public static void main(String[] args) {
        new Run().runProgram();
    }
}