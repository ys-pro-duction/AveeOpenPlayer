package com.daaw;

/* JADX INFO: renamed from: com.daaw.me0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6573me0 extends AbstractC6006ke0 implements InterfaceC7728qm {
    public static final a F = new a(null);
    public static final C6573me0 G = new C6573me0(1, 0);

    /* JADX INFO: renamed from: com.daaw.me0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    public C6573me0(long j, long j2) {
        super(j, j2, 1L);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6573me0)) {
            return false;
        }
        if (isEmpty() && ((C6573me0) obj).isEmpty()) {
            return true;
        }
        C6573me0 c6573me0 = (C6573me0) obj;
        return p() == c6573me0.p() && s() == c6573me0.s();
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((((long) 31) * (p() ^ (p() >>> 32))) + (s() ^ (s() >>> 32)));
    }

    public boolean isEmpty() {
        return p() > s();
    }

    public String toString() {
        return p() + ".." + s();
    }
}
