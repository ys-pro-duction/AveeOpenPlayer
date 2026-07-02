package com.daaw;

import com.daaw.AbstractC4512fJ0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.g90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4760g90 {
    public final Object a = new Object();
    public List b = new ArrayList();
    public List c = new ArrayList();
    public boolean d = true;

    /* JADX INFO: renamed from: com.daaw.g90$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ InterfaceC3788cj C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3788cj interfaceC3788cj) {
            super(1);
            this.C = interfaceC3788cj;
        }

        public final void a(Throwable th) {
            Object obj = C4760g90.this.a;
            C4760g90 c4760g90 = C4760g90.this;
            InterfaceC3788cj interfaceC3788cj = this.C;
            synchronized (obj) {
                c4760g90.b.remove(interfaceC3788cj);
                G91 g91 = G91.a;
            }
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return G91.a;
        }
    }

    public final Object c(InterfaceC1416Ks interfaceC1416Ks) {
        if (e()) {
            return G91.a;
        }
        C4067dj c4067dj = new C4067dj(H10.b(interfaceC1416Ks), 1);
        c4067dj.y();
        synchronized (this.a) {
            this.b.add(c4067dj);
        }
        c4067dj.r(new a(c4067dj));
        Object objU = c4067dj.u();
        if (objU == I10.c()) {
            AbstractC7497pw.c(interfaceC1416Ks);
        }
        return objU == I10.c() ? objU : G91.a;
    }

    public final void d() {
        synchronized (this.a) {
            this.d = false;
            G91 g91 = G91.a;
        }
    }

    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            z = this.d;
        }
        return z;
    }

    public final void f() {
        synchronized (this.a) {
            try {
                if (e()) {
                    return;
                }
                List list = this.b;
                this.b = this.c;
                this.c = list;
                this.d = true;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC1416Ks interfaceC1416Ks = (InterfaceC1416Ks) list.get(i);
                    AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
                    interfaceC1416Ks.x(AbstractC4512fJ0.a(G91.a));
                }
                list.clear();
                G91 g91 = G91.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
