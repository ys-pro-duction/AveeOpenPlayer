package com.daaw;

import java.io.Serializable;

/* JADX INFO: renamed from: com.daaw.ib3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5435ib3 {
    public static Ta3 a(Ta3 ta3) {
        return ((ta3 instanceof C3752cb3) || (ta3 instanceof Wa3)) ? ta3 : ta3 instanceof Serializable ? new Wa3(ta3) : new C3752cb3(ta3);
    }

    public static Ta3 b(Object obj) {
        return new C4598fb3(obj);
    }
}
