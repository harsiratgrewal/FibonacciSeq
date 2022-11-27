
public class fibseq {

    public static void main(String[] args) throws Exception {
        int i = 0, j = 1, k, x = 0, input;
        if (args.length > 0) {
            try {
                input = Integer.parseInt(args[0]);
                for (k = 1; k < input; k++) {
                    x = i + j;
                    i = j;
                    j = x;
                }
                System.out.print(x);
            } catch (NumberFormatException e) {
                System.err.println("Argument " + args[0] + " must be an non-negative integer!");
                System.exit(1);
            }
        }
    }
}
