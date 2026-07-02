package j$.util.stream;

import j$.util.C10397o;
import j$.util.Collection;
import j$.util.List;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class E2 extends AbstractC10513w2 {
    public ArrayList d;

    @Override // j$.util.stream.AbstractC10424e2, j$.util.stream.InterfaceC10444i2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
    }

    @Override // j$.util.stream.AbstractC10424e2, j$.util.stream.InterfaceC10444i2
    public final void k() {
        List.EL.sort(this.d, this.b);
        long size = this.d.size();
        InterfaceC10444i2 interfaceC10444i2 = this.a;
        interfaceC10444i2.l(size);
        if (!this.c) {
            ArrayList arrayList = this.d;
            Objects.requireNonNull(interfaceC10444i2);
            Collection.EL.a(arrayList, new C10397o(7, interfaceC10444i2));
        } else {
            ArrayList arrayList2 = this.d;
            int size2 = arrayList2.size();
            int i = 0;
            while (i < size2) {
                Object obj = arrayList2.get(i);
                i++;
                if (interfaceC10444i2.n()) {
                    break;
                } else {
                    interfaceC10444i2.p(obj);
                }
            }
        }
        interfaceC10444i2.k();
        this.d = null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) {
        this.d.add(obj);
    }
}
