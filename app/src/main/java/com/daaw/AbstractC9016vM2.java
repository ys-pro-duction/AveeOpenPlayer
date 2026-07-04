package com.daaw;

import android.content.Context;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* JADX INFO: renamed from: com.daaw.vM2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9016vM2 {
    public static final String g = new UUID(0, 0).toString();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final C9295wM2 f;

    public AbstractC9016vM2(Context context, String str, String str2, String str3) {
        this.f = C9295wM2.b(context);
        this.a = str;
        this.b = str.concat("_3p");
        this.c = str2;
        this.d = str2.concat("_3p");
        this.e = str3;
    }

    public final long a(boolean z) {
        return this.f.a(z ? this.d : this.c, -1L);
    }

    public final C8730uM2 b(String str, String str2, long j, boolean z) throws IOException {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(g)) {
                    String strE = e(true);
                    String strC = this.f.c("paid_3p_hash_key", null);
                    if (strE != null && strC != null && !strE.equals(h(str, str2, strC))) {
                        return c(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new C8730uM2();
        }
        boolean z2 = str != null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        long jA = a(z2);
        if (jA != -1) {
            if (jCurrentTimeMillis < jA) {
                this.f.d(z2 ? this.d : this.c, Long.valueOf(jCurrentTimeMillis));
            } else if (jCurrentTimeMillis >= jA + j) {
                return c(str, str2);
            }
        }
        String strE2 = e(z2);
        return (strE2 != null || z) ? new C8730uM2(strE2, a(z2)) : c(str, str2);
    }

    public final C8730uM2 c(String str, String str2) throws IOException {
        if (str == null) {
            return d(UUID.randomUUID().toString(), false);
        }
        String string = UUID.randomUUID().toString();
        this.f.d("paid_3p_hash_key", string);
        return d(h(str, str2, string), true);
    }

    public final C8730uM2 d(String str, boolean z) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        this.f.d(z ? this.d : this.c, Long.valueOf(jCurrentTimeMillis));
        this.f.d(z ? this.b : this.a, str);
        return new C8730uM2(str, jCurrentTimeMillis);
    }

    public final String e(boolean z) {
        return this.f.c(z ? this.b : this.a, null);
    }

    public final void f(boolean z) throws IOException {
        this.f.e(z ? this.d : this.c);
        this.f.e(z ? this.b : this.a);
    }

    public final boolean g(boolean z) {
        return this.f.g(this.a);
    }

    public final String h(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes((str + str2 + str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = this.e;
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        sb.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sb.append(str2 == null ? "null" : "not null");
        sb.append(", hashKey is ");
        sb.append(str3 == null ? "null" : "not null");
        throw new IllegalArgumentException(sb.toString());
    }
}
