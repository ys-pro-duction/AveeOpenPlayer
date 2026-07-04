package com.daaw;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class BY implements CG {
    public final CG a;
    public final CG b;
    public String c;

    public BY(CG cg, CG cg2) {
        this.a = cg;
        this.b = cg2;
    }

    @Override // com.daaw.CG
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(AY ay, OutputStream outputStream) {
        return ay.b() != null ? this.a.a(ay.b(), outputStream) : this.b.a(ay.a(), outputStream);
    }

    @Override // com.daaw.CG
    public String getId() {
        if (this.c == null) {
            this.c = this.a.getId() + this.b.getId();
        }
        return this.c;
    }
}
