package example.ehcache;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ApiResponseMessage {

	private ResponseResult responseResult;
	private String message;
	private List<CacheExampleData> contents;

	public ApiResponseMessage(ResponseResult responseResult, String message) {
		this.responseResult = responseResult;
		this.message = message;
	}
}
