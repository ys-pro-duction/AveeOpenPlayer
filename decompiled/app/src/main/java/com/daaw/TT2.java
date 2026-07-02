package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TT2 implements InterfaceC7659qX2 {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public C5835k03 d;

    public TT2(boolean z) {
        this.a = z;
    }

    public final void b(int i) {
        C5835k03 c5835k03 = this.d;
        int i2 = AbstractC9004vJ2.a;
        for (int i3 = 0; i3 < this.c; i3++) {
            ((InterfaceC3917d93) this.b.get(i3)).f(this, c5835k03, this.a, i);
        }
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final void k(InterfaceC3917d93 interfaceC3917d93) {
        interfaceC3917d93.getClass();
        if (this.b.contains(interfaceC3917d93)) {
            return;
        }
        this.b.add(interfaceC3917d93);
        this.c++;
    }

    public final void l() {
        C5835k03 c5835k03 = this.d;
        int i = AbstractC9004vJ2.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            ((InterfaceC3917d93) this.b.get(i2)).a(this, c5835k03, this.a);
        }
        this.d = null;
    }

    public final void m(C5835k03 c5835k03) {
        for (int i = 0; i < this.c; i++) {
            ((InterfaceC3917d93) this.b.get(i)).g(this, c5835k03, this.a);
        }
    }

    public final void n(C5835k03 c5835k03) {
        this.d = c5835k03;
        for (int i = 0; i < this.c; i++) {
            ((InterfaceC3917d93) this.b.get(i)).l(this, c5835k03, this.a);
        }
    }

    @Override // com.daaw.InterfaceC7659qX2, com.daaw.K83
    public /* synthetic */ Map zze() {
        return Collections.EMPTY_MAP;
    }
}
