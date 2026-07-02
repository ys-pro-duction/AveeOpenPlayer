package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.pf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7415pf0 {
    public final Object a;
    public final Throwable b;

    public C7415pf0(Object obj) {
        this.a = obj;
        this.b = null;
    }

    public Throwable a() {
        return this.b;
    }

    public Object b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7415pf0)) {
            return false;
        }
        C7415pf0 c7415pf0 = (C7415pf0) obj;
        if (b() != null && b().equals(c7415pf0.b())) {
            return true;
        }
        if (a() == null || c7415pf0.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public C7415pf0(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
