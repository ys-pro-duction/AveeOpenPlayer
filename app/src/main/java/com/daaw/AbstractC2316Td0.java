package com.daaw;

/* JADX INFO: renamed from: com.daaw.Td0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2316Td0 {
    public EnumC9912yb0 a;

    public AbstractC2316Td0(EnumC9912yb0 enumC9912yb0) {
        G10.g(enumC9912yb0, "level");
        this.a = enumC9912yb0;
    }

    public final void a(String str) {
        G10.g(str, "msg");
        f(EnumC9912yb0.B, str);
    }

    public abstract void b(EnumC9912yb0 enumC9912yb0, String str);

    public final void c(String str) {
        G10.g(str, "msg");
        f(EnumC9912yb0.E, str);
    }

    public final EnumC9912yb0 d() {
        return this.a;
    }

    public final void e(String str) {
        G10.g(str, "msg");
        f(EnumC9912yb0.C, str);
    }

    public final void f(EnumC9912yb0 enumC9912yb0, String str) {
        G10.g(enumC9912yb0, "lvl");
        G10.g(str, "msg");
        if (d().compareTo(enumC9912yb0) <= 0) {
            b(enumC9912yb0, str);
        }
    }

    public final void g(String str) {
        G10.g(str, "msg");
        f(EnumC9912yb0.D, str);
    }
}
