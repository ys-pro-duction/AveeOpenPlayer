package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public class CS implements KI0 {
    public final AS a;

    public CS(AS as) {
        if (as == null) {
            throw new NullPointerException("Data must not be null");
        }
        this.a = as;
    }

    @Override // com.daaw.KI0
    public int a() {
        return this.a.c();
    }

    @Override // com.daaw.KI0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AS get() {
        return this.a;
    }

    @Override // com.daaw.KI0
    public void c() {
        KI0 ki0A = this.a.a();
        if (ki0A != null) {
            ki0A.c();
        }
        KI0 ki0B = this.a.b();
        if (ki0B != null) {
            ki0B.c();
        }
    }
}
