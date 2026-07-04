package com.daaw;

import android.text.TextUtils;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.g41, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4736g41 {
    public static Map a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return d(jSONObject);
            }
            return null;
        } catch (Exception e) {
            C1980Qd0.f().b("Failed to parse JSONObject into Map:\n" + e);
            return Collections.EMPTY_MAP;
        }
    }

    public static Map b(String str) {
        AbstractC7506py0.f(str);
        String[] strArrSplit = str.split("\\.", -1);
        if (strArrSplit.length < 2) {
            C1980Qd0.f().d("Invalid token (too few subsections):\n" + str);
            return Collections.EMPTY_MAP;
        }
        try {
            Map mapA = a(new String(Base64.decode(strArrSplit[1], 11), "UTF-8"));
            return mapA == null ? Collections.EMPTY_MAP : mapA;
        } catch (UnsupportedEncodingException e) {
            C1980Qd0.f().d("Unable to decode token (charset unknown):\n" + e);
            return Collections.EMPTY_MAP;
        }
    }

    public static List c(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object objD = jSONArray.get(i);
            if (objD instanceof JSONArray) {
                objD = c((JSONArray) objD);
            } else if (objD instanceof JSONObject) {
                objD = d((JSONObject) objD);
            }
            arrayList.add(objD);
        }
        return arrayList;
    }

    public static Map d(JSONObject jSONObject) throws JSONException {
        C2407Ua c2407Ua = new C2407Ua();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objD = jSONObject.get(next);
            if (objD instanceof JSONArray) {
                objD = c((JSONArray) objD);
            } else if (objD instanceof JSONObject) {
                objD = d((JSONObject) objD);
            } else if (objD.equals(JSONObject.NULL)) {
                objD = null;
            }
            c2407Ua.put(next, objD);
        }
        return c2407Ua;
    }
}
