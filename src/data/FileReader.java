package data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.util.Arrays;

import static java.lang.Math.toIntExact;

/**
 * Cette classe lit les fichiers JSON permettant de paramétrer une partie de PacMan
 * @author Alexis CANO
 */
public class FileReader {

    /**
     * L'emplacement du fichier paramètre
     */
    private String fileName;

    /**
     * Constructeur de la classe, initialise filename
     * @param fileName le nom du fichier paramètre
     * @pre fileName != null
     * @post filename = filename
     */
    public FileReader(String fileName) {
        if (fileName != null) {
            this.fileName = fileName;
        }
    }

    /**
     * Lit le fichier JSON contenant les paramètre d'une partie de PACMAN et créée un objet GameParam contenant ces paramètres
     * @return les paramètre de la partie
     * @post game != null
     */
    public GameParam initGame(int level) {
        GameParam game = null;
        JSONParser parser = new JSONParser();
        try {
            JSONObject param = (JSONObject) parser.parse(new java.io.FileReader(this.fileName));
            Gson gson = new GsonBuilder().create();
            long pacDotValue = (long) param.get("PacDotValue");
            long fruitValue = (long) param.get("FruitValue");
            long powerTime = (long) param.get("PowerTime");
            long gameSpeed = (long) param.get("GameSpeed");
            JSONArray boardString = (JSONArray) param.get("board");
            int[][] board = gson.fromJson(boardString.toString(), int[][].class);
            game = new GameParam(level, toIntExact(pacDotValue), toIntExact(fruitValue), toIntExact(powerTime), toIntExact(gameSpeed), board);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return game;
    }
}
