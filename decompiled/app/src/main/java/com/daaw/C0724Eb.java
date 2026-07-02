package com.daaw;

import com.daaw.InterfaceC3644cB0;

/* JADX INFO: renamed from: com.daaw.Eb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0724Eb {
    public int a;
    public InterfaceC3644cB0.a b = InterfaceC3644cB0.a.DEFAULT;

    /* JADX INFO: renamed from: com.daaw.Eb$a */
    public static final class a implements InterfaceC3644cB0 {
        public final int a;
        public final InterfaceC3644cB0.a b;

        public a(int i, InterfaceC3644cB0.a aVar) {
            this.a = i;
            this.b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return InterfaceC3644cB0.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InterfaceC3644cB0)) {
                return false;
            }
            InterfaceC3644cB0 interfaceC3644cB0 = (InterfaceC3644cB0) obj;
            return this.a == interfaceC3644cB0.tag() && this.b.equals(interfaceC3644cB0.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.a) + (this.b.hashCode() ^ 2041407134);
        }

        @Override // com.daaw.InterfaceC3644cB0
        public InterfaceC3644cB0.a intEncoding() {
            return this.b;
        }

        @Override // com.daaw.InterfaceC3644cB0
        public int tag() {
            return this.a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + this.b + ')';
        }
    }

    public static C0724Eb b() {
        return new C0724Eb();
    }

    public InterfaceC3644cB0 a() {
        return new a(this.a, this.b);
    }

    public C0724Eb c(int i) {
        this.a = i;
        return this;
    }
}
