//public interface Algorithm {
//    String crypt(String text, String key);
//}
//
//public class DESAlgorithm implements Algorithm {
//    public String crypt(String text, String key) {
//        String cryptedString = null;
//        // тело алгоритма
//        return cryptedString;
//    }
//}
//
//public class RSAAlgorythm implements Algorythm {
//    public String crypt(String text, String key) {
//        String cryptedString = null;
//        // тело алгоритма
//        return cryptedString;
//    }
//}
//
//public class Encryption {
//    private Algorithm algorithm;
//
//    public Encryption(Algorithm algorithm) {
//        this.algorithm = algorithm;
//    }
//
//    public setAlgorithm(Algorithm algorithm) {
//        this.algorithm = algorithm;
//    }
//
//    public crypt(String text, String key) {
//        return algorithm.crypt(text, key);
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        String key = “key”;
//        String text = “text”;
//        int alg = 1;
//        Encryption encryption = new Encryption(new DESAlgorithm());
//        String cryptedText = encryption.crypt(text, key);
//    }
//}