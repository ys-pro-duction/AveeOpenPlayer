package com.daaw;

import com.google.android.exoplayer2.Format;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public interface Z41 {

    public static final class a {
        public final int a;
        public final byte[] b;
        public final int c;
        public final int d;

        public a(int i, byte[] bArr, int i2, int i3) {
            this.a = i;
            this.b = bArr;
            this.c = i2;
            this.d = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.a == aVar.a && this.c == aVar.c && this.d == aVar.d && Arrays.equals(this.b, aVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.a * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
        }
    }

    void a(long j, int i, int i2, int i3, a aVar);

    int b(InterfaceC9001vJ interfaceC9001vJ, int i, boolean z);

    void c(C2584Vs0 c2584Vs0, int i);

    void d(Format format);
}
