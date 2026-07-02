package com.daaw;

import com.daaw.InterfaceC2827Yb;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.nk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6881nk implements InterfaceC2827Yb {
    public int b;
    public int c;
    public int[] d;
    public boolean e;
    public int[] f;
    public ByteBuffer g;
    public ByteBuffer h;
    public boolean i;

    public C6881nk() {
        ByteBuffer byteBuffer = InterfaceC2827Yb.a;
        this.g = byteBuffer;
        this.h = byteBuffer;
        this.b = -1;
        this.c = -1;
    }

    public void a(int[] iArr) {
        this.d = iArr;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public boolean c() {
        return this.i && this.h == InterfaceC2827Yb.a;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public boolean d() {
        return this.e;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public ByteBuffer e() {
        ByteBuffer byteBuffer = this.h;
        this.h = InterfaceC2827Yb.a;
        return byteBuffer;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public void f(ByteBuffer byteBuffer) {
        AbstractC7115ob.f(this.f != null);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int length = ((iLimit - iPosition) / (this.b * 2)) * this.f.length * 2;
        if (this.g.capacity() < length) {
            this.g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.g.clear();
        }
        while (iPosition < iLimit) {
            for (int i : this.f) {
                this.g.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.b * 2;
        }
        byteBuffer.position(iLimit);
        this.g.flip();
        this.h = this.g;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public void flush() {
        this.h = InterfaceC2827Yb.a;
        this.i = false;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public int g() {
        int[] iArr = this.f;
        return iArr == null ? this.b : iArr.length;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public int h() {
        return this.c;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public int i() {
        return 2;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public void j() {
        this.i = true;
    }

    @Override // com.daaw.InterfaceC2827Yb
    public boolean k(int i, int i2, int i3) throws InterfaceC2827Yb.a {
        boolean zEquals = Arrays.equals(this.d, this.f);
        boolean z = !zEquals;
        int[] iArr = this.d;
        this.f = iArr;
        if (iArr == null) {
            this.e = false;
            return z;
        }
        if (i3 != 2) {
            throw new InterfaceC2827Yb.a(i, i2, i3);
        }
        if (zEquals && this.c == i && this.b == i2) {
            return false;
        }
        this.c = i;
        this.b = i2;
        this.e = i2 != iArr.length;
        int i4 = 0;
        while (true) {
            int[] iArr2 = this.f;
            if (i4 >= iArr2.length) {
                return true;
            }
            int i5 = iArr2[i4];
            if (i5 >= i2) {
                throw new InterfaceC2827Yb.a(i, i2, i3);
            }
            this.e = (i5 != i4) | this.e;
            i4++;
        }
    }

    @Override // com.daaw.InterfaceC2827Yb
    public void reset() {
        flush();
        this.g = InterfaceC2827Yb.a;
        this.b = -1;
        this.c = -1;
        this.f = null;
        this.d = null;
        this.e = false;
    }
}
