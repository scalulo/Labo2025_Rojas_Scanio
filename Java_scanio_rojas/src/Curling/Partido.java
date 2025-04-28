package Curling;

import java.time.LocalDate;

    public class Partido {
        private Equipo equipo1;
        private Equipo equipo2;
        private LocalDate fecha;
        private String turno; // mañana, tarde, noche

        public Equipo getEquipo1() {
            return equipo1;
        }

        public void setEquipo1(Equipo equipo1) {
            this.equipo1 = equipo1;
        }

        public Equipo getEquipo2() {
            return equipo2;
        }

        public void setEquipo2(Equipo equipo2) {
            this.equipo2 = equipo2;
        }

        public LocalDate getFecha() {
            return fecha;
        }

        public void setFecha(LocalDate fecha) {
            this.fecha = fecha;
        }

        public String getTurno() {
            return turno;
        }

        public void setTurno(String turno) {
            this.turno = turno;
        }

        public Partido(Equipo equipo1, Equipo equipo2, LocalDate fecha, String turno) {
            this.equipo1 = equipo1;
            this.equipo2 = equipo2;
            this.fecha = fecha;
            this.turno = turno;

        }

        public void mostrarInfo() {
            System.out.println(fecha + " (" + turno + "): " + equipo1.getNombre() + " vs " + equipo2.getNombre());
        }
    }

