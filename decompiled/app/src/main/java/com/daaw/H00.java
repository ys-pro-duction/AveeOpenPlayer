package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class H00 extends F00 implements InterfaceC7728qm {
    public static final a F = new a(null);
    public static final H00 G = new H00(1, 0);

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final H00 a() {
            return H00.G;
        }

        public a() {
        }
    }

    public H00(int i, int i2) {
        super(i, i2, 1);
    }

    public Integer D() {
        return Integer.valueOf(s());
    }

    public Integer E() {
        return Integer.valueOf(p());
    }

    @Override // com.daaw.F00
    public boolean equals(Object obj) {
        if (!(obj instanceof H00)) {
            return false;
        }
        if (isEmpty() && ((H00) obj).isEmpty()) {
            return true;
        }
        H00 h00 = (H00) obj;
        return p() == h00.p() && s() == h00.s();
    }

    @Override // com.daaw.F00
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (p() * 31) + s();
    }

    @Override // com.daaw.F00
    public boolean isEmpty() {
        return p() > s();
    }

    @Override // com.daaw.F00
    public String toString() {
        return p() + ".." + s();
    }
}
