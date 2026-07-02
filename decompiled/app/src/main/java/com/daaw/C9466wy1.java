package com.daaw;

/* JADX INFO: renamed from: com.daaw.wy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9466wy1 extends AbstractCallableC3025Zy1 {
    public final long i;

    public C9466wy1(C2813Xx1 c2813Xx1, String str, String str2, C9733xv1 c9733xv1, long j, int i, int i2) {
        super(c2813Xx1, "MbAcGuLi+XGl3MsgqAiQYLikemL120ZFxn+dIhaD+rHWJuTeO/M8+1c58cczHjCs", "Eg2eC3eNesWzbAUINzxj1mXRcYgmzS654CxZFoVQbAM=", c9733xv1, i, 25);
        this.i = j;
    }

    @Override // com.daaw.AbstractCallableC3025Zy1
    public final void a() {
        long jLongValue = ((Long) this.f.invoke(null, null)).longValue();
        synchronized (this.e) {
            try {
                this.e.u0(jLongValue);
                long j = this.i;
                if (j != 0) {
                    this.e.K(jLongValue - j);
                    this.e.L(this.i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
