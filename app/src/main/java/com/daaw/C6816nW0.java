package com.daaw;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: com.daaw.nW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C6816nW0 extends AbstractC6398m0 implements InterfaceC8286sm0, InterfaceC7058oN, IR {
    public static final AtomicReferenceFieldUpdater G = AtomicReferenceFieldUpdater.newUpdater(C6816nW0.class, Object.class, "_state");
    public int F;
    private volatile Object _state;

    /* JADX INFO: renamed from: com.daaw.nW0$a */
    public static final class a extends AbstractC1623Ms {
        public Object E;
        public Object F;
        public Object G;
        public Object H;
        public Object I;
        public /* synthetic */ Object J;
        public int L;

        public a(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.J = obj;
            this.L |= Integer.MIN_VALUE;
            return C6816nW0.this.a(null, this);
        }
    }

    public C6816nW0(Object obj) {
        this._state = obj;
    }

    /* JADX WARN: Path cross not found for [B:29:0x008f, B:45:0x00c3], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:33:0x009c, B:35:0x00a2], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:35:0x00a2, B:33:0x009c], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:35:0x00a2, B:43:0x00bd], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:45:0x00c3, B:29:0x008f], limit reached: 48 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0097, B:33:0x009c, B:43:0x00bd, B:45:0x00c3, B:35:0x00a2, B:39:0x00a9, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0097, B:33:0x009c, B:43:0x00bd, B:45:0x00c3, B:35:0x00a2, B:39:0x00a9, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0097, B:33:0x009c, B:43:0x00bd, B:45:0x00c3, B:35:0x00a2, B:39:0x00a9, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00c1 -> B:29:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00d3 -> B:29:0x008f). Please report as a decompilation issue!!! */
    @Override // com.daaw.HR0, com.daaw.InterfaceC7058oN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.daaw.InterfaceC7337pN r11, com.daaw.InterfaceC1416Ks r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C6816nW0.a(com.daaw.pN, com.daaw.Ks):java.lang.Object");
    }

    @Override // com.daaw.IR
    public InterfaceC7058oN b(InterfaceC4684ft interfaceC4684ft, int i, EnumC5182hh enumC5182hh) {
        return AbstractC7095oW0.d(this, interfaceC4684ft, i, enumC5182hh);
    }

    @Override // com.daaw.InterfaceC7450pm0, com.daaw.InterfaceC7337pN
    public Object c(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
        setValue(obj);
        return G91.a;
    }

    @Override // com.daaw.InterfaceC8286sm0
    public boolean d(Object obj, Object obj2) {
        if (obj == null) {
            obj = AbstractC2360To0.a;
        }
        if (obj2 == null) {
            obj2 = AbstractC2360To0.a;
        }
        return r(obj, obj2);
    }

    @Override // com.daaw.InterfaceC8286sm0, com.daaw.InterfaceC6537mW0
    public Object getValue() {
        YZ0 yz0 = AbstractC2360To0.a;
        Object obj = G.get(this);
        if (obj == yz0) {
            return null;
        }
        return obj;
    }

    @Override // com.daaw.InterfaceC7450pm0
    public void i() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // com.daaw.InterfaceC7450pm0
    public boolean j(Object obj) {
        setValue(obj);
        return true;
    }

    @Override // com.daaw.AbstractC6398m0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public C7374pW0 h() {
        return new C7374pW0();
    }

    @Override // com.daaw.AbstractC6398m0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public C7374pW0[] l(int i) {
        return new C7374pW0[i];
    }

    public final boolean r(Object obj, Object obj2) {
        int i;
        AbstractC6956o0[] abstractC6956o0ArrO;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = G;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !G10.c(obj3, obj)) {
                return false;
            }
            if (G10.c(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.F;
            if ((i2 & 1) != 0) {
                this.F = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.F = i3;
            AbstractC6956o0[] abstractC6956o0ArrO2 = o();
            G91 g91 = G91.a;
            while (true) {
                C7374pW0[] c7374pW0Arr = (C7374pW0[]) abstractC6956o0ArrO2;
                if (c7374pW0Arr != null) {
                    for (C7374pW0 c7374pW0 : c7374pW0Arr) {
                        if (c7374pW0 != null) {
                            c7374pW0.g();
                        }
                    }
                }
                synchronized (this) {
                    i = this.F;
                    if (i == i3) {
                        this.F = i3 + 1;
                        return true;
                    }
                    abstractC6956o0ArrO = o();
                    G91 g912 = G91.a;
                }
                abstractC6956o0ArrO2 = abstractC6956o0ArrO;
                i3 = i;
            }
        }
    }

    @Override // com.daaw.InterfaceC8286sm0
    public void setValue(Object obj) {
        if (obj == null) {
            obj = AbstractC2360To0.a;
        }
        r(null, obj);
    }
}
