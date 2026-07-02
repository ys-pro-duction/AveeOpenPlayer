package com.daaw;

import com.daaw.C1877Pd1;

/* JADX INFO: renamed from: com.daaw.Qd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1981Qd1 implements YS {
    public final C1877Pd1.a a;
    public XS b;

    public C1981Qd1(C1877Pd1.a aVar) {
        this.a = aVar;
    }

    @Override // com.daaw.YS
    public XS a(boolean z, boolean z2) {
        if (z || !z2) {
            return C3536bo0.c();
        }
        if (this.b == null) {
            this.b = new C1877Pd1(this.a);
        }
        return this.b;
    }
}
