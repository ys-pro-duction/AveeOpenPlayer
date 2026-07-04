package com.daaw;

import com.daaw.InterfaceC2827Yb;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.daaw.gN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4816gN implements InterfaceC2827Yb {
    public static final int h = Float.floatToIntBits(Float.NaN);
    public int b = -1;
    public int c = -1;
    public int d = 0;
    public ByteBuffer e;
    public ByteBuffer f;
    public boolean g;

    public C4816gN() {
        ByteBuffer byteBuffer = InterfaceC2827Yb.a;
        this.e = byteBuffer;
        this.f = byteBuffer;
    }

    public static void a(int i, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (iFloatToIntBits == h) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.daaw.InterfaceC2827Yb
    public boolean c() {
        return this.g && this.f == InterfaceC2827Yb.a;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public boolean d() {
        return AbstractC6280lb1.H(this.d);
    }

    @Override // com.daaw.InterfaceC2827Yb
    public ByteBuffer e() {
        ByteBuffer byteBuffer = this.f;
        this.f = InterfaceC2827Yb.a;
        return byteBuffer;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public void f(ByteBuffer byteBuffer) {
        boolean z = this.d == 1073741824;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (!z) {
            i = (i / 3) * 4;
        }
        if (this.e.capacity() < i) {
            this.e = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.e.clear();
        }
        if (z) {
            while (iPosition < iLimit) {
                a((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), this.e);
                iPosition += 4;
            }
        } else {
            while (iPosition < iLimit) {
                a(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), this.e);
                iPosition += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        this.e.flip();
        this.f = this.e;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public void flush() {
        this.f = InterfaceC2827Yb.a;
        this.g = false;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public int g() {
        return this.c;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public int h() {
        return this.b;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public int i() {
        return 4;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public void j() {
        this.g = true;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public boolean k(int i, int i2, int i3) throws InterfaceC2827Yb.a {
        if (!AbstractC6280lb1.H(i3)) {
            throw new InterfaceC2827Yb.a(i, i2, i3);
        }
        if (this.b == i && this.c == i2 && this.d == i3) {
            return false;
        }
        this.b = i;
        this.c = i2;
        this.d = i3;
        return true;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public void reset() {
        flush();
        this.b = -1;
        this.c = -1;
        this.d = 0;
        this.e = InterfaceC2827Yb.a;
    }
}
