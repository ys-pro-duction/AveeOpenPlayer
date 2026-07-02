package com.daaw;

/* JADX INFO: renamed from: com.daaw.wN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC9296wN {
    public static final NQ a = b.B;
    public static final InterfaceC3429bR b = a.B;

    /* JADX INFO: renamed from: com.daaw.wN$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public static final a B = new a();

        public a() {
            super(2);
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(G10.c(obj, obj2));
        }
    }

    public static final InterfaceC7058oN a(InterfaceC7058oN interfaceC7058oN) {
        return interfaceC7058oN instanceof InterfaceC6537mW0 ? interfaceC7058oN : b(interfaceC7058oN, a, b);
    }

    public static final InterfaceC7058oN b(InterfaceC7058oN interfaceC7058oN, NQ nq, InterfaceC3429bR interfaceC3429bR) {
        if (interfaceC7058oN instanceof DC) {
            DC dc = (DC) interfaceC7058oN;
            if (dc.C == nq && dc.D == interfaceC3429bR) {
                return interfaceC7058oN;
            }
        }
        return new DC(interfaceC7058oN, nq, interfaceC3429bR);
    }

    /* JADX INFO: renamed from: com.daaw.wN$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public static final b B = new b();

        public b() {
            super(1);
        }

        @Override // com.daaw.NQ
        public final Object invoke(Object obj) {
            return obj;
        }
    }
}
