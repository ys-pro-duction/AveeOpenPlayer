package com.daaw;

import android.util.JsonWriter;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Xj2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2758Xj2 {
    public final InterfaceC5485im a;

    public C2758Xj2(InterfaceC5485im interfaceC5485im) {
        this.a = interfaceC5485im;
    }

    public final void a(List list, String str, String str2, Object... objArr) {
        if (((Boolean) EF1.a.e()).booleanValue()) {
            long jA = this.a.a();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name(DiagnosticsEntry.Event.TIMESTAMP_KEY).value(jA);
                jsonWriter.name("source").value(str);
                jsonWriter.name("event").value(str2);
                jsonWriter.name("components").beginArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj = objArr[i];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e) {
                AbstractC4274eT1.zzh("unable to log", e);
            }
            AbstractC4274eT1.zzi("AD-DBG ".concat(String.valueOf(stringWriter.toString())));
        }
    }
}
