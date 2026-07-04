package com.daaw;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.zzbw;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.vF2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8988vF2 {
    public final List a;
    public final C5622jF2 b;
    public final List c;

    public C8988vF2(JsonReader jsonReader) throws IOException {
        List arrayList = Collections.EMPTY_LIST;
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        C5622jF2 c5622jF2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        arrayList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList.add(new C4498fF2(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        c5622jF2 = new C5622jF2(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (strNextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = null;
                    JSONObject jSONObjectZzh = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if ("name".equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if ("info".equals(strNextName3)) {
                            jSONObjectZzh = zzbw.zzh(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList2.add(new C8702uF2(strNextString, jSONObjectZzh));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.c = arrayList2;
        this.a = arrayList;
        this.b = c5622jF2 == null ? new C5622jF2(new JsonReader(new StringReader("{}"))) : c5622jF2;
    }

    public static C8988vF2 a(Reader reader) {
        try {
            try {
                return new C8988vF2(new JsonReader(reader));
            } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e) {
                throw new C5904kF2("unable to parse ServerResponse", e);
            }
        } finally {
            AbstractC7656qX.a(reader);
        }
    }
}
