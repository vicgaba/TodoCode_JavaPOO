package ejerciciovideojuego;

import ejercicioIntegradorVideoJuegos.VideoJuego;

import java.util.ArrayList;
import java.util.List;

public class EjercicioVideojuego {
    public static void main(String[] args) {

        List<VideoJuego> listaVideoJuegos= new ArrayList<VideoJuego>();

        VideoJuego video1 = new VideoJuego(1,"Juego 1", "Nintendo 64", 4, "Plataforma");
        VideoJuego video2 = new VideoJuego(2,"Juego 2", "Play", 3, "Acción");
        VideoJuego video3 = new VideoJuego(3, "Juego 3", "Nintendo 64", 2, "Rol");
        VideoJuego video4 = new VideoJuego(4, "Juego 4", "PC", 2, "Estrategia");
        VideoJuego video5 = new VideoJuego(5, "Juego 5", "XBOY", 2, "Rol");

        listaVideoJuegos.add(video1);
        listaVideoJuegos.add(video2);
        listaVideoJuegos.add(video3);
        listaVideoJuegos.add(video4);
        listaVideoJuegos.add(video5);

        for(VideoJuego video : listaVideoJuegos) {
            System.out.println("Titulo: " + video.getTitulo() + ", Consola: " + video.getConsola() +
                    ", Cant. jugadores: " + video.getCantJugadores());
        }

        video1.setTitulo("Nuevo juego");
        video1.setCantJugadores(8);

        video3.setTitulo("Age of empire");
        video3.setCantJugadores(1);

        for(VideoJuego video : listaVideoJuegos) {
            if (video.getConsola().equals("Nintendo 64")) {
                System.out.println(video.toString());
            }
        }
    }
}
