package com.daaw;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class Wa3 implements Serializable, Ta3 {
    public final Ta3 B;
    public volatile transient boolean C;
    public transient Object D;

    public Wa3(Ta3 ta3) {
        ta3.getClass();
        this.B = ta3;
    }

    public final String toString() {
        Object obj;
        if (this.C) {
            obj = "<supplier that returned " + String.valueOf(this.D) + ">";
        } else {
            obj = this.B;
        }
        return "Suppliers.memoize(" + obj.toString() + ")";
    }

    @Override // com.daaw.Ta3
    public final Object zza() {
        if (!this.C) {
            synchronized (this) {
                try {
                    if (!this.C) {
                        Object objZza = this.B.zza();
                        this.D = objZza;
                        this.C = true;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.D;
    }
}
