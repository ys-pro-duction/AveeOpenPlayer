package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10520y extends AbstractC10525z {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC10520y(AbstractC10401a abstractC10401a, int i, int i2) {
        super(abstractC10401a, i);
        this.l = i2;
    }

    @Override // j$.util.stream.AbstractC10401a
    public final boolean L() {
        switch (this.l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.AbstractC10401a, j$.util.stream.InterfaceC10431g
    public final C sequential() {
        switch (this.l) {
            case 0:
                this.a.k = false;
                break;
            default:
                this.a.k = false;
                break;
        }
        return this;
    }

    @Override // j$.util.stream.AbstractC10401a, j$.util.stream.InterfaceC10431g
    public final C parallel() {
        switch (this.l) {
            case 0:
                this.a.k = true;
                break;
            default:
                this.a.k = true;
                break;
        }
        return this;
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final InterfaceC10431g unordered() {
        switch (this.l) {
            case 0:
                if (!V2.ORDERED.r(this.f)) {
                }
                break;
            default:
                if (!V2.ORDERED.r(this.f)) {
                }
                break;
        }
        return new C10490s(this, V2.r, 1);
    }

    @Override // j$.util.stream.AbstractC10401a, j$.util.stream.InterfaceC10431g
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        switch (this.l) {
        }
        return spliterator();
    }
}
