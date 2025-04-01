public class HelloWorld {
    

    public static void main(String[] args) {
        String ambiente = args[0];
        if (ambiente.equals("DEV")) {
            System.out.println("Executando em DEV");
        } else if (ambiente.equalsIgnoreCase("TEST")) {
            System.out.print("Executando em TEST");
        } else {
            System.out.print(ambiente);
        }
    }
}
