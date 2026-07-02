package com.daaw;

/* JADX INFO: renamed from: com.daaw.v80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC8956v80 extends C80 {

    /* JADX INFO: renamed from: com.daaw.v80$a */
    public static abstract class a {

        /* JADX INFO: renamed from: com.daaw.v80$a$a, reason: collision with other inner class name */
        public static final class C0241a extends a {
            public final InterfaceC10072z80 a;
            public final byte[] b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0241a(InterfaceC10072z80 interfaceC10072z80, byte[] bArr) {
                super(null);
                G10.g(interfaceC10072z80, "kotlinJvmBinaryClass");
                this.a = interfaceC10072z80;
                this.b = bArr;
            }

            public final InterfaceC10072z80 b() {
                return this.a;
            }

            public /* synthetic */ C0241a(InterfaceC10072z80 interfaceC10072z80, byte[] bArr, int i, AbstractC2911Yw abstractC2911Yw) {
                this(interfaceC10072z80, (i & 2) != 0 ? null : bArr);
            }
        }

        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final InterfaceC10072z80 a() {
            C0241a c0241a = this instanceof C0241a ? (C0241a) this : null;
            if (c0241a != null) {
                return c0241a.b();
            }
            return null;
        }

        public a() {
        }
    }

    a a(C6607ml c6607ml, C4740g50 c4740g50);

    a b(C20 c20, C4740g50 c4740g50);
}
