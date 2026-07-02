package com.daaw;

import com.daaw.C3748cb;
import com.google.firebase.Timestamp;
import j$.util.DesugarCollections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.ab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3191ab implements InterfaceC6146l51 {
    public final List a;

    /* JADX INFO: renamed from: com.daaw.ab$a */
    public static class a extends AbstractC3191ab {
        public a(List list) {
            super(list);
        }

        @Override // com.daaw.AbstractC3191ab
        public C6564mc1 d(C6564mc1 c6564mc1) {
            C3748cb.b bVarE = AbstractC3191ab.e(c6564mc1);
            for (C6564mc1 c6564mc12 : f()) {
                int i = 0;
                while (i < bVarE.A()) {
                    if (AbstractC0513Cc1.q(bVarE.z(i), c6564mc12)) {
                        bVarE.B(i);
                    } else {
                        i++;
                    }
                }
            }
            return (C6564mc1) C6564mc1.x0().x(bVarE).n();
        }
    }

    /* JADX INFO: renamed from: com.daaw.ab$b */
    public static class b extends AbstractC3191ab {
        public b(List list) {
            super(list);
        }

        @Override // com.daaw.AbstractC3191ab
        public C6564mc1 d(C6564mc1 c6564mc1) {
            C3748cb.b bVarE = AbstractC3191ab.e(c6564mc1);
            for (C6564mc1 c6564mc12 : f()) {
                if (!AbstractC0513Cc1.p(bVarE, c6564mc12)) {
                    bVarE.y(c6564mc12);
                }
            }
            return (C6564mc1) C6564mc1.x0().x(bVarE).n();
        }
    }

    public AbstractC3191ab(List list) {
        this.a = DesugarCollections.unmodifiableList(list);
    }

    public static C3748cb.b e(C6564mc1 c6564mc1) {
        return AbstractC0513Cc1.t(c6564mc1) ? (C3748cb.b) c6564mc1.l0().Y() : C3748cb.j0();
    }

    @Override // com.daaw.InterfaceC6146l51
    public C6564mc1 a(C6564mc1 c6564mc1, Timestamp timestamp) {
        return d(c6564mc1);
    }

    @Override // com.daaw.InterfaceC6146l51
    public C6564mc1 b(C6564mc1 c6564mc1) {
        return null;
    }

    @Override // com.daaw.InterfaceC6146l51
    public C6564mc1 c(C6564mc1 c6564mc1, C6564mc1 c6564mc12) {
        return d(c6564mc1);
    }

    public abstract C6564mc1 d(C6564mc1 c6564mc1);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((AbstractC3191ab) obj).a);
    }

    public List f() {
        return this.a;
    }

    public int hashCode() {
        return (getClass().hashCode() * 31) + this.a.hashCode();
    }
}
