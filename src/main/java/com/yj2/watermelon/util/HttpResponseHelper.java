package com.yj2.watermelon.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;

public class HttpResponseHelper {

    private static final Logger log = LogManager.getLogger(HttpResponseHelper.class);

    private HttpResponseHelper() {
    }

    public static String inbox(HashMap<String, Object> errorsHash) {
        ObjectMapper mapper = new ObjectMapper();
        HttpResponseStruct responseStruct = new HttpResponseStruct();
        responseStruct.setStatus(50001);
        responseStruct.setMessage("exception");
        responseStruct.setData(errorsHash.get("errors"));
        String returnString = null;

        try {
            returnString = mapper.writeValueAsString(responseStruct);
        } catch (JsonProcessingException var5) {
            log.error(var5.getMessage(), var5);
        }

        if(log.isDebugEnabled()) {
            log.debug("装箱成功，返回的json字符串是:{}", returnString);
        }

        return returnString;
    }


    public static String successInfoInbox(String dataString) {
        HashMap hashMap = new HashMap();
        hashMap.put("localMessage", dataString);
        return successInfoInbox(hashMap);
    }

    public static String successInfoInbox(HashMap<String, Object> successMessageHash) {
        HttpResponseStruct responseStruct = new HttpResponseStruct();
        ObjectMapper mapper = new ObjectMapper();
        responseStruct.setStatus(20000);
        responseStruct.setMessage("success");
        responseStruct.setData(successMessageHash);
        String returnString = null;

        try {
            returnString = mapper.writeValueAsString(responseStruct);
        } catch (JsonProcessingException var5) {
            log.error(var5.getMessage(), var5);
        }

        return returnString;
    }
}
