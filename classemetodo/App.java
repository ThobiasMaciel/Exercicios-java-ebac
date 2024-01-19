public class App {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();

        c1.Acordar(true);
        c1.setNome("meg");
        c1.setPeso(10);
        c1.setRaca("Cusco");

       System.out.println(c1.getNome()); 
       System.out.println(c1.getPeso() + "kg");
       System.out.println(c1.getRaca());
    }
}
