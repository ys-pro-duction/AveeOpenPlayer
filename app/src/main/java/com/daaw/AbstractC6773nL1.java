package com.daaw;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.nL1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6773nL1 {
    public static final Charset a = Charset.forName("UTF-8");
    public static final InterfaceC5927kL1 b = new C6494mL1();
    public static final InterfaceC5368iL1 c = new InterfaceC5368iL1() { // from class: com.daaw.lL1
        @Override // com.daaw.InterfaceC5368iL1
        public final Object b(JSONObject jSONObject) {
            return AbstractC6773nL1.a(jSONObject);
        }
    };

    public static /* synthetic */ InputStream a(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(a));
    }
}
