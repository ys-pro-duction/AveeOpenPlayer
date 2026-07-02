package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class EO2 implements CO2 {
    public static final CO2 D = new CO2() { // from class: com.daaw.DO2
        @Override // com.daaw.CO2
        public final Object zza() {
            throw new IllegalStateException();
        }
    };
    public volatile CO2 B;
    public Object C;

    public EO2(CO2 co2) {
        this.B = co2;
    }

    public final String toString() {
        Object obj = this.B;
        if (obj == D) {
            obj = "<supplier that returned " + String.valueOf(this.C) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }

    @Override // com.daaw.CO2
    public final Object zza() {
        CO2 co2 = this.B;
        CO2 co22 = D;
        if (co2 != co22) {
            synchronized (this) {
                try {
                    if (this.B != co22) {
                        Object objZza = this.B.zza();
                        this.C = objZza;
                        this.B = co22;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.C;
    }
}
