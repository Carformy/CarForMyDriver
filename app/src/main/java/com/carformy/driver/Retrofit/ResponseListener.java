package com.carformy.driver.Retrofit;
/**
 *@Developer android
 *@Company android
 **/

import org.json.JSONArray;


public interface ResponseListener {
    void getJSONArrayResult(String strTag, JSONArray arrayResponse);
}
