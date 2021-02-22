public class Laborator1Pa{
    static int sumaCifrelor(int n) {
        int rezultat = n;
        while(rezultat>=10) {
            n=rezultat;
            rezultat = 0;
            while(n>0) {
                rezultat += n%10;
                n/=10;
            }

            System.out.println(rezultat);
        }

        return rezultat;
    }
    public static void main (String[] argument ){
        System.out.println("Salutari din partea lui Sporniac Silviu Danut!");
        String[] names = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        int n = (int) (Math.random() * 1_000_000);
        System.out.println(n);
        n = n * 3;
        System.out.println(n);
        n += Integer.parseInt("10101", 2);
        System.out.println(n);
        n += Integer.parseInt("FF", 16);
        System.out.println(n);
        n = n * 6;
        System.out.println(n);
        System.out.println("Willy-nilly, this semester I will learn " + names[sumaCifrelor(n)]);
    }
}

