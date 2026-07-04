package com.daaw;

import java.io.Serializable;

/* JADX INFO: renamed from: com.daaw.eO2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4255eO2 implements Serializable {
    public static AbstractC4255eO2 c() {
        return MN2.B;
    }

    public static AbstractC4255eO2 d(Object obj) {
        return obj == null ? MN2.B : new C7901rO2(obj);
    }

    public abstract AbstractC4255eO2 a(WN2 wn2);

    public abstract Object b(Object obj);
}
