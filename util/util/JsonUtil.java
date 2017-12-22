package util;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

public class JsonUtil {

	public static void forwardJson(Map resultMap,HttpServletResponse response) throws Exception{
		forwardJson(resultMap,response,"utf-8");
	}
	
	public static void forwardJson(Map resultMap,HttpServletResponse response,String CharacterEncoding) throws Exception{
		String resultData = getStrJson(resultMap);
		response.setCharacterEncoding(CharacterEncoding);
		response.getWriter().write(resultData);
		response.getWriter().flush();
	}
	
	public static String getStrJson(Object obj) throws Exception{
		return JSONObject.valueToString(obj);
	}
}
