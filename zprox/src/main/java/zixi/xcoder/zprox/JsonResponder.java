package zixi.xcoder.zprox;

import org.json.JSONObject;

public class JsonResponder extends JSONObject{

	private String responseType = null;
	
	public JsonResponder(String responseType)
	{
		this.responseType = responseType;
	}
	public JsonResponder returnJsnedAnswer()
	{
		switch( responseType )
		{
			case "testLink": put("response", "ok");
							 return this;
			default: 		 put("response", "ok");
					 		 return this;
		}
	}
}
