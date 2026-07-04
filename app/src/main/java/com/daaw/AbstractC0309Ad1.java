package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ad1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0309Ad1 {
    public static final boolean a(AbstractC1156If abstractC1156If) {
        G10.g(abstractC1156If, "version");
        return (abstractC1156If.a() == 1 && abstractC1156If.b() >= 4) || abstractC1156If.a() > 1;
    }

    public static final boolean b(AbstractC1156If abstractC1156If) {
        G10.g(abstractC1156If, "version");
        return a(abstractC1156If);
    }
}
