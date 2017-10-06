package untilTool;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/10/6 0006.
 */
public class JsonUntil {
    public static void  toJson(String jsonStr, HttpServletRequest httpServletRequest){

            httpServletRequest.setAttribute("1",jsonStr);

    }
}
