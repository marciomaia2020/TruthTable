public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("O resultado da Tabela Verdade é:");
        
        int x,y,z;
        x = 1;y = 2;z = 3;
        
        boolean r;
        r = (x==y) || (y<=x)?true:false;

        System.out.println(r);
    }
}
