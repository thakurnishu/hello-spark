package net.knaur.java.exercises.spark.transformer;

import com.google.gson.Gson;
import spark.ResponseTransformer;

public class JsonTransformer implements ResponseTransformer {
	
	private Gson gson = new Gson();
	
	@Override
	public String render(Object o) throws Exception {
		return gson.toJson(o);
	}
}
