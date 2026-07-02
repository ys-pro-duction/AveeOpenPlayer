package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public interface SR0 {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final SR0 b = new C4574fW0();
        public static final SR0 c = new C4853gW0();

        public static /* synthetic */ SR0 b(a aVar, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = 0;
            }
            if ((i & 2) != 0) {
                j2 = Long.MAX_VALUE;
            }
            return aVar.a(j, j2);
        }

        public final SR0 a(long j, long j2) {
            return new C5132hW0(j, j2);
        }

        public final SR0 c() {
            return b;
        }

        public final SR0 d() {
            return c;
        }
    }

    InterfaceC7058oN a(InterfaceC6537mW0 interfaceC6537mW0);
}
