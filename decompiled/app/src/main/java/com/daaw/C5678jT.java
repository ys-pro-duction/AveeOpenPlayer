package com.daaw;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.jT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5678jT {
    public static volatile C5678jT b;
    public final Set a = new HashSet();

    public static C5678jT a() {
        C5678jT c5678jT;
        C5678jT c5678jT2 = b;
        if (c5678jT2 != null) {
            return c5678jT2;
        }
        synchronized (C5678jT.class) {
            try {
                c5678jT = b;
                if (c5678jT == null) {
                    c5678jT = new C5678jT();
                    b = c5678jT;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5678jT;
    }

    public Set b() {
        Set setUnmodifiableSet;
        synchronized (this.a) {
            setUnmodifiableSet = DesugarCollections.unmodifiableSet(this.a);
        }
        return setUnmodifiableSet;
    }
}
