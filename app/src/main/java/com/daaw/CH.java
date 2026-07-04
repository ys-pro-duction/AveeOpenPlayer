package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CH extends AbstractC2887Yq {
    public static final a b = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final CH a(String str) {
            G10.g(str, "message");
            return new b(str);
        }

        public a() {
        }
    }

    public static final class b extends CH {
        public final String c;

        public b(String str) {
            G10.g(str, "message");
            this.c = str;
        }

        @Override // com.daaw.AbstractC2887Yq
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C9830yH a(InterfaceC2968Zk0 interfaceC2968Zk0) {
            G10.g(interfaceC2968Zk0, "module");
            return BH.d(AH.K0, this.c);
        }

        @Override // com.daaw.AbstractC2887Yq
        public String toString() {
            return this.c;
        }
    }

    public CH() {
        super(G91.a);
    }

    @Override // com.daaw.AbstractC2887Yq
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public G91 b() {
        throw new UnsupportedOperationException();
    }
}
