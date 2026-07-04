package com.daaw;

import com.daaw.C1381Kj0;
import com.daaw.TX0;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class FV0 extends AbstractC7066oP {
    public final C1381Kj0.b a;
    public boolean b;

    public FV0(C1381Kj0.b bVar) {
        this.a = bVar;
    }

    @Override // com.daaw.AbstractC7066oP, com.daaw.C1381Kj0.b
    public void a(TX0.a aVar) {
        if (!this.b) {
            super.a(aVar);
        } else if (aVar instanceof Closeable) {
            AbstractC7365pU.e((Closeable) aVar);
        }
    }

    @Override // com.daaw.AbstractC7066oP
    public C1381Kj0.b b() {
        return this.a;
    }

    @Override // com.daaw.AbstractC7066oP, com.daaw.C1381Kj0.b
    public void c(boolean z) {
        this.b = true;
        super.c(z);
    }

    @Override // com.daaw.AbstractC7066oP, com.daaw.C1381Kj0.b
    public void e(Throwable th) {
        this.b = true;
        super.e(th);
    }
}
