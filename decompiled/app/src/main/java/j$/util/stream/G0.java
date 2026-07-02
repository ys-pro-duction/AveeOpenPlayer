package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class G0 implements E0 {
    public final E0 a;
    public final E0 b;
    public final long c;

    @Override // j$.util.stream.E0
    public final int q() {
        return 2;
    }

    public G0(E0 e0, E0 e02) {
        this.a = e0;
        this.b = e02;
        this.c = e02.count() + e0.count();
    }

    @Override // j$.util.stream.E0
    public final E0 b(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.E0
    public final long count() {
        return this.c;
    }

    @Override // j$.util.stream.E0
    public /* bridge */ /* synthetic */ D0 b(int i) {
        return (D0) b(i);
    }
}
