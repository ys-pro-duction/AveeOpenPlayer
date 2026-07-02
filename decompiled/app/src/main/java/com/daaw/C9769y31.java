package com.daaw;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.y31, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9769y31 implements InterfaceC2231Si {
    public static final C9769y31 a = new C9769y31();

    @Override // com.daaw.InterfaceC2231Si
    public List a() {
        return AbstractC1599Mm.k();
    }

    @Override // com.daaw.InterfaceC2231Si
    public /* bridge */ /* synthetic */ Member b() {
        return (Member) c();
    }

    public Void c() {
        return null;
    }

    @Override // com.daaw.InterfaceC2231Si
    public Object call(Object[] objArr) {
        G10.g(objArr, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // com.daaw.InterfaceC2231Si
    public Type getReturnType() {
        Class cls = Void.TYPE;
        G10.f(cls, "TYPE");
        return cls;
    }
}
