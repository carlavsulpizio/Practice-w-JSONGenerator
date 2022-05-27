package app;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Main {

	public static void main(String[] args) {
		
		JsonControlador jeyson = new JsonControlador();
		ArrayList<Persona> arrayPersonas = new ArrayList<>();
		
		arrayPersonas = jeyson.consumirJson();
		
		System.out.println(arrayPersonas);
		
		/*String fuente = JsonUtiles.leer("arch");
		System.out.println(fuente);
		
		try {
			JSONArray array = new JSONArray(fuente);
			
			System.out.println("-------------------------------------------------------------------");
			for (int i=0; i<array.length(); i++)
			{
				System.out.println("-------------------------------------POS "+i+" ------------------------------------");
				JSONObject temp = array.getJSONObject(i);
				String _id = temp.getString("_id");
				System.out.println(_id);
				
				int index = temp.getInt("index");
				System.out.println(index);
				
				String guid = temp.getString("guid");
				System.out.println(guid);
				
				boolean isActive = temp.getBoolean("isActive");
				System.out.println(isActive);
				
				String balance = temp.getString("balance");
				System.out.println(balance);
				
				String picture = temp.getString("picture");
				System.out.println(picture);
				
				int age = temp.getInt("age");
				System.out.println(age);
				
				String eyeColor = temp.getString("eyeColor");
				System.out.println(eyeColor);
				
				String name = temp.getString("name");
				System.out.println(name);
				
				String gender = temp.getString("gender");
				System.out.println(gender);
				
				String company = temp.getString("company");
				System.out.println(company);
				
				String email = temp.getString("email");
				System.out.println(email);
				
				String phone = temp.getString("phone");
				System.out.println(phone);
				
				String address = temp.getString("address");
				System.out.println(address);
				
				String about = temp.getString("about");
				System.out.println(about);
				
				String registered = temp.getString("registered");
				System.out.println(registered);
				
				Double latitude = temp.getDouble("latitude");  //lo muestra positivo
				System.out.println(latitude);
				
				Double longitude = temp.getDouble("longitude");
				System.out.println(longitude);
				
				JSONArray arraytags = temp.getJSONArray("tags");
				
				for(int j=0; j<arraytags.length();j++)
				{
					String aux = arraytags.getString(j);
					System.out.println(aux);
				}
				
				JSONArray arrayfriends = temp.getJSONArray("friends");
				
				for(int k=0 ;k<arrayfriends.length();k++)
				{
					JSONObject aux = arrayfriends.getJSONObject(k);
					int id = aux.getInt("id");
					System.out.println(id);
					
					String namee = aux.getString("name");
					System.out.println(namee);
					
				}
				
				String greeting = temp.getString("greeting");
				System.out.println(greeting);
				
				String favoriteFruit = temp.getString("favoriteFruit");
				System.out.println(favoriteFruit);
			}
			
			
		} catch (JSONException e) {
			
		}*/

	}

}
