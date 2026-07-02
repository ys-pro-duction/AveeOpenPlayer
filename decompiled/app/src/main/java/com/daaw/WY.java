package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public class WY implements TE0, InterfaceC4442f31 {
    public final InterfaceC4923gl a;
    public final WY b;
    public final InterfaceC4923gl c;

    public WY(InterfaceC4923gl interfaceC4923gl, WY wy) {
        G10.g(interfaceC4923gl, "classDescriptor");
        this.a = interfaceC4923gl;
        this.b = wy == null ? this : wy;
        this.c = interfaceC4923gl;
    }

    @Override // com.daaw.TE0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public YS0 getType() {
        YS0 ys0S = this.a.s();
        G10.f(ys0S, "getDefaultType(...)");
        return ys0S;
    }

    public boolean equals(Object obj) {
        InterfaceC4923gl interfaceC4923gl = this.a;
        WY wy = obj instanceof WY ? (WY) obj : null;
        return G10.c(interfaceC4923gl, wy != null ? wy.a : null);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.daaw.InterfaceC4442f31
    public final InterfaceC4923gl r() {
        return this.a;
    }

    public String toString() {
        return "Class{" + getType() + '}';
    }
}
