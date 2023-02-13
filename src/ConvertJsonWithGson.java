import java.util.Map;

import com.google.gson.Gson;

import beans.MemberBean;

public class ConvertJsonWithGson {
    public static void main(String[] args) {
        /* 문자열을 JSON -> Map으로 바꾸기 */
        Gson gson = new Gson();
        String jsonStr = "{id: 1, name : durante}";
        Map jsonMap = gson.fromJson(jsonStr, Map.class);

        /* Map -> JSON으로 바꾸기 */
        String mapStr = gson.toJson(jsonMap);

        /* 문자열 JSON-> Object(bean == model == vo) */
        String jsonStrBean = "{firstName: durante, secondName:dante, handleName: Mr}";
        MemberBean memberBean = gson.fromJson(jsonStrBean, MemberBean.class);

        int i = 0;
    }

}
