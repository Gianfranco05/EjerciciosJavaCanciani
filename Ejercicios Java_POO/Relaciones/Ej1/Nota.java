package Ej1;

public class Nota {
        private String catedra;

        // Constructor
        public Nota(String catedra, double notaExamen) {
            this.catedra = catedra;
            this.notaExamen = notaExamen;
        }

        // Getters
        public String getCatedra() {
            return catedra;
        }

        public double getNotaExamen() {
            return notaExamen;
        }

        // Setter (si es necesario)
        public void setCatedra(String catedra) {
            this.catedra = catedra;
        }

        public void setNotaExamen(double notaExamen) {
            this.notaExamen = notaExamen;
        }
}
