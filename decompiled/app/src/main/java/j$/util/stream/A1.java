package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: loaded from: classes2.dex */
public final class A1 extends AbstractC10497t1 {
    public final /* synthetic */ int h;

    public /* synthetic */ A1(int i) {
        this.h = i;
    }

    @Override // j$.util.stream.AbstractC10497t1
    public final O1 Z() {
        switch (this.h) {
            case 0:
                return new S1();
            case 1:
                return new Q1();
            case 2:
                return new T1();
            default:
                return new R1();
        }
    }

    @Override // j$.util.stream.AbstractC10497t1, j$.util.stream.D3
    public final Object b(AbstractC10401a abstractC10401a, Spliterator spliterator) {
        switch (this.h) {
            case 0:
                if (!V2.SIZED.r(abstractC10401a.f)) {
                }
                break;
            case 1:
                if (!V2.SIZED.r(abstractC10401a.f)) {
                }
                break;
            case 2:
                if (!V2.SIZED.r(abstractC10401a.f)) {
                }
                break;
            default:
                if (!V2.SIZED.r(abstractC10401a.f)) {
                }
                break;
        }
        return (Long) super.b(abstractC10401a, spliterator);
    }

    @Override // j$.util.stream.AbstractC10497t1, j$.util.stream.D3
    public final Object c(AbstractC10401a abstractC10401a, Spliterator spliterator) {
        switch (this.h) {
            case 0:
                if (!V2.SIZED.r(abstractC10401a.f)) {
                }
                break;
            case 1:
                if (!V2.SIZED.r(abstractC10401a.f)) {
                }
                break;
            case 2:
                if (!V2.SIZED.r(abstractC10401a.f)) {
                }
                break;
            default:
                if (!V2.SIZED.r(abstractC10401a.f)) {
                }
                break;
        }
        return (Long) super.c(abstractC10401a, spliterator);
    }

    @Override // j$.util.stream.AbstractC10497t1, j$.util.stream.D3
    public final int d() {
        switch (this.h) {
        }
        return V2.r;
    }
}
