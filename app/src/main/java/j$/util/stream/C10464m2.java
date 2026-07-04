package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10464m2 extends Y {
    public final /* synthetic */ long m;
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10464m2(Z z, int i, long j, long j2) {
        super(z, i, 0);
        this.m = j;
        this.n = j2;
    }

    @Override // j$.util.stream.AbstractC10401a
    public final Spliterator K(AbstractC10401a abstractC10401a, Spliterator spliterator) {
        long jF = abstractC10401a.F(spliterator);
        long j = this.n;
        if (jF > 0 && spliterator.hasCharacteristics(16384)) {
            j$.util.V v = (j$.util.V) abstractC10401a.S(spliterator);
            long j2 = this.m;
            return new C10465m3(v, j2, AbstractC10497t1.A(j2, j));
        }
        if (V2.ORDERED.r(abstractC10401a.f)) {
            return ((E0) new C10493s2(this, abstractC10401a, spliterator, new C10402a0(15), this.m, this.n).invoke()).spliterator();
        }
        j$.util.V v2 = (j$.util.V) abstractC10401a.S(spliterator);
        long j3 = this.m;
        if (j3 <= jF) {
            long jMin = jF - j3;
            if (j >= 0) {
                jMin = Math.min(j, jMin);
            }
            j = jMin;
            j3 = 0;
        }
        return new C10494s3(v2, j3, j);
    }

    @Override // j$.util.stream.AbstractC10401a
    public final E0 J(AbstractC10401a abstractC10401a, Spliterator spliterator, IntFunction intFunction) {
        long jMin;
        long j;
        long jF = abstractC10401a.F(spliterator);
        if (jF <= 0 || !spliterator.hasCharacteristics(16384)) {
            if (!V2.ORDERED.r(abstractC10401a.f)) {
                j$.util.V v = (j$.util.V) abstractC10401a.S(spliterator);
                long j2 = this.m;
                long j3 = this.n;
                if (j2 <= jF) {
                    long j4 = jF - j2;
                    jMin = j3 >= 0 ? Math.min(j3, j4) : j4;
                    j = 0;
                } else {
                    jMin = j3;
                    j = j2;
                }
                return AbstractC10497t1.D(this, new C10494s3(v, j, jMin), true);
            }
            return (E0) new C10493s2(this, abstractC10401a, spliterator, intFunction, this.m, this.n).invoke();
        }
        AbstractC10401a abstractC10401a2 = abstractC10401a;
        while (abstractC10401a2.e > 0) {
            abstractC10401a2 = abstractC10401a2.b;
        }
        return AbstractC10497t1.D(abstractC10401a, AbstractC10497t1.y(abstractC10401a2.H(), spliterator, this.m, this.n), true);
    }

    @Override // j$.util.stream.AbstractC10401a
    public final InterfaceC10444i2 M(int i, InterfaceC10444i2 interfaceC10444i2) {
        return new C10459l2(this, interfaceC10444i2);
    }
}
