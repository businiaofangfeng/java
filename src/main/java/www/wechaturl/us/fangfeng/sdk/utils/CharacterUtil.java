package www.wechaturl.us.fangfeng.sdk.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Base64;

public class CharacterUtil {

    public static final String UTF_8 = "UTF-8";

    public static String urlDecode(String value){
        String result;
        try {
             result = URLDecoder.decode(value, UTF_8);
        } catch (UnsupportedEncodingException e) {
            result = value;
        }
        return result;
    }

    public static String urlEncode(String value){
        String result;
        try {
            result = URLEncoder.encode(value, UTF_8);
        } catch (UnsupportedEncodingException e) {
            result = value;
        }
        return result;
    }

    public static String base64Encode(String value){
        return Base64.getEncoder().encodeToString(value.getBytes());
    }

    public static String base64Encode(String value, String charset){
        try {
            return Base64.getEncoder().encodeToString(value.getBytes(charset));
        } catch (UnsupportedEncodingException e) {
            return Base64.getEncoder().encodeToString(value.getBytes());
        }
    }

    public static String base64Decode(String value){
        byte[] decodedBytes = Base64.getDecoder().decode(value);
        try {
            return new String(decodedBytes, UTF_8);
        } catch (UnsupportedEncodingException e) {
            return value;
        }
    }
}
