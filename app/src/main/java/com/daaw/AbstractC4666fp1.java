package com.daaw;

/* JADX INFO: renamed from: com.daaw.fp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4666fp1 {
    public final InterfaceC8576to1 a;

    public AbstractC4666fp1(InterfaceC8576to1 interfaceC8576to1) {
        this.a = interfaceC8576to1;
    }

    public abstract boolean a(C5900kE2 c5900kE2);

    public abstract boolean b(C5900kE2 c5900kE2, long j);

    public final boolean c(C5900kE2 c5900kE2, long j) {
        return a(c5900kE2) && b(c5900kE2, j);
    }
}
