package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.lg2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6306lg2 {
    public final Executor a;
    public final C4901gg2 b;

    public C6306lg2(Executor executor, C4901gg2 c4901gg2) {
        this.a = executor;
        this.b = c4901gg2;
    }

    public final InterfaceFutureC8236sc0 a(JSONObject jSONObject, String str) {
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0H;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray == null) {
            return AbstractC7360pS2.h(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null) {
                interfaceFutureC8236sc0H = AbstractC7360pS2.h(null);
            } else {
                final String strOptString = jSONObjectOptJSONObject.optString("name");
                if (strOptString == null) {
                    interfaceFutureC8236sc0H = AbstractC7360pS2.h(null);
                } else {
                    String strOptString2 = jSONObjectOptJSONObject.optString("type");
                    interfaceFutureC8236sc0H = "string".equals(strOptString2) ? AbstractC7360pS2.h(new C6018kg2(strOptString, jSONObjectOptJSONObject.optString("string_value"))) : "image".equals(strOptString2) ? AbstractC7360pS2.m(this.b.e(jSONObjectOptJSONObject, "image_value"), new WN2() { // from class: com.daaw.ig2
                        @Override // com.daaw.WN2
                        public final Object apply(Object obj) {
                            return new C6018kg2(strOptString, (BinderC4501fG1) obj);
                        }
                    }, this.a) : AbstractC7360pS2.h(null);
                }
            }
            arrayList.add(interfaceFutureC8236sc0H);
        }
        return AbstractC7360pS2.m(AbstractC7360pS2.d(arrayList), new WN2() { // from class: com.daaw.jg2
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (C6018kg2 c6018kg2 : (List) obj) {
                    if (c6018kg2 != null) {
                        arrayList2.add(c6018kg2);
                    }
                }
                return arrayList2;
            }
        }, this.a);
    }
}
