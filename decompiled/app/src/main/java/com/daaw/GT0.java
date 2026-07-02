package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class GT0 {
    public final InterfaceC5781jp a;

    public /* synthetic */ GT0(InterfaceC5781jp interfaceC5781jp) {
        this.a = interfaceC5781jp;
    }

    public static final /* synthetic */ GT0 a(InterfaceC5781jp interfaceC5781jp) {
        return new GT0(interfaceC5781jp);
    }

    public static InterfaceC5781jp b(InterfaceC5781jp interfaceC5781jp) {
        G10.g(interfaceC5781jp, "composer");
        return interfaceC5781jp;
    }

    public static boolean c(InterfaceC5781jp interfaceC5781jp, Object obj) {
        return (obj instanceof GT0) && G10.c(interfaceC5781jp, ((GT0) obj).f());
    }

    public static int d(InterfaceC5781jp interfaceC5781jp) {
        return interfaceC5781jp.hashCode();
    }

    public static String e(InterfaceC5781jp interfaceC5781jp) {
        return "SkippableUpdater(composer=" + interfaceC5781jp + ')';
    }

    public boolean equals(Object obj) {
        return c(this.a, obj);
    }

    public final /* synthetic */ InterfaceC5781jp f() {
        return this.a;
    }

    public int hashCode() {
        return d(this.a);
    }

    public String toString() {
        return e(this.a);
    }
}
