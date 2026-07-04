package com.daaw;

/* JADX INFO: renamed from: com.daaw.ke0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6006ke0 implements Iterable, InterfaceC9783y60 {
    public static final a E = new a(null);
    public final long B;
    public final long C;
    public final long D;

    /* JADX INFO: renamed from: com.daaw.ke0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    public AbstractC6006ke0(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j3 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.B = j;
        this.C = AbstractC2612Vz0.d(j, j2, j3);
        this.D = j3;
    }

    public final long p() {
        return this.B;
    }

    public final long s() {
        return this.C;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public AbstractC5168he0 iterator() {
        return new C6294le0(this.B, this.C, this.D);
    }
}
