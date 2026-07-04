package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ly1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1545Ly1 extends AbstractCallableC3025Zy1 {
    public final StackTraceElement[] i;

    public C1545Ly1(C2813Xx1 c2813Xx1, String str, String str2, C9733xv1 c9733xv1, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(c2813Xx1, "fxU2A2MjpZ4aJWGzXeMNURilSCaKosw3oXImrqnhSVmXB+tMi32JakdNlHCV3t0c", "+EF+l1eHEjuR445L5ETgD58eDQCcfhCypNm97kN1L/4=", c9733xv1, i, 45);
        this.i = stackTraceElementArr;
    }

    @Override // com.daaw.AbstractCallableC3025Zy1
    public final void a() {
        StackTraceElement[] stackTraceElementArr = this.i;
        if (stackTraceElementArr != null) {
            C1853Ox1 c1853Ox1 = new C1853Ox1((String) this.f.invoke(null, stackTraceElementArr));
            synchronized (this.e) {
                try {
                    this.e.u(c1853Ox1.a.longValue());
                    if (c1853Ox1.b.booleanValue()) {
                        this.e.X(true != c1853Ox1.c.booleanValue() ? 2 : 1);
                    } else {
                        this.e.X(3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
