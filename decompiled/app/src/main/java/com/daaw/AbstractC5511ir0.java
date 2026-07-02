package com.daaw;

import java.util.Comparator;

/* JADX INFO: renamed from: com.daaw.ir0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5511ir0 implements Comparator {
    public static AbstractC5511ir0 a(Comparator comparator) {
        return comparator instanceof AbstractC5511ir0 ? (AbstractC5511ir0) comparator : new C0876Fn(comparator);
    }

    public AbstractC5511ir0 b(InterfaceC4264eR interfaceC4264eR) {
        return new C2955Zh(interfaceC4264eR, this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);
}
