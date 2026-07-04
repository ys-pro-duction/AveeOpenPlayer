package com.daaw;

/* JADX INFO: renamed from: com.daaw.cb3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3752cb3 implements Ta3 {
    public static final Ta3 D = new Ta3() { // from class: com.daaw.Za3
        @Override // com.daaw.Ta3
        public final Object zza() {
            throw new IllegalStateException();
        }
    };
    public volatile Ta3 B;
    public Object C;

    public C3752cb3(Ta3 ta3) {
        ta3.getClass();
        this.B = ta3;
    }

    public final String toString() {
        Object obj = this.B;
        if (obj == D) {
            obj = "<supplier that returned " + String.valueOf(this.C) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }

    @Override // com.daaw.Ta3
    public final Object zza() {
        Ta3 ta3 = this.B;
        Ta3 ta32 = D;
        if (ta3 != ta32) {
            synchronized (this) {
                try {
                    if (this.B != ta32) {
                        Object objZza = this.B.zza();
                        this.C = objZza;
                        this.B = ta32;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.C;
    }
}
