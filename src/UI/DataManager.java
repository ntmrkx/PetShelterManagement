// THIS CLASS WAS MADE BY AI, just testing
package UI;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;

import Base.*;
import Records.*;
import AnimalTypes.*;


public class DataManager {
    private static final String PETS_FILE = "data/pets.json";
    private static final String ADOPTIONS_FILE = "data/adoptions.json";

    private static final Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .registerTypeAdapter(Pet.class, new PetAdapter()) // needed for abstract class
            .create();

    // save
    public static void savePets(ArrayList<Pet> pets) {
        writeToFile(PETS_FILE, gson.toJson(pets));
    }

    public static void saveAdoptions(ArrayList<AdoptionRecord> adoptions) {
        writeToFile(ADOPTIONS_FILE, gson.toJson(adoptions));
    }

    // load
    public static ArrayList<Pet> loadPets() {
        String json = readFromFile(PETS_FILE);
        if (json == null) return new ArrayList<>();
        Type type = new TypeToken<ArrayList<Pet>>(){}.getType();
        return gson.fromJson(json, type);
    }

    public static ArrayList<AdoptionRecord> loadAdoptions() {
        String json = readFromFile(ADOPTIONS_FILE);
        if (json == null) return new ArrayList<>();
        Type type = new TypeToken<ArrayList<AdoptionRecord>>(){}.getType();
        return gson.fromJson(json, type);
    }

    // file helpers
    private static void writeToFile(String path, String content) {
        try {
            File file = new File(path);
            FileWriter writer = new FileWriter(file);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            System.out.println("Save failed: " + e.getMessage());
        }
    }

    private static String readFromFile(String path) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) sb.append(line);
            reader.close();
            return sb.toString();
        } catch (IOException e) {
            return null; // file doesnt exist
        }
    }
}