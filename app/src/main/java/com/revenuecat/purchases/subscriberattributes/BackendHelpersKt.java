package com.revenuecat.purchases.subscriberattributes;

import com.daaw.A00;
import com.daaw.AbstractC1473Lg0;
import com.daaw.AbstractC1599Mm;
import com.daaw.AbstractC1703Nm;
import com.daaw.AbstractC2455Um;
import com.daaw.AbstractC8417tE0;
import com.daaw.D61;
import com.daaw.G10;
import com.daaw.H00;
import com.revenuecat.purchases.common.BackendKt;
import com.revenuecat.purchases.common.SubscriberAttributeError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u0004\u0018\u00010\u0003H\u0000\u001a2\u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00050\u0005*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0005H\u0000¨\u0006\t"}, d2 = {"getAttributeErrors", "", "Lcom/revenuecat/purchases/common/SubscriberAttributeError;", "Lorg/json/JSONObject;", "toBackendMap", "", "", "", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "purchases_defaultsRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class BackendHelpersKt {
    public static final List<SubscriberAttributeError> getAttributeErrors(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return AbstractC1599Mm.k();
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(BackendKt.ATTRIBUTES_ERROR_RESPONSE_KEY);
        if (jSONObjectOptJSONObject != null) {
            jSONObject = jSONObjectOptJSONObject;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(BackendKt.ATTRIBUTE_ERRORS_KEY);
        if (jSONArrayOptJSONArray != null) {
            H00 h00Q = AbstractC8417tE0.q(0, jSONArrayOptJSONArray.length());
            ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(h00Q, 10));
            Iterator it = h00Q.iterator();
            while (it.hasNext()) {
                arrayList.add(jSONArrayOptJSONArray.getJSONObject(((A00) it).b()));
            }
            ArrayList<JSONObject> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2.has("key_name") && jSONObject2.has("message")) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(AbstractC1703Nm.v(arrayList2, 10));
            for (JSONObject jSONObject3 : arrayList2) {
                String string = jSONObject3.getString("key_name");
                G10.f(string, "it.getString(\"key_name\")");
                String string2 = jSONObject3.getString("message");
                G10.f(string2, "it.getString(\"message\")");
                arrayList3.add(new SubscriberAttributeError(string, string2));
            }
            List<SubscriberAttributeError> listM0 = AbstractC2455Um.M0(arrayList3);
            if (listM0 != null) {
                return listM0;
            }
        }
        return AbstractC1599Mm.k();
    }

    public static final Map<String, Map<String, Object>> toBackendMap(Map<String, SubscriberAttribute> map) {
        G10.g(map, "<this>");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, SubscriberAttribute> entry : map.entrySet()) {
            arrayList.add(D61.a(entry.getKey(), entry.getValue().toBackendMap()));
        }
        return AbstractC1473Lg0.t(arrayList);
    }
}
