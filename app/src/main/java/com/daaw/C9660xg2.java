package com.daaw;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.xg2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9660xg2 {
    public final OP2 a;
    public final List b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public C3503bh2 d;
    public C3503bh2 e;
    public boolean f;

    public C9660xg2(OP2 op2) {
        this.a = op2;
        C3503bh2 c3503bh2 = C3503bh2.e;
        this.d = c3503bh2;
        this.e = c3503bh2;
        this.f = false;
    }

    public final C3503bh2 a(C3503bh2 c3503bh2) throws C0855Fh2 {
        if (c3503bh2.equals(C3503bh2.e)) {
            throw new C0855Fh2("Unhandled input format:", c3503bh2);
        }
        for (int i = 0; i < this.a.size(); i++) {
            InterfaceC6028ki2 interfaceC6028ki2 = (InterfaceC6028ki2) this.a.get(i);
            C3503bh2 c3503bh2A = interfaceC6028ki2.a(c3503bh2);
            if (interfaceC6028ki2.zzg()) {
                AbstractC6048km2.f(!c3503bh2A.equals(C3503bh2.e));
                c3503bh2 = c3503bh2A;
            }
        }
        this.e = c3503bh2;
        return c3503bh2;
    }

    public final ByteBuffer b() {
        if (!h()) {
            return InterfaceC6028ki2.a;
        }
        ByteBuffer byteBuffer = this.c[i()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        j(InterfaceC6028ki2.a);
        return this.c[i()];
    }

    public final void c() {
        this.b.clear();
        this.d = this.e;
        this.f = false;
        for (int i = 0; i < this.a.size(); i++) {
            InterfaceC6028ki2 interfaceC6028ki2 = (InterfaceC6028ki2) this.a.get(i);
            interfaceC6028ki2.zzc();
            if (interfaceC6028ki2.zzg()) {
                this.b.add(interfaceC6028ki2);
            }
        }
        this.c = new ByteBuffer[this.b.size()];
        for (int i2 = 0; i2 <= i(); i2++) {
            this.c[i2] = ((InterfaceC6028ki2) this.b.get(i2)).zzb();
        }
    }

    public final void d() {
        if (!h() || this.f) {
            return;
        }
        this.f = true;
        ((InterfaceC6028ki2) this.b.get(0)).zzd();
    }

    public final void e(ByteBuffer byteBuffer) {
        if (!h() || this.f) {
            return;
        }
        j(byteBuffer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9660xg2)) {
            return false;
        }
        C9660xg2 c9660xg2 = (C9660xg2) obj;
        if (this.a.size() != c9660xg2.a.size()) {
            return false;
        }
        for (int i = 0; i < this.a.size(); i++) {
            if (this.a.get(i) != c9660xg2.a.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final void f() {
        for (int i = 0; i < this.a.size(); i++) {
            InterfaceC6028ki2 interfaceC6028ki2 = (InterfaceC6028ki2) this.a.get(i);
            interfaceC6028ki2.zzc();
            interfaceC6028ki2.zzf();
        }
        this.c = new ByteBuffer[0];
        C3503bh2 c3503bh2 = C3503bh2.e;
        this.d = c3503bh2;
        this.e = c3503bh2;
        this.f = false;
    }

    public final boolean g() {
        return this.f && ((InterfaceC6028ki2) this.b.get(i())).zzh() && !this.c[i()].hasRemaining();
    }

    public final boolean h() {
        return !this.b.isEmpty();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int i() {
        return this.c.length - 1;
    }

    public final void j(ByteBuffer byteBuffer) {
        boolean z;
        do {
            int i = 0;
            z = false;
            while (i <= i()) {
                int i2 = i + 1;
                if (!this.c[i].hasRemaining()) {
                    InterfaceC6028ki2 interfaceC6028ki2 = (InterfaceC6028ki2) this.b.get(i);
                    if (!interfaceC6028ki2.zzh()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : InterfaceC6028ki2.a;
                        long jRemaining = byteBuffer2.remaining();
                        interfaceC6028ki2.b(byteBuffer2);
                        this.c[i] = interfaceC6028ki2.zzb();
                        boolean z2 = true;
                        if (jRemaining - ((long) byteBuffer2.remaining()) <= 0 && !this.c[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    } else if (!this.c[i].hasRemaining() && i < i()) {
                        ((InterfaceC6028ki2) this.b.get(i2)).zzd();
                    }
                }
                i = i2;
            }
        } while (z);
    }
}
