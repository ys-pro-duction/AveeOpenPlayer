package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class SP1 extends UP1 {
    public final String B;
    public final int C;

    public SP1(String str, int i) {
        this.B = str;
        this.C = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof SP1)) {
            SP1 sp1 = (SP1) obj;
            if (AbstractC8022rp0.a(this.B, sp1.B)) {
                if (AbstractC8022rp0.a(Integer.valueOf(this.C), Integer.valueOf(sp1.C))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.daaw.VP1
    public final int zzb() {
        return this.C;
    }

    @Override // com.daaw.VP1
    public final String zzc() {
        return this.B;
    }
}
