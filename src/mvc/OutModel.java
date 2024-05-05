package mvc;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class OutModel {

	public OutModel() {
		// TODO Auto-generated constructor stub
	}
	
	
	 public boolean login(String username, String password) {
		 
	        String filePath = "src/users.json";

	        try {
	            // Lector de archivos JSON
	            FileReader reader = new FileReader(filePath);

	            // Analizador JSON
	            JSONParser parser = new JSONParser();

	            // Parsear el archivo JSON
	            JSONArray jsonArray = (JSONArray) parser.parse(reader);

	            // Iterar sobre cada objeto JSON en el array
	            for (Object obj : jsonArray) {
	                JSONObject user = (JSONObject) obj;
	                String usuario = (String) user.get("Usuario");
	                String contraseña = (String) user.get("Contraseña");

	                // Verificar si las credenciales coinciden
	                if (usuario.equals(username) && contraseña.equals(password)) {
	                    reader.close();
	                    return true;
	                }
	            }

	            reader.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return false;
	    }
	}
	

		

