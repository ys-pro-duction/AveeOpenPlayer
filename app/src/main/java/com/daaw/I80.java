package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class I80 implements A7, O80 {
    public int B;

    public /* synthetic */ I80(AbstractC2911Yw abstractC2911Yw) {
        this();
    }

    public final int K0() {
        return N80.a(this) ? super.hashCode() : (((N0().hashCode() * 31) + L0().hashCode()) * 31) + (O0() ? 1 : 0);
    }

    public abstract List L0();

    public abstract C8387t71 M0();

    public abstract C71 N0();

    public abstract boolean O0();

    public abstract I80 P0(Q80 q80);

    public abstract AbstractC5708ja1 Q0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I80)) {
            return false;
        }
        I80 i80 = (I80) obj;
        return O0() == i80.O0() && C3736cY0.a.a(Q0(), i80.Q0());
    }

    @Override // com.daaw.A7
    public InterfaceC3072a8 getAnnotations() {
        return AbstractC4465f8.a(M0());
    }

    public final int hashCode() {
        int i = this.B;
        if (i != 0) {
            return i;
        }
        int iK0 = K0();
        this.B = iK0;
        return iK0;
    }

    public abstract InterfaceC4346ej0 q();

    public I80() {
    }
}
