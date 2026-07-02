package com.daaw;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: com.daaw.Iy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1234Iy1 extends AbstractCallableC3025Zy1 {
    public C1234Iy1(C2813Xx1 c2813Xx1, String str, String str2, C9733xv1 c9733xv1, int i, int i2) {
        super(c2813Xx1, "gcg2RhRsG0R6zuf6iT0eSF6U6iabmBM/me4U4ELIi5QicHmCf/u4OJEW9LFUXGGL", "I5l5b06e/m6OPcJVryww5aceHDWuWNMRDm4mYVrBvJQ=", c9733xv1, i, 73);
    }

    @Override // com.daaw.AbstractCallableC3025Zy1
    public final void a() {
        int i = 1;
        try {
            boolean zBooleanValue = ((Boolean) this.f.invoke(null, this.b.b())).booleanValue();
            C9733xv1 c9733xv1 = this.e;
            if (true == zBooleanValue) {
                i = 2;
            }
            c9733xv1.a0(i);
        } catch (InvocationTargetException unused) {
            this.e.a0(3);
        }
    }
}
