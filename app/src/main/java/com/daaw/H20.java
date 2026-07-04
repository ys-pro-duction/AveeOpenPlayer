package com.daaw;

import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public interface H20 {
    Set a(AP ap);

    InterfaceC5565j30 b(AP ap, boolean z);

    C20 c(a aVar);

    public static final class a {
        public final C6607ml a;
        public final byte[] b;
        public final C20 c;

        public a(C6607ml c6607ml, byte[] bArr, C20 c20) {
            G10.g(c6607ml, "classId");
            this.a = c6607ml;
            this.b = bArr;
            this.c = c20;
        }

        public final C6607ml a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return G10.c(this.a, aVar.a) && G10.c(this.b, aVar.b) && G10.c(this.c, aVar.c);
        }

        public int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            byte[] bArr = this.b;
            int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            C20 c20 = this.c;
            return iHashCode2 + (c20 != null ? c20.hashCode() : 0);
        }

        public String toString() {
            return "Request(classId=" + this.a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.b) + ", outerClass=" + this.c + ')';
        }

        public /* synthetic */ a(C6607ml c6607ml, byte[] bArr, C20 c20, int i, AbstractC2911Yw abstractC2911Yw) {
            this(c6607ml, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? null : c20);
        }
    }
}
