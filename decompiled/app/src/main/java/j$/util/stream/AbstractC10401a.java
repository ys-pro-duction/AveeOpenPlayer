package j$.util.stream;

import j$.util.C10397o;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10401a implements InterfaceC10431g, AutoCloseable {
    public final AbstractC10401a a;
    public final AbstractC10401a b;
    public final int c;
    public final AbstractC10401a d;
    public int e;
    public int f;
    public Spliterator g;
    public boolean h;
    public final boolean i;
    public Runnable j;
    public boolean k;

    public abstract E0 E(AbstractC10401a abstractC10401a, Spliterator spliterator, boolean z, IntFunction intFunction);

    public abstract boolean G(Spliterator spliterator, InterfaceC10444i2 interfaceC10444i2);

    public abstract W2 H();

    public abstract InterfaceC10511w0 I(long j, IntFunction intFunction);

    public abstract boolean L();

    public abstract InterfaceC10444i2 M(int i, InterfaceC10444i2 interfaceC10444i2);

    public abstract Spliterator P(AbstractC10401a abstractC10401a, Supplier supplier, boolean z);

    public AbstractC10401a(Spliterator spliterator, int i, boolean z) {
        this.b = null;
        this.g = spliterator;
        this.a = this;
        int i2 = V2.g & i;
        this.c = i2;
        this.f = (~(i2 << 1)) & V2.l;
        this.e = 0;
        this.k = z;
    }

    public AbstractC10401a(AbstractC10401a abstractC10401a, int i) {
        if (abstractC10401a.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractC10401a.h = true;
        abstractC10401a.d = this;
        this.b = abstractC10401a;
        this.c = V2.h & i;
        this.f = V2.k(i, abstractC10401a.f);
        AbstractC10401a abstractC10401a2 = abstractC10401a.a;
        this.a = abstractC10401a2;
        if (L()) {
            abstractC10401a2.i = true;
        }
        this.e = abstractC10401a.e + 1;
    }

    public final Object C(D3 d3) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        if (this.a.k) {
            return d3.c(this, N(d3.d()));
        }
        return d3.b(this, N(d3.d()));
    }

    public final E0 D(IntFunction intFunction) {
        AbstractC10401a abstractC10401a;
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        if (this.a.k && (abstractC10401a = this.b) != null && L()) {
            this.e = 0;
            return J(abstractC10401a, abstractC10401a.N(0), intFunction);
        }
        return B(N(0), true, intFunction);
    }

    public final Spliterator O() {
        AbstractC10401a abstractC10401a = this.a;
        if (this != abstractC10401a) {
            throw new IllegalStateException();
        }
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        Spliterator spliterator = abstractC10401a.g;
        if (spliterator != null) {
            abstractC10401a.g = null;
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final InterfaceC10431g sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final InterfaceC10431g parallel() {
        this.a.k = true;
        return this;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.h = true;
        this.g = null;
        AbstractC10401a abstractC10401a = this.a;
        Runnable runnable = abstractC10401a.j;
        if (runnable != null) {
            abstractC10401a.j = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final InterfaceC10431g onClose(Runnable runnable) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        Objects.requireNonNull(runnable);
        AbstractC10401a abstractC10401a = this.a;
        Runnable runnable2 = abstractC10401a.j;
        if (runnable2 != null) {
            runnable = new A3(0, runnable2, runnable);
        }
        abstractC10401a.j = runnable;
        return this;
    }

    @Override // j$.util.stream.InterfaceC10431g
    public Spliterator spliterator() {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        AbstractC10401a abstractC10401a = this.a;
        if (this == abstractC10401a) {
            Spliterator spliterator = abstractC10401a.g;
            if (spliterator != null) {
                abstractC10401a.g = null;
                return spliterator;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        return P(this, new C10397o(2, this), abstractC10401a.k);
    }

    public final E0 B(Spliterator spliterator, boolean z, IntFunction intFunction) {
        if (this.a.k) {
            return E(this, spliterator, z, intFunction);
        }
        InterfaceC10511w0 interfaceC10511w0I = I(F(spliterator), intFunction);
        Q(spliterator, interfaceC10511w0I);
        return interfaceC10511w0I.a();
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final boolean isParallel() {
        return this.a.k;
    }

    public final Spliterator N(int i) {
        int i2;
        int i3;
        AbstractC10401a abstractC10401a = this.a;
        Spliterator spliteratorK = abstractC10401a.g;
        if (spliteratorK != null) {
            abstractC10401a.g = null;
            if (abstractC10401a.k && abstractC10401a.i) {
                AbstractC10401a abstractC10401a2 = abstractC10401a.d;
                int i4 = 1;
                while (abstractC10401a != this) {
                    int i5 = abstractC10401a2.c;
                    if (abstractC10401a2.L()) {
                        if (V2.SHORT_CIRCUIT.r(i5)) {
                            i5 &= ~V2.u;
                        }
                        spliteratorK = abstractC10401a2.K(abstractC10401a, spliteratorK);
                        if (spliteratorK.hasCharacteristics(64)) {
                            i2 = (~V2.t) & i5;
                            i3 = V2.s;
                        } else {
                            i2 = (~V2.s) & i5;
                            i3 = V2.t;
                        }
                        i5 = i2 | i3;
                        i4 = 0;
                    }
                    int i6 = i4 + 1;
                    abstractC10401a2.e = i4;
                    abstractC10401a2.f = V2.k(i5, abstractC10401a.f);
                    AbstractC10401a abstractC10401a3 = abstractC10401a2;
                    abstractC10401a2 = abstractC10401a2.d;
                    abstractC10401a = abstractC10401a3;
                    i4 = i6;
                }
            }
            if (i != 0) {
                this.f = V2.k(i, this.f);
            }
            return spliteratorK;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    public final long F(Spliterator spliterator) {
        if (V2.SIZED.r(this.f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    public final InterfaceC10444i2 Q(Spliterator spliterator, InterfaceC10444i2 interfaceC10444i2) {
        z(spliterator, R((InterfaceC10444i2) Objects.requireNonNull(interfaceC10444i2)));
        return interfaceC10444i2;
    }

    public final void z(Spliterator spliterator, InterfaceC10444i2 interfaceC10444i2) {
        Objects.requireNonNull(interfaceC10444i2);
        if (!V2.SHORT_CIRCUIT.r(this.f)) {
            interfaceC10444i2.l(spliterator.getExactSizeIfKnown());
            spliterator.forEachRemaining(interfaceC10444i2);
            interfaceC10444i2.k();
            return;
        }
        A(spliterator, interfaceC10444i2);
    }

    public final boolean A(Spliterator spliterator, InterfaceC10444i2 interfaceC10444i2) {
        AbstractC10401a abstractC10401a = this;
        while (abstractC10401a.e > 0) {
            abstractC10401a = abstractC10401a.b;
        }
        interfaceC10444i2.l(spliterator.getExactSizeIfKnown());
        boolean zG = abstractC10401a.G(spliterator, interfaceC10444i2);
        interfaceC10444i2.k();
        return zG;
    }

    public final InterfaceC10444i2 R(InterfaceC10444i2 interfaceC10444i2) {
        Objects.requireNonNull(interfaceC10444i2);
        AbstractC10401a abstractC10401a = this;
        while (abstractC10401a.e > 0) {
            AbstractC10401a abstractC10401a2 = abstractC10401a.b;
            interfaceC10444i2 = abstractC10401a.M(abstractC10401a2.f, interfaceC10444i2);
            abstractC10401a = abstractC10401a2;
        }
        return interfaceC10444i2;
    }

    public final Spliterator S(Spliterator spliterator) {
        return this.e == 0 ? spliterator : P(this, new C10397o(3, spliterator), this.a.k);
    }

    public E0 J(AbstractC10401a abstractC10401a, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    public Spliterator K(AbstractC10401a abstractC10401a, Spliterator spliterator) {
        return J(abstractC10401a, spliterator, new j$.time.f(10)).spliterator();
    }
}
