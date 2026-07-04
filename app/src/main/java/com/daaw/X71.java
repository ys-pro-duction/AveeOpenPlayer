package com.daaw;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class X71 implements W71 {
    public static final X71 a = new X71();

    @Override // com.daaw.W71
    public I80 b(Collection collection) {
        G10.g(collection, "types");
        throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + AbstractC2455Um.n0(collection, null, null, null, 0, null, null, 63, null));
    }

    @Override // com.daaw.W71
    public I80 c(I80 i80) {
        G10.g(i80, "kotlinType");
        return null;
    }

    @Override // com.daaw.W71
    public String d(InterfaceC4923gl interfaceC4923gl) {
        G10.g(interfaceC4923gl, "classDescriptor");
        return null;
    }

    @Override // com.daaw.W71
    public String e(InterfaceC4923gl interfaceC4923gl) {
        G10.g(interfaceC4923gl, "classDescriptor");
        return null;
    }

    @Override // com.daaw.W71
    public void f(I80 i80, InterfaceC4923gl interfaceC4923gl) {
        G10.g(i80, "kotlinType");
        G10.g(interfaceC4923gl, "descriptor");
    }

    @Override // com.daaw.W71
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC7818r50 a(InterfaceC4923gl interfaceC4923gl) {
        G10.g(interfaceC4923gl, "classDescriptor");
        return null;
    }
}
