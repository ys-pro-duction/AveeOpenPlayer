package j$.util;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10393k implements Iterator, InterfaceC10534x {
    public final /* synthetic */ int a = 0;
    public final Iterator b;

    public C10393k(C10394l c10394l) {
        this.b = c10394l.a.iterator();
    }

    @Override // java.util.Iterator, j$.util.InterfaceC10534x
    public final void forEachRemaining(Consumer consumer) {
        switch (this.a) {
            case 0:
                j$.com.android.tools.r8.a.L(this.b, consumer);
                break;
            default:
                j$.com.android.tools.r8.a.L(this.b, new C10397o(0, consumer));
                break;
        }
    }

    public C10393k(r rVar) {
        this.b = rVar.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return this.b.next();
            default:
                return new C10398p((Map.Entry) this.b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
