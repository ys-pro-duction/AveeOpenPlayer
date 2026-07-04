package com.daaw;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class M73 implements Iterator, Closeable, InterfaceC2801Xu1, AutoCloseable {
    public static final InterfaceC2697Wu1 H = new L73("eof ");
    public static final T73 I = T73.b(M73.class);
    public InterfaceC2385Tu1 B;
    public N73 C;
    public InterfaceC2697Wu1 D = null;
    public long E = 0;
    public long F = 0;
    public final List G = new ArrayList();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        InterfaceC2697Wu1 interfaceC2697Wu1 = this.D;
        if (interfaceC2697Wu1 == H) {
            return false;
        }
        if (interfaceC2697Wu1 != null) {
            return true;
        }
        try {
            this.D = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.D = H;
            return false;
        }
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2697Wu1 next() {
        InterfaceC2697Wu1 interfaceC2697Wu1A;
        InterfaceC2697Wu1 interfaceC2697Wu1 = this.D;
        if (interfaceC2697Wu1 != null && interfaceC2697Wu1 != H) {
            this.D = null;
            return interfaceC2697Wu1;
        }
        N73 n73 = this.C;
        if (n73 == null || this.E >= this.F) {
            this.D = H;
            throw new NoSuchElementException();
        }
        try {
            synchronized (n73) {
                this.C.e(this.E);
                interfaceC2697Wu1A = this.B.a(this.C, this);
                this.E = this.C.zzb();
            }
            return interfaceC2697Wu1A;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public final List l() {
        return (this.C == null || this.D == H) ? this.G : new S73(this.G, this);
    }

    public final void o(N73 n73, long j, InterfaceC2385Tu1 interfaceC2385Tu1) {
        this.C = n73;
        this.E = n73.zzb();
        n73.e(n73.zzb() + j);
        this.F = n73.zzb();
        this.B = interfaceC2385Tu1;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.G.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((InterfaceC2697Wu1) this.G.get(i)).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
