package com.daaw;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.zzbw;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Wo2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2674Wo2 {
    public int a = 0;
    public Map b = new HashMap();
    public String c = "";
    public long d = -1;

    public static C2674Wo2 a(Reader reader) {
        try {
            try {
                JsonReader jsonReader = new JsonReader(reader);
                HashMap map = new HashMap();
                String strNextString = "";
                jsonReader.beginObject();
                long jNextLong = -1;
                int iNextInt = 0;
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    if ("response".equals(strNextName)) {
                        iNextInt = jsonReader.nextInt();
                    } else if ("body".equals(strNextName)) {
                        strNextString = jsonReader.nextString();
                    } else if ("latency".equals(strNextName)) {
                        jNextLong = jsonReader.nextLong();
                    } else if ("headers".equals(strNextName)) {
                        map = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            map.put(jsonReader.nextName(), zzbw.zzd(jsonReader));
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                C2674Wo2 c2674Wo2 = new C2674Wo2();
                c2674Wo2.a = iNextInt;
                if (strNextString != null) {
                    c2674Wo2.c = strNextString;
                }
                c2674Wo2.d = jNextLong;
                c2674Wo2.b = map;
                AbstractC7656qX.a(reader);
                return c2674Wo2;
            } catch (IOException e) {
                e = e;
                throw new C5904kF2("Unable to parse Response", e);
            } catch (AssertionError e2) {
                e = e2;
                throw new C5904kF2("Unable to parse Response", e);
            } catch (IllegalStateException e3) {
                e = e3;
                throw new C5904kF2("Unable to parse Response", e);
            } catch (NumberFormatException e4) {
                e = e4;
                throw new C5904kF2("Unable to parse Response", e);
            }
        } catch (Throwable th) {
            AbstractC7656qX.a(reader);
            throw th;
        }
    }
}
