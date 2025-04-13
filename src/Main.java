import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Öğrenci nesneleri oluşturuluyor
        Student s1 = new Student(" Burak", " Tatar", 1001);
        Student s2 = new Student(" Elif Su", " Arslan", 1002);
        Student s3 = new Student(" Burak", " Tatar", 1001); // Aynı bilgide bir öğrenci daha

        // Öğrenciler ekrana yazdırıyoruz;
        System.out.println("Öğrenci Listesi:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // equals ve hashCode kontrolü için Set kullanıyoruz;
        HashSet<Student> ogrenciSet = new HashSet<>();
        ogrenciSet.add(s1);
        ogrenciSet.add(s2);
        ogrenciSet.add(s3); // Aynı öğrenci olduğundan eklenmeyecek

        System.out.println("\nSet içindeki öğrenci sayısı (tekrarsız şekilde): " + ogrenciSet.size());
    }
}
