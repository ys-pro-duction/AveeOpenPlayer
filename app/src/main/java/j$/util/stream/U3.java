package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class U3 extends AbstractC10416d {
    public final AbstractC10401a h;
    public final IntFunction i;
    public final boolean j;
    public long k;
    public long l;

    @Override // j$.util.stream.AbstractC10416d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC10416d abstractC10416d = this.d;
        if (abstractC10416d != null) {
            if (this.j) {
                U3 u3 = (U3) abstractC10416d;
                long j = u3.l;
                this.l = j;
                if (j == u3.k) {
                    this.l = j + ((U3) this.e).l;
                }
            }
            U3 u32 = (U3) abstractC10416d;
            long j2 = u32.k;
            U3 u33 = (U3) this.e;
            this.k = j2 + u33.k;
            E0 e0F = u32.k == 0 ? (E0) u33.f : u33.k == 0 ? (E0) u32.f : AbstractC10497t1.F(this.h.H(), (E0) ((U3) this.d).f, (E0) ((U3) this.e).f);
            if (b() && this.j) {
                e0F = e0F.h(this.l, e0F.count(), this.i);
            }
            this.f = e0F;
        }
        super.onCompletion(countedCompleter);
    }

    public U3(AbstractC10401a abstractC10401a, AbstractC10401a abstractC10401a2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC10401a2, spliterator);
        this.h = abstractC10401a;
        this.i = intFunction;
        this.j = V2.ORDERED.r(abstractC10401a2.f);
    }

    public U3(U3 u3, Spliterator spliterator) {
        super(u3, spliterator);
        this.h = u3.h;
        this.i = u3.i;
        this.j = u3.j;
    }

    @Override // j$.util.stream.AbstractC10416d
    public final AbstractC10416d c(Spliterator spliterator) {
        return new U3(this, spliterator);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // j$.util.stream.AbstractC10416d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a() {
        /*
            r5 = this;
            boolean r0 = r5.b()
            if (r0 != 0) goto L1c
            boolean r1 = r5.j
            if (r1 == 0) goto L1c
            j$.util.stream.V2 r1 = j$.util.stream.V2.SIZED
            j$.util.stream.a r2 = r5.h
            int r3 = r2.c
            int r1 = r1.e
            r3 = r3 & r1
            if (r3 != r1) goto L1c
            j$.util.Spliterator r1 = r5.b
            long r1 = r2.F(r1)
            goto L1e
        L1c:
            r1 = -1
        L1e:
            j$.util.stream.a r3 = r5.a
            java.util.function.IntFunction r4 = r5.i
            j$.util.stream.w0 r1 = r3.I(r1, r4)
            j$.util.stream.a r2 = r5.h
            j$.util.stream.S3 r2 = (j$.util.stream.S3) r2
            boolean r3 = r5.j
            if (r3 == 0) goto L32
            if (r0 != 0) goto L32
            r0 = 1
            goto L33
        L32:
            r0 = 0
        L33:
            j$.util.stream.T3 r0 = r2.j(r1, r0)
            j$.util.stream.a r2 = r5.a
            j$.util.Spliterator r3 = r5.b
            r2.Q(r3, r0)
            j$.util.stream.E0 r1 = r1.a()
            long r2 = r1.count()
            r5.k = r2
            long r2 = r0.f()
            r5.l = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.U3.a():java.lang.Object");
    }
}
