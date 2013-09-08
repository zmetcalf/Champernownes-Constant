public class ChampernownesConstant
{
    private String numberString = "123456789";

    public ChampernownesConstant() {
        generateNumberString();
    }

    private void generateNumberString() {
        for(int i = 1; i < 20000; i++) {
            for(int c = 0; c < 10; c++) {
                numberString += (Integer.toString(i) + Integer.toString(c));
            }
        }
    }

    public void printSolution() {
        int solution;
        solution = (numberString.charAt(0) - 48) *
                   (numberString.charAt(9) - 48) *
                   (numberString.charAt(99) - 48) *
                   (numberString.charAt(999) - 48) *
                   (numberString.charAt(9999) - 48) *
                   (numberString.charAt(99999) - 48) *
                   (numberString.charAt(999999) - 48);
        System.out.printf("The solution is %d\n", solution);
    }
}
