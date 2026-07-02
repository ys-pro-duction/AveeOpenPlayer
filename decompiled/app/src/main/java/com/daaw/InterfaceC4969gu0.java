package com.daaw;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.gu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4969gu0 extends LY, JY {

    /* JADX INFO: renamed from: com.daaw.gu0$a */
    public interface a extends List, Collection, InterfaceC10062z60 {
        InterfaceC4969gu0 a();
    }

    InterfaceC4969gu0 add(int i, Object obj);

    InterfaceC4969gu0 add(Object obj);

    InterfaceC4969gu0 addAll(Collection collection);

    a builder();

    InterfaceC4969gu0 remove(Object obj);

    InterfaceC4969gu0 removeAll(Collection collection);

    @Override // java.util.List
    InterfaceC4969gu0 set(int i, Object obj);

    InterfaceC4969gu0 t(NQ nq);

    InterfaceC4969gu0 u(int i);
}
