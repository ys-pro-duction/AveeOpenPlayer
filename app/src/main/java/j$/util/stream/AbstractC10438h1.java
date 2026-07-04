package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;

/* JADX INFO: renamed from: j$.util.stream.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10438h1 implements Spliterator {
    public E0 a;
    public int b;
    public Spliterator c;
    public Spliterator d;
    public ArrayDeque e;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.com.android.tools.r8.a.o(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.com.android.tools.r8.a.q(this, i);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public AbstractC10438h1(E0 e0) {
        this.a = e0;
    }

    public final ArrayDeque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int iQ = this.a.q();
        while (true) {
            iQ--;
            if (iQ < this.b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.a.b(iQ));
        }
    }

    public static E0 a(ArrayDeque arrayDeque) {
        while (true) {
            E0 e0 = (E0) arrayDeque.pollFirst();
            if (e0 == null) {
                return null;
            }
            if (e0.q() != 0) {
                for (int iQ = e0.q() - 1; iQ >= 0; iQ--) {
                    arrayDeque.addFirst(e0.b(iQ));
                }
            } else if (e0.count() > 0) {
                return e0;
            }
        }
    }

    public final boolean c() {
        if (this.a == null) {
            return false;
        }
        if (this.d != null) {
            return true;
        }
        Spliterator spliterator = this.c;
        if (spliterator == null) {
            ArrayDeque arrayDequeB = b();
            this.e = arrayDequeB;
            E0 e0A = a(arrayDequeB);
            if (e0A != null) {
                this.d = e0A.spliterator();
                return true;
            }
            this.a = null;
            return false;
        }
        this.d = spliterator;
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        E0 e0 = this.a;
        if (e0 == null || this.d != null) {
            return null;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.b < e0.q() - 1) {
            E0 e02 = this.a;
            int i = this.b;
            this.b = i + 1;
            return e02.b(i).spliterator();
        }
        E0 e0B = this.a.b(this.b);
        this.a = e0B;
        if (e0B.q() == 0) {
            Spliterator spliterator2 = this.a.spliterator();
            this.c = spliterator2;
            return spliterator2.trySplit();
        }
        E0 e03 = this.a;
        this.b = 1;
        return e03.b(0).spliterator();
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long jCount = 0;
        if (this.a == null) {
            return 0L;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i = this.b; i < this.a.q(); i++) {
            jCount += this.a.b(i).count();
        }
        return jCount;
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.b0 trySplit() {
        return (j$.util.b0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.V trySplit() {
        return (j$.util.V) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.Y trySplit() {
        return (j$.util.Y) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.S trySplit() {
        return (j$.util.S) trySplit();
    }
}
