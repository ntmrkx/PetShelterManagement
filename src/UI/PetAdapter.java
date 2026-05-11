// THIS CLASS WAS MADE BY AI, just testing
package UI;

import com.google.gson.*;
import java.lang.reflect.Type;

import Records.*;
import Base.*;
import AnimalTypes.*;

public class PetAdapter implements JsonDeserializer<Pet>, JsonSerializer<Pet> {

    @Override
    public JsonElement serialize(Pet pet, Type type, JsonSerializationContext ctx) {
        JsonObject obj = ctx.serialize(pet).getAsJsonObject();
        obj.addProperty("species", pet.getSpecies()); // store type info
        return obj;
    }

    @Override
    public Pet deserialize(JsonElement json, Type type, JsonDeserializationContext ctx)
            throws JsonParseException {
        JsonObject obj = json.getAsJsonObject();
        String species = obj.get("species").getAsString();

        return switch (species) {
            case "Dog"        -> ctx.deserialize(obj, Dog.class);
            case "Cat"        -> ctx.deserialize(obj, Cat.class);
            case "GuineaPig"  -> ctx.deserialize(obj, GuineaPig.class);
            case "Rabbit"     -> ctx.deserialize(obj, Rabbit.class);
            default -> throw new JsonParseException("Unknown species: " + species);
        };
    }
}