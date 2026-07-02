package com.daaw;

import com.daaw.InterfaceC0543Ck;

/* JADX INFO: renamed from: com.daaw.xc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9639xc1 implements InterfaceC0543Ck {
    public final String a;

    /* JADX INFO: renamed from: com.daaw.xc1$a */
    public static final class a extends AbstractC9639xc1 {
        public final int b;

        public a(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("must have at least ");
            sb.append(i);
            sb.append(" value parameter");
            sb.append(i > 1 ? "s" : "");
            super(sb.toString(), null);
            this.b = i;
        }

        @Override // com.daaw.InterfaceC0543Ck
        public boolean b(InterfaceC8468tR interfaceC8468tR) {
            G10.g(interfaceC8468tR, "functionDescriptor");
            return interfaceC8468tR.h().size() >= this.b;
        }
    }

    /* JADX INFO: renamed from: com.daaw.xc1$b */
    public static final class b extends AbstractC9639xc1 {
        public final int b;

        public b(int i) {
            super("must have exactly " + i + " value parameters", null);
            this.b = i;
        }

        @Override // com.daaw.InterfaceC0543Ck
        public boolean b(InterfaceC8468tR interfaceC8468tR) {
            G10.g(interfaceC8468tR, "functionDescriptor");
            return interfaceC8468tR.h().size() == this.b;
        }
    }

    /* JADX INFO: renamed from: com.daaw.xc1$c */
    public static final class c extends AbstractC9639xc1 {
        public static final c b = new c();

        public c() {
            super("must have no value parameters", null);
        }

        @Override // com.daaw.InterfaceC0543Ck
        public boolean b(InterfaceC8468tR interfaceC8468tR) {
            G10.g(interfaceC8468tR, "functionDescriptor");
            return interfaceC8468tR.h().isEmpty();
        }
    }

    /* JADX INFO: renamed from: com.daaw.xc1$d */
    public static final class d extends AbstractC9639xc1 {
        public static final d b = new d();

        public d() {
            super("must have a single value parameter", null);
        }

        @Override // com.daaw.InterfaceC0543Ck
        public boolean b(InterfaceC8468tR interfaceC8468tR) {
            G10.g(interfaceC8468tR, "functionDescriptor");
            return interfaceC8468tR.h().size() == 1;
        }
    }

    public /* synthetic */ AbstractC9639xc1(String str, AbstractC2911Yw abstractC2911Yw) {
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

    public AbstractC9639xc1(String str) {
        this.a = str;
    }
}
