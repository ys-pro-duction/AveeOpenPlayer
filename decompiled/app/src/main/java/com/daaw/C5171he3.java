package com.daaw;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.he3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5171he3 {
    public static volatile C5171he3 b;
    public static final C5171he3 c = new C5171he3(true);
    public final Map a = Collections.EMPTY_MAP;

    public C5171he3(boolean z) {
    }

    public static C5171he3 a() {
        C5171he3 c5171he3 = b;
        if (c5171he3 != null) {
            return c5171he3;
        }
        synchronized (C5171he3.class) {
            try {
                C5171he3 c5171he32 = b;
                if (c5171he32 != null) {
                    return c5171he32;
                }
                C5171he3 c5171he3A = De3.a(C5171he3.class);
                b = c5171he3A;
                return c5171he3A;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Oe3 b(Kg3 kg3, int i) {
        AbstractC6314li0.a(this.a.get(new C4324ee3(kg3, i)));
        return null;
    }
}
