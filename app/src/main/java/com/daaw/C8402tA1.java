package com.daaw;

import java.util.Comparator;

/* JADX INFO: renamed from: com.daaw.tA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8402tA1 implements Comparator {
    public C8402tA1(C8681uA1 c8681uA1) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C3920dA1 c3920dA1 = (C3920dA1) obj;
        C3920dA1 c3920dA12 = (C3920dA1) obj2;
        if (c3920dA1.d() < c3920dA12.d()) {
            return -1;
        }
        if (c3920dA1.d() > c3920dA12.d()) {
            return 1;
        }
        if (c3920dA1.b() < c3920dA12.b()) {
            return -1;
        }
        if (c3920dA1.b() > c3920dA12.b()) {
            return 1;
        }
        float fA = (c3920dA1.a() - c3920dA1.d()) * (c3920dA1.c() - c3920dA1.b());
        float fA2 = (c3920dA12.a() - c3920dA12.d()) * (c3920dA12.c() - c3920dA12.b());
        if (fA > fA2) {
            return -1;
        }
        return fA < fA2 ? 1 : 0;
    }
}
