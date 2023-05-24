package Singleton;

public class Drucker {

        private static Drucker drucker;
        private Drucker() {}

        public static Drucker getInstance() {

            if (drucker == null) {
                drucker = new Drucker();

            }
            return drucker;
        }
        public static void drucken(){
            System.out.println("ich drucke, bin die Instanz " + drucker);
        }
    }
