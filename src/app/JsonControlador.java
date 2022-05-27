package app;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonControlador {
	
	private String fuente;
	
	public JsonControlador()
	{
		fuente = JsonUtiles.leer("arch");
	}
	
	
	public ArrayList<Persona> consumirJson()
	{
		ArrayList<Persona> arrayPersonas = new ArrayList<>();
		try {
			JSONArray arrayobj = new JSONArray(fuente);
			
			for(int i=0; i<arrayobj.length();i++)
			{
				Persona aux = new Persona();
				JSONObject temp = arrayobj.getJSONObject(i);
				
				String id = temp.getString("_id");
				aux.setId(id);
				
				int index = temp.getInt("index");
				aux.setIndex(index);
				
				String guid = temp.getString("guid");
				aux.setGuid(guid);
				
				boolean isActive = temp.getBoolean("isActive");
				aux.setActive(isActive);
				
				String balance = temp.getString("balance");
				aux.setBalance(balance);
				
				String picture = temp.getString("picture");
				aux.setPicture(picture);
				
				int age = temp.getInt("age");
				aux.setAge(age);
				
				String eyeColor = temp.getString("eyeColor");
				aux.setEyeColor(eyeColor);
				
				String name = temp.getString("name");
				aux.setName(name);
				
				String gender = temp.getString("gender");
				aux.setGender(gender);
				
				String company = temp.getString("company");
				aux.setCompany(company);
				
				String email = temp.getString("email");
				aux.setEmail(email);
				
				String phone = temp.getString("phone");
				aux.setPhone(phone);
				
				String address = temp.getString("address");
				aux.setAddress(address);
				
				String about = temp.getString("about");
				aux.setAbout(about);
				
				String registered = temp.getString("registered");
				aux.setRegistered(registered);
				
				Double latitude = temp.getDouble("latitude");  //lo muestra positivo
				aux.setLatitude(latitude);
				
				Double longitude = temp.getDouble("longitude");
				aux.setLongitude(longitude);
				
				JSONArray tags = temp.getJSONArray("tags");
				ArrayList<String> arraytags = new ArrayList<>();
				
				for (int j = 0; j<tags.length();j++)
				{
					String aux_tag = tags.getString(i);
					arraytags.add(aux_tag);
				}
				
				aux.setArrayTags(arraytags);
				
				JSONArray friends = temp.getJSONArray("friends");
				ArrayList <Amigo> arrayfriends = new ArrayList<>();
				
				for(int k = 0; k<friends.length();k++)
				{
					JSONObject friend = friends.getJSONObject(k);
					Amigo aux_am = new Amigo();
					int friendId = friend.getInt("id");
					aux_am.setId(friendId);
					
					String friendName = friend.getString("name");
					aux_am.setName(friendName);
					
					arrayfriends.add(aux_am);
					
				}
				
				aux.setArrayAmigos(arrayfriends);
				
				String greeting = temp.getString("greeting");
				aux.setGreeting(greeting);
				
				String favoriteFruit = temp.getString("favoriteFruit");
				aux.setFavoriteFruit(favoriteFruit);
				
				arrayPersonas.add(aux);
				
			}
			
			
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		return arrayPersonas;
	}

}
