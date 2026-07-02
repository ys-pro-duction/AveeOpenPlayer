package com.daaw;

import com.daaw.AbstractC4340ei;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.daaw.ao0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3257ao0 extends AbstractC4340ei.h {
    public final ByteBuffer F;

    public C3257ao0(ByteBuffer byteBuffer) {
        AbstractC3317b10.b(byteBuffer, "buffer");
        this.F = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    @Override // com.daaw.AbstractC4340ei
    public void K(byte[] bArr, int i, int i2, int i3) {
        ByteBuffer byteBufferSlice = this.F.slice();
        byteBufferSlice.position(i);
        byteBufferSlice.get(bArr, i2, i3);
    }

    @Override // com.daaw.AbstractC4340ei
    public byte M(int i) {
        return w(i);
    }

    @Override // com.daaw.AbstractC4340ei
    public boolean O() {
        return AbstractC3472bb1.r(this.F);
    }

    @Override // com.daaw.AbstractC4340ei
    public AbstractC9408wm Q() {
        return AbstractC9408wm.i(this.F, true);
    }

    @Override // com.daaw.AbstractC4340ei
    public int R(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.F.get(i4);
        }
        return i;
    }

    @Override // com.daaw.AbstractC4340ei
    public int S(int i, int i2, int i3) {
        return AbstractC3472bb1.u(i, this.F, i2, i3 + i2);
    }

    @Override // com.daaw.AbstractC4340ei
    public AbstractC4340ei V(int i, int i2) {
        try {
            return new C3257ao0(h0(i, i2));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // com.daaw.AbstractC4340ei
    public String Z(Charset charset) {
        byte[] bArrW;
        int length;
        int iArrayOffset;
        if (this.F.hasArray()) {
            bArrW = this.F.array();
            iArrayOffset = this.F.arrayOffset() + this.F.position();
            length = this.F.remaining();
        } else {
            bArrW = W();
            length = bArrW.length;
            iArrayOffset = 0;
        }
        return new String(bArrW, iArrayOffset, length, charset);
    }

    @Override // com.daaw.AbstractC4340ei
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4340ei)) {
            return false;
        }
        AbstractC4340ei abstractC4340ei = (AbstractC4340ei) obj;
        if (size() != abstractC4340ei.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        return obj instanceof C3257ao0 ? this.F.equals(((C3257ao0) obj).F) : obj instanceof YJ0 ? obj.equals(this) : this.F.equals(abstractC4340ei.q());
    }

    @Override // com.daaw.AbstractC4340ei
    public void f0(AbstractC3783ci abstractC3783ci) {
        abstractC3783ci.a(this.F.slice());
    }

    @Override // com.daaw.AbstractC4340ei.h
    public boolean g0(AbstractC4340ei abstractC4340ei, int i, int i2) {
        return V(0, i2).equals(abstractC4340ei.V(i, i2 + i));
    }

    public final ByteBuffer h0(int i, int i2) {
        if (i < this.F.position() || i2 > this.F.limit() || i > i2) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        ByteBuffer byteBufferSlice = this.F.slice();
        byteBufferSlice.position(i - this.F.position());
        byteBufferSlice.limit(i2 - this.F.position());
        return byteBufferSlice;
    }

    @Override // com.daaw.AbstractC4340ei
    public ByteBuffer q() {
        return this.F.asReadOnlyBuffer();
    }

    @Override // com.daaw.AbstractC4340ei
    public int size() {
        return this.F.remaining();
    }

    @Override // com.daaw.AbstractC4340ei
    public byte w(int i) {
        try {
            return this.F.get(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }
}
