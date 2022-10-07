public class Main {

    public static void main(String[] args) {
        int param1 = 25;
        int param2 = 30;
        int param3 = 15;
        var valor = suma(param1, param2, param3);
        System.out.println(valor);
    }
    public static int suma(int a, int b, int c){
        return a +b +c;
    }
}