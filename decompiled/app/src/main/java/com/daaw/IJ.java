package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class IJ {
    public final Object a;
    public final InterfaceC3986dR b;

    public IJ(Object obj, InterfaceC3986dR interfaceC3986dR) {
        G10.g(interfaceC3986dR, "transition");
        this.a = obj;
        this.b = interfaceC3986dR;
    }

    public final Object a() {
        return this.a;
    }

    public final InterfaceC3986dR b() {
        return this.b;
    }

    public final Object c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IJ)) {
            return false;
        }
        IJ ij = (IJ) obj;
        return G10.c(this.a, ij.a) && G10.c(this.b, ij.b);
    }

    public int hashCode() {
        Object obj = this.a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.a + ", transition=" + this.b + ')';
    }
}
