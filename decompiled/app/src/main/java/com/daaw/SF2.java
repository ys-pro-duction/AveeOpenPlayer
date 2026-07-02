package com.daaw;

import j$.util.DesugarCollections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SF2 extends Je3 implements Mg3 {
    public /* synthetic */ SF2(NC2 nc2) {
        super(C9271wG2.zza);
    }

    public final int p() {
        return ((C9271wG2) this.C).C();
    }

    public final C7029oF2 q(int i) {
        return ((C9271wG2) this.C).E(i);
    }

    public final SF2 r() {
        n();
        ((C9271wG2) this.C).zzj = AbstractC3772cf3.p();
        return this;
    }

    public final SF2 t(int i, LE2 le2) {
        n();
        C9271wG2.Q((C9271wG2) this.C, i, (C7029oF2) le2.l());
        return this;
    }

    public final String u() {
        return ((C9271wG2) this.C).L();
    }

    public final List v() {
        return DesugarCollections.unmodifiableList(((C9271wG2) this.C).M());
    }

    public final List w() {
        return DesugarCollections.unmodifiableList(((C9271wG2) this.C).N());
    }
}
