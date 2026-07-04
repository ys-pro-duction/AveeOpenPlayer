package com.daaw;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class ES implements OI0 {
    public final OI0 a;
    public final OI0 b;
    public String c;

    public ES(OI0 oi0, OI0 oi02) {
        this.a = oi0;
        this.b = oi02;
    }

    @Override // com.daaw.CG
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(KI0 ki0, OutputStream outputStream) {
        AS as = (AS) ki0.get();
        KI0 ki0A = as.a();
        return ki0A != null ? this.a.a(ki0A, outputStream) : this.b.a(as.b(), outputStream);
    }

    @Override // com.daaw.CG
    public String getId() {
        if (this.c == null) {
            this.c = this.a.getId() + this.b.getId();
        }
        return this.c;
    }
}
