package com.daaw;

import com.daaw.C8594ts;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.j31, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5566j31 extends C8594ts.c {
    public static final Logger a = Logger.getLogger(C5566j31.class.getName());
    public static final ThreadLocal b = new ThreadLocal();

    @Override // com.daaw.C8594ts.c
    public C8594ts a() {
        C8594ts c8594ts = (C8594ts) b.get();
        return c8594ts == null ? C8594ts.c : c8594ts;
    }

    @Override // com.daaw.C8594ts.c
    public void b(C8594ts c8594ts, C8594ts c8594ts2) {
        if (a() != c8594ts) {
            a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (c8594ts2 != C8594ts.c) {
            b.set(c8594ts2);
        } else {
            b.set(null);
        }
    }

    @Override // com.daaw.C8594ts.c
    public C8594ts c(C8594ts c8594ts) {
        C8594ts c8594tsA = a();
        b.set(c8594ts);
        return c8594tsA;
    }
}
