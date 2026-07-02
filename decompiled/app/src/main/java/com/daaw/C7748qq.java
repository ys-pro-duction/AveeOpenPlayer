package com.daaw;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* JADX INFO: renamed from: com.daaw.qq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7748qq {
    public static final Charset e = Charset.forName("UTF-8");
    public static final Pattern f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
    public static final Pattern g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    public final Set a = new HashSet();
    public final Executor b;
    public final C5786jq c;
    public final C5786jq d;

    public C7748qq(Executor executor, C5786jq c5786jq, C5786jq c5786jq2) {
        this.b = executor;
        this.c = c5786jq;
        this.d = c5786jq2;
    }

    public static com.google.firebase.remoteconfig.internal.b d(C5786jq c5786jq) {
        return c5786jq.f();
    }

    public static String e(C5786jq c5786jq, String str) {
        com.google.firebase.remoteconfig.internal.b bVarD = d(c5786jq);
        if (bVarD == null) {
            return null;
        }
        try {
            return bVarD.f().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void g(String str, String str2) {
        String.format("No value of type '%s' exists for parameter key '%s'.", str2, str);
    }

    public void b(InterfaceC6298lf interfaceC6298lf) {
        synchronized (this.a) {
            this.a.add(interfaceC6298lf);
        }
    }

    public final void c(final String str, final com.google.firebase.remoteconfig.internal.b bVar) {
        if (bVar == null) {
            return;
        }
        synchronized (this.a) {
            try {
                for (final InterfaceC6298lf interfaceC6298lf : this.a) {
                    this.b.execute(new Runnable() { // from class: com.daaw.pq
                        @Override // java.lang.Runnable
                        public final void run() {
                            interfaceC6298lf.a(str, bVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public InterfaceC5370iM f(String str) {
        String strE = e(this.c, str);
        if (strE != null) {
            c(str, d(this.c));
            return new C5650jM(strE, 2);
        }
        String strE2 = e(this.d, str);
        if (strE2 != null) {
            return new C5650jM(strE2, 1);
        }
        g(str, "FirebaseRemoteConfigValue");
        return new C5650jM("", 0);
    }
}
