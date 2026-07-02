package com.daaw;

import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: com.daaw.Ct, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0579Ct {
    public final String a;
    public final RK b;

    public C0579Ct(String str, RK rk) {
        this.a = str;
        this.b = rk;
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e) {
            C2106Rd0.f().e("Error creating marker: " + this.a, e);
            return false;
        }
    }

    public final File b() {
        return this.b.e(this.a);
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
