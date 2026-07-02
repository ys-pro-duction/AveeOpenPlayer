package com.daaw;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.a8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3072a8 extends Iterable, InterfaceC9783y60 {
    public static final a b = a.a;

    /* JADX INFO: renamed from: com.daaw.a8$a */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final InterfaceC3072a8 b = new C0147a();

        /* JADX INFO: renamed from: com.daaw.a8$a$a, reason: collision with other inner class name */
        public static final class C0147a implements InterfaceC3072a8 {
            public Void e(AP ap) {
                G10.g(ap, "fqName");
                return null;
            }

            @Override // com.daaw.InterfaceC3072a8
            public /* bridge */ /* synthetic */ O7 i(AP ap) {
                return (O7) e(ap);
            }

            @Override // com.daaw.InterfaceC3072a8
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return AbstractC1599Mm.k().iterator();
            }

            public String toString() {
                return "EMPTY";
            }

            @Override // com.daaw.InterfaceC3072a8
            public boolean z(AP ap) {
                return b.b(this, ap);
            }
        }

        public final InterfaceC3072a8 a(List list) {
            G10.g(list, "annotations");
            return list.isEmpty() ? b : new C3629c8(list);
        }

        public final InterfaceC3072a8 b() {
            return b;
        }
    }

    /* JADX INFO: renamed from: com.daaw.a8$b */
    public static final class b {
        public static O7 a(InterfaceC3072a8 interfaceC3072a8, AP ap) {
            Object next;
            G10.g(ap, "fqName");
            Iterator it = interfaceC3072a8.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (G10.c(((O7) next).d(), ap)) {
                    break;
                }
            }
            return (O7) next;
        }

        public static boolean b(InterfaceC3072a8 interfaceC3072a8, AP ap) {
            G10.g(ap, "fqName");
            return interfaceC3072a8.i(ap) != null;
        }
    }

    O7 i(AP ap);

    boolean isEmpty();

    boolean z(AP ap);
}
