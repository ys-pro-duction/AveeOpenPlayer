package com.daaw;

import com.daaw.InterfaceC0543Ck;

/* JADX INFO: renamed from: com.daaw.cj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3789cj0 implements InterfaceC0543Ck {
    public final String a;

    /* JADX INFO: renamed from: com.daaw.cj0$a */
    public static final class a extends AbstractC3789cj0 {
        public static final a b = new a();

        public a() {
            super("must be a member function", null);
        }

        @Override // com.daaw.InterfaceC0543Ck
        public boolean b(InterfaceC8468tR interfaceC8468tR) {
            G10.g(interfaceC8468tR, "functionDescriptor");
            return interfaceC8468tR.c0() != null;
        }
    }

    /* JADX INFO: renamed from: com.daaw.cj0$b */
    public static final class b extends AbstractC3789cj0 {
        public static final b b = new b();

        public b() {
            super("must be a member or an extension function", null);
        }

        @Override // com.daaw.InterfaceC0543Ck
        public boolean b(InterfaceC8468tR interfaceC8468tR) {
            G10.g(interfaceC8468tR, "functionDescriptor");
            return (interfaceC8468tR.c0() == null && interfaceC8468tR.i0() == null) ? false : true;
        }
    }

    public /* synthetic */ AbstractC3789cj0(String str, AbstractC2911Yw abstractC2911Yw) {
        this(str);
    }

    @Override // com.daaw.InterfaceC0543Ck
    public String a(InterfaceC8468tR interfaceC8468tR) {
        return InterfaceC0543Ck.a.a(this, interfaceC8468tR);
    }

    @Override // com.daaw.InterfaceC0543Ck
    public String getDescription() {
        return this.a;
    }

    public AbstractC3789cj0(String str) {
        this.a = str;
    }
}
