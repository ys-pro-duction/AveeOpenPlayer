package com.daaw;

import android.content.Context;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.daaw.aw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3294aw {
    public static final C2275St c = new C2275St();
    public static final String d = d("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    public static final String e = d("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    public static final InterfaceC7819r51 f = new InterfaceC7819r51() { // from class: com.daaw.Zv
        @Override // com.daaw.InterfaceC7819r51
        public final Object apply(Object obj) {
            return C3294aw.c.G((AbstractC1316Jt) obj).getBytes(Charset.forName("UTF-8"));
        }
    };
    public final C5914kI0 a;
    public final InterfaceC7819r51 b;

    public C3294aw(C5914kI0 c5914kI0, InterfaceC7819r51 interfaceC7819r51) {
        this.a = c5914kI0;
        this.b = interfaceC7819r51;
    }

    public static C3294aw b(Context context, OQ0 oq0, C7191oq0 c7191oq0) {
        P51.f(context);
        I51 i51G = P51.c().g(new C6313li(d, e));
        EG egB = EG.b("json");
        InterfaceC7819r51 interfaceC7819r51 = f;
        return new C3294aw(new C5914kI0(i51G.a("FIREBASE_CRASHLYTICS_REPORT", AbstractC1316Jt.class, egB, interfaceC7819r51), oq0.b(), c7191oq0), interfaceC7819r51);
    }

    public static String d(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public AbstractC6963o11 c(AbstractC2899Yt abstractC2899Yt, boolean z) {
        return this.a.i(abstractC2899Yt, z).a();
    }
}
