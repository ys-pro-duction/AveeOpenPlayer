package com.daaw;

import android.util.Base64;
import com.daaw.C8519td;

/* JADX INFO: loaded from: classes.dex */
public abstract class H51 {

    public static abstract class a {
        public abstract H51 a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(EnumC8911uz0 enumC8911uz0);
    }

    public static a a() {
        return new C8519td.b().d(EnumC8911uz0.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract EnumC8911uz0 d();

    public boolean e() {
        return c() != null;
    }

    public H51 f(EnumC8911uz0 enumC8911uz0) {
        return a().b(b()).d(enumC8911uz0).c(c()).a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", b(), d(), c() == null ? "" : Base64.encodeToString(c(), 2));
    }
}
